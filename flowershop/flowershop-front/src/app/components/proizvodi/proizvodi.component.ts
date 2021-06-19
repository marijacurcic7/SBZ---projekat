import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatTableDataSource } from '@angular/material/table';
import { Observable } from 'rxjs';
import { Proizvod } from 'src/app/model/Proizvod';
import { ProizvodService } from 'src/app/service/proizvod.service';

@Component({
  selector: 'app-proizvodi',
  templateUrl: './proizvodi.component.html',
  styleUrls: ['./proizvodi.component.css']
})
export class ProizvodiComponent implements OnInit {
  dataSource: MatTableDataSource<Proizvod>;
  proizvodi: Array<Proizvod>

  obs: Observable<any> | undefined;

  constructor(
    private proizvodService: ProizvodService,
    private _snackBar: MatSnackBar
  ) { 
    this.dataSource = new MatTableDataSource<Proizvod>();
  }

  ngOnInit(): void {
    this.proizvodService.getAllProizvodi().subscribe(
      result => {
        this.proizvodi = result;
        console.log(this.proizvodi);
        this.dataSource = new MatTableDataSource<Proizvod>(this.proizvodi);
        this.obs = this.dataSource.connect();
      },
      err => {
        console.log(err);
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
