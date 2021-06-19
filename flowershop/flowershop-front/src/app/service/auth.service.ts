import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { JWT } from '../model/JWT';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient,
    public router: Router,
  ) { }


  saveToken(token: string, refreshToken: string) {
    var localobj = JSON.parse(localStorage.getItem('user'));

    localStorage.removeItem('user');

    localStorage.setItem('user', JSON.stringify({
      username: localobj.username,
      token: token,
      refreshToken: refreshToken,
      id: localobj.id,
      role: localobj.role
    }));
  }

  login(email: string, password: string): Observable<JWT> {
    return this.http.post<JWT>("http://localhost:8080/api/auth/login", { username: email, password: password });
  }

  logOut(): void {
    localStorage.removeItem('user');
  }

  getId(): number {
    return localStorage.getItem('user') ? JSON.parse(localStorage.getItem('user')).id : 'INVALID';
  }

  isLoggedIn(): boolean {
    return localStorage.getItem('user') !== null;
  }

  getRole(): string {
    return localStorage.getItem('user') ? JSON.parse(localStorage.getItem('user')).role : 'INVALID';
  }

}
