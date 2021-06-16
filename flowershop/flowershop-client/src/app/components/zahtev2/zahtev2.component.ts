import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Zahtev } from 'src/app/model/Zahtev';

@Component({
  selector: 'app-zahtev2',
  templateUrl: './zahtev2.component.html',
  styleUrls: ['./zahtev2.component.css']
})
export class Zahtev2Component implements OnInit {

  zahtevForm!: FormGroup;
  submitionError: boolean = false;
  zahtev: Zahtev = new Zahtev();

  motivi: string[] = [
    'porodica',
    'prijateljstvo',
    'ljubav',
    'postovanje',
    'zahvalnost',
  ];
  
  constructor(
    private fb: FormBuilder,
    private router: Router
  ) { 
    this.zahtevForm = this.fb.group({
      'motiv': [''],
      'datum': [''],
    });
  }

  ngOnInit(): void {
  }

}
