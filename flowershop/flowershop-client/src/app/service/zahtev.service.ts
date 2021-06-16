// import { HttpClient, HttpHeaders } from '@angular/common/http';
// import { Injectable } from '@angular/core';
// import { Observable } from 'rxjs';
// import { Zahtev } from '../model/Zahtev';

// @Injectable({
//   providedIn: 'root'
// })
// export class ZahtevService {

//   private headers = new HttpHeaders({'Content-Type': 'application/json'});

//     constructor(
//         private http: HttpClient
//     ) { }

//     kreirajZahtev(zahtev: Zahtev): Observable<Zahtev> {
//       let httpOptions = {};

//       httpOptions = {
//         headers: this.headers,
//         observe: 'body',
//       };
      
//       return this.http.post<Zahtev>(
//         `http://localhost:8080/zahtev1`, 
//         zahtev, httpOptions);
//     }

// }
