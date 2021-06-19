import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Kupac } from 'src/app/model/Kupac';
import { Kupovina } from 'src/app/model/Kupovina';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {
  korisnik: Kupac;
  dataSource: MatTableDataSource<Kupovina>;
  displayedColumns: string[] = ['naziv', 'cena'];

  constructor(
    private userService: UserService
  ) { }

  ngOnInit(): void {
    this.userService.getUserDetails().subscribe(
      result => {
        console.log(result);
        this.korisnik = result;
      },
      err => {
        console.log(err);
      }
    )

    this.userService.getKupovine().subscribe(
      result => {
        console.log(result);
        this.dataSource = new MatTableDataSource(result);
      },
      err => {
        console.log(err);
      }
    )
  }

}
