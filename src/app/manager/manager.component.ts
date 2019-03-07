import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {
  employ:Observable<Employee>;
  empno:number;
  empMgrId:number;

  constructor(private employeeService : EmployeeService,private _router : Router) { 
    this.empno= parseInt(localStorage.getItem("empMgrId"));
    this.employ=employeeService.searchEmployee(this.empno);
  }

  ngOnInit() {
  }

}
