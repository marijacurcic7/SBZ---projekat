import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddressDetailsComponent } from './components/address-details/address-details.component';
import { GridComponent } from './components/grid/grid.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { MultiformComponent } from './components/multiform/multiform.component';
import { PersonalDetailsComponent } from './components/personal-details/personal-details.component';
import { ProfilComponent } from './components/profil/profil.component';
import { ProizvodiComponent } from './components/proizvodi/proizvodi.component';
import { ZahtevComponent } from './components/zahtev/zahtev.component';



const routes: Routes = [
  // { path : '',   component : PersonalDetailsComponent }, 
  // { path : 'addressdetails',   component : AddressDetailsComponent }, 
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
        path: 'grid',
        component: GridComponent
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
