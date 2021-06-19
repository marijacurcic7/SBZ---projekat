import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proizvod } from '../model/Proizvod';

@Injectable({
  providedIn: 'root'
})
export class ProizvodService {

  private headers = new HttpHeaders({'Content-Type': 'application/json'});


  constructor(
    private http: HttpClient
  ) { }

  getAllProizvodi(): Observable<Array<Proizvod>> {
    let httpOptions = {};

    httpOptions = {
      headers: this.headers,
      observe: 'body',
    };
    
    return this.http.get<Array<Proizvod>>(
      `http://localhost:8080/proizvodi`, httpOptions);
  }


  kupi(id: number): Observable<any> {
    let httpOptions = {};

    httpOptions = {
      headers: this.headers,
      observe: 'body',
    };
    
    return this.http.post<Observable<any>>(`http://localhost:8080/proizvodi/kupi` + `/${id}`, httpOptions);

  }

}
