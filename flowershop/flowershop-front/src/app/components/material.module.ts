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
import { CodemirrorModule } from '@ctrl/ngx-codemirror';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule, NativeDateModule } from '@angular/material/core';
import { NgxMatDatetimePickerModule, NgxMatNativeDateModule, NgxMatTimepickerModule } from '@angular-material-components/datetime-picker';
import { HomeComponent } from './home/home.component';
import { ZahtevComponent } from './zahtev/zahtev.component';
import {MatRadioModule} from '@angular/material/radio';
import { LoginComponent } from './login/login.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { ProizvodiComponent } from './proizvodi/proizvodi.component';
import { GridComponent } from './grid/grid.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ProfilComponent } from './profil/profil.component';


@NgModule({
  declarations: [HomeComponent, ZahtevComponent,
    LoginComponent, ToolbarComponent, ProizvodiComponent, GridComponent, ProfilComponent ],

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
    CodemirrorModule,
    MatProgressSpinnerModule,
    MatNativeDateModule,
    NgxMatDatetimePickerModule,
    NgxMatTimepickerModule,
    NgxMatNativeDateModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatRadioModule,
    FlexLayoutModule
  ],
  providers: [
    MatDatepickerModule,
  ],
})
export class MaterialModule { }
