import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {

  employees: any[] = []

  constructor() { 
    // let dataService = new DataService;
    // this.employees = dataService.getEmployee()
  }

  ngOnInit(): void {
  }

}
