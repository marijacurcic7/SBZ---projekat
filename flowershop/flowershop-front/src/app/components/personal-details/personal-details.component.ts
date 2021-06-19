import { Component, OnInit } from '@angular/core';
import { PersonalDetails } from 'src/app/model/PersonalDetails';
import { FormDataService } from 'src/app/service/form-data.service';

@Component({
  selector: 'app-personal-details',
  templateUrl: './personal-details.component.html',
  styleUrls: ['./personal-details.component.css']
})
export class PersonalDetailsComponent implements OnInit {

  personalDetails : PersonalDetails;

  constructor(private formDataService : FormDataService) { 
    this.personalDetails = formDataService.personalDetails;
  }

  ngOnInit() {
  }

}
