import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Kupac } from '../model/Kupac';
import { Kupovina } from '../model/Kupovina';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private headers = new HttpHeaders({'Content-Type': 'application/json'});


  constructor(
    private http: HttpClient
  ) { }

  getUserDetails(): Observable<Kupac> {
    let httpOptions = {};

    httpOptions = {
      headers: this.headers,
      observe: 'body',
    };
    
    return this.http.get<Kupac>(
      `http://localhost:8080/korisnik`, httpOptions);
  }


  getKupovine(): Observable<Array<Kupovina>> {
    let httpOptions = {};

    httpOptions = {
      headers: this.headers,
      observe: 'body',
    };
    
    return this.http.get<Array<Kupovina>>(
      `http://localhost:8080/korisnik/kupovine`, httpOptions);
  }

}
