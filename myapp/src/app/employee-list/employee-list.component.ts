import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees = [

    { code: 'emp101', name: 'Mathew', gender: 'Male', salary: 4000, dateOfBirth: '12/12/2000' },
    { code: 'emp102', name: 'Mark', gender: 'Male', salary: 4000, dateOfBirth: '12/12/2000' },
    { code: 'emp103', name: 'Luke', gender: 'Male', salary: 4000, dateOfBirth: '12/12/2000' },
    { code: 'emp104', name: 'John', gender: 'Male', salary: 4000, dateOfBirth: '12/12/2000' },
    { code: 'emp105', name: 'Mary', gender: 'Female', salary: 4000, dateOfBirth: '12/12/2000' }

  ]

  constructor() { 
    // let dataService = new DataService();
    // this.employees = dataService.getEmployee()
  }

  ngOnInit(): void {
  }

}
