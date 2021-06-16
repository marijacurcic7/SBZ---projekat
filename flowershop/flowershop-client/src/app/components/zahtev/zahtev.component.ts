import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Zahtev } from 'src/app/model/Zahtev';
// import { ZahtevService } from 'src/app/service/zahtev.service';

@Component({
  selector: 'app-zahtev',
  templateUrl: './zahtev.component.html',
  styleUrls: ['./zahtev.component.css']
})
export class ZahtevComponent implements OnInit {

  zahtevForm!: FormGroup;
  submitionError: boolean = false;
  zahtev!: Zahtev;

  razlozi: string[] = [
    'venacnje',
    'rodjendan',
    'Dan zena',
    'pomen',
    'poseta',
    'slava/krstenje',
    'dom',
    'ostalo'
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
    // private zahtevService: ZahtevService,
  ) { 
    this.zahtevForm = this.fb.group({
      'cena': [''],
      'razlog': [''],
      'motiv': [''],
      'datum': ['']
    });
  }

  ngOnInit(): void {
  }

  onSubmit(): void {
    console.log("submit!")

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

    this.zahtev.razlog = this.zahtevForm.controls['razlog'].value;
    console.log(this.zahtev.razlog);

    this.zahtev.motiv = this.zahtevForm.controls['motiv'].value;
    console.log(this.zahtev.motiv);

    this.zahtev.datum = this.zahtevForm.controls['datum'].value;
    console.log(this.zahtev.datum);

    // this.router.navigate(['/zahtev2'])

    // this.zahtevService.kreirajZahtev(
    //   this.zahtev, 
    // ).subscribe(
    //   result => {
    //     let zahtev = result;
    //   },
    //   err => {
    //     this.submitionError = true;
    //   }
    // )
  }

}
