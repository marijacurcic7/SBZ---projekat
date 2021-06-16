import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatButtonModule } from '@angular/material/button';
import { RouterModule } from '@angular/router';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatTableModule } from '@angular/material/table';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatDialogModule } from '@angular/material/dialog';
import { HomeComponent } from './home/home.component';
import { ZahtevComponent } from './zahtev/zahtev.component';
import {MatRadioModule} from '@angular/material/radio';
import { Zahtev2Component } from './zahtev2/zahtev2.component';


@NgModule({
  declarations: [HomeComponent, ZahtevComponent, Zahtev2Component, ],
  imports: [
    CommonModule,
    MatToolbarModule,
    MatButtonModule,
    RouterModule,
    MatIconModule,
    MatCardModule,
    MatFormFieldModule,
    FormsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatSnackBarModule,
    MatTableModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatCheckboxModule,
    MatDialogModule,
    MatRadioModule
  ],
  providers: [
    MatDatepickerModule,
  ],
})
export class ComponentsModule { }