import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proizvod } from '../model/Proizvod';
import { Zahtev } from '../model/Zahtev';

@Injectable({
  providedIn: 'root'
})
export class ZahtevService {

  private headers = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(
    private http: HttpClient
  ) { }

  kreirajZahtev(zahtev: Zahtev): Observable<any> {
    let httpOptions = {};

    console.log(zahtev);

    httpOptions = {
      headers: this.headers,
      observe: 'body',
    };
    
    return this.http.post<Array<Proizvod>>(
      `http://localhost:8080/zahtevi`, 
      zahtev, httpOptions);
  }

}
