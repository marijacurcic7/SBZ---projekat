import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ZahtevComponent } from './components/zahtev/zahtev.component';
import { Zahtev2Component } from './components/zahtev2/zahtev2.component';

const routes: Routes = [
  { 
    path: '', 
    component: HomeComponent,
    children: [
      {
        path: 'zahtev',
        component: ZahtevComponent
      },
      {
        path: 'zahtev2',
        component: Zahtev2Component
      },
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
