import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { Router } from '@angular/router';
// import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {
employ : Observable<Employee>;
empno:number;
  constructor(private employeeService : EmployeeService, private _router : Router) {
// this.empno = this.route.snapshot.params["empId"];
this.empno = parseInt(localStorage.getItem("empId"));
this.employ = employeeService.searchEmployee(this.empno);
   }
   history() {
    this._router.navigate(["/leavehistory"]);
  }
  apply() {
    this._router.navigate(["/applyleave"]);
  }
  pending() {
    this._router.navigate(["/pending"]);
  }
  ngOnInit() {
  }

}
