import { Component, OnInit } from '@angular/core';
import { AddressDetails } from 'src/app/model/AddressDetails';
import { FormDataService } from 'src/app/service/form-data.service';

@Component({
  selector: 'app-address-details',
  templateUrl: './address-details.component.html',
  styleUrls: ['./address-details.component.css']
})
export class AddressDetailsComponent implements OnInit {

  addressDetails : AddressDetails;

  constructor(private formDataService : FormDataService) { 
    this.addressDetails = formDataService.addressDetails;
  }

  ngOnInit() {
  }

}
