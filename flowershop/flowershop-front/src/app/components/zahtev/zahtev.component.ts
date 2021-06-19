import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { connectableObservableDescriptor } from 'rxjs/internal/observable/ConnectableObservable';
import { Proizvod } from 'src/app/model/Proizvod';
import { Zahtev } from 'src/app/model/Zahtev';
import { ProizvodService } from 'src/app/service/proizvod.service';
import { ZahtevService } from 'src/app/service/zahtev.service';

interface Razlog {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-zahtev',
  templateUrl: './zahtev.component.html',
  styleUrls: ['./zahtev.component.css']
})
export class ZahtevComponent implements OnInit {
  // @Input() formContent: any;
  // @Output() readonly formSubmit: EventEmitter<any> = new EventEmitter<any>();

  zahtevForm!: FormGroup;
  submitionError: boolean = false;
  zahtev!: Zahtev;
  proizvodi: Array<Proizvod>;
  dataSource: MatTableDataSource<Proizvod>;
  obs: Observable<any> | undefined;
  zahtevCard: boolean;

  activeStepIndex: number;
  motiv: boolean;
  datum: boolean;
  currentFormContent: Array<any>;
  formData: any;
  formFields: Array<Array<string>>;
  masterFormFields: Array<string>;
  stepItems: Array<any>;
  masterForm: Array<FormGroup>;


  razlozi: Razlog[] = [
    {value: 'vencanje', viewValue: 'vencanje/svadba'},
    {value: 'rodjendan', viewValue: 'rodjendan'},
    {value: 'Dan zena', viewValue: 'Dan zena'},
    {value: 'pomen', viewValue: 'sahrana/pomen'},
    {value: 'slava', viewValue: 'krstenje/slava'},
    {value: 'poseta', viewValue: 'poseta bolesnoj osobi'},
    {value: 'dom', viewValue: 'poseta/dom'},
    {value: 'ostalo', viewValue: 'ostalo'},
  ];

  motivi: string[] = [
    'porodica',
    'prijateljstvo',
    'ljubav',
    'postovanje',
    'zahvalnost',
  ];

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private zahtevService: ZahtevService,
    private proizvodService: ProizvodService,
    private _snackBar: MatSnackBar
  ) { 
    this.zahtevForm = this.fb.group({
      'cena': [''],
      'razlog': [''],
      'motiv': [''],
      'datum': ['']
    });
  }

  ngOnInit(): void {

    this.activeStepIndex = 0;
    this.motiv = false;
    this.datum = true;
    this.zahtevCard = true;

  }

  next(): void {
    console.log("next!");

    this.zahtev = new Zahtev();

    let cena = this.zahtevForm.controls['cena'].value;
    console.log(cena);
    if(cena == 1) {
      this.zahtev.minCena = 0;
      this.zahtev.maxCena = 2000;
    }
    else if(cena == 2) {
      this.zahtev.minCena = 2000;
      this.zahtev.maxCena = 5000;
    }
    else if(cena == 3){
      this.zahtev.minCena = 5000;
      this.zahtev.maxCena = 10000;
    }
    else {
      this.zahtev.minCena = 10000;
      this.zahtev.maxCena = Infinity;
    }
    console.log(this.zahtev.maxCena)

    this.zahtev.razlogKupovine = this.zahtevForm.controls['razlog'].value;
    console.log(this.zahtev.razlogKupovine);

    if(this.zahtev.razlogKupovine == "ostalo" || this.zahtev.razlogKupovine == "rodjendan"){
      this.motiv = true;
      this.datum = true;
    }
    else if(this.zahtev.razlogKupovine == "Dan zena"){
      this.motiv = true;
      this.datum = false;
    }
    else{
      this.motiv = false;
      this.datum = true;
    }

    this.activeStepIndex = 1;
  }

  prev(): void {
    this.activeStepIndex = 0;
  }

  onSubmit(): void {
    console.log("submit!");

    this.zahtev.motiv = this.zahtevForm.controls['motiv'].value;
    console.log(this.zahtev.motiv);

    this.zahtev.datum = this.zahtevForm.controls['datum'].value;
    console.log(this.zahtev.datum);

    if(this.zahtev.razlogKupovine == "Dan zena"){
      this.zahtev.datum = new Date("2021-03-08");
    }

    // this.router.navigate(['/zahtev2'])

    console.log(this.zahtev.razlogKupovine);


    this.zahtevService.kreirajZahtev(
      this.zahtev, 
    ).subscribe(
      result => {
        this.proizvodi = result;
        console.log(this.proizvodi);
        this.zahtevCard = false;
        this.activeStepIndex = 2;
        this.dataSource = new MatTableDataSource<Proizvod>(this.proizvodi);
        this.obs = this.dataSource.connect();
      },
      err => {
        this.submitionError = true;
      }
    )
  }

  kupi(proizvodId: number): void {
    console.log("kupi");
    console.log(proizvodId);

    this.proizvodService.kupi(proizvodId).subscribe(
      result => {
        console.log(result);
        this._snackBar.open(`Uspesno ste kupili proizvod`, 'Close', {
          duration: 4000,
        });
      },
      err => {
        console.log(err);
      }
    )
  }

}
