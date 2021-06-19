import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { ProfilComponent } from './components/profil/profil.component';
import { ProizvodiComponent } from './components/proizvodi/proizvodi.component';
import { ZahtevComponent } from './components/zahtev/zahtev.component';



const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    children: [
      {
        path: 'login',
        component: LoginComponent,
        // canActivate: [LoginGuard]
      },
      {
        path: 'izbor-cveca',
        component: ZahtevComponent
      },
      {
        path: 'svi-proizvodi',
        component: ProizvodiComponent
      },
      {
        path: 'profil',
        component: ProfilComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
