import { Component, OnInit } from '@angular/core';
import { Observable }from 'rxjs';
import { LeaveDetailsService }from"../leave-details.service";
import {Router} from '@angular/router';
import { Employee }from "../employee";
import { LeaveDetails }from"../leave-details";
import { EmployeeService }from"../employee.service";

// import { LeaveHistory } from './leave-history';



@Component({
  selector: 'app-leave-pending',
  templateUrl: './leave-pending.component.html',
  styleUrls: ['./leave-pending.component.css']
})
export class LeavePendingComponent implements OnInit {
edata :Observable<Employee[]>;
  employ : Observable<LeaveDetails[]>;
  empno : number;
  order : string = 'levStartDate';
  reverse : boolean = true;

  sempno : string = 'empID';
  rever : boolean = false;
  flag:boolean;
  show(levId,empId) {
  localStorage.setItem("levId",levId);
  localStorage.setItem("lEmpId",empId);
  this.flag=true;
  }

  constructor(private leaveDetailsService: LeaveDetailsService, private employeeService: EmployeeService,
              private _router : Router) {
    this.empno = parseInt(localStorage.getItem("empId"));
    this.employ = leaveDetailsService.getPendingLeaves(this.empno);
    this.edata = employeeService.getEmployee();
    this.flag=false;
  }

  appDen() {
    this._router.navigate(["/appDen"]);
      }

  setOrder(value: string) {
    if(this.order === value) {
      this.reverse = !this.reverse;
    }

    this.order = value;
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
  dashboard(){
    this._router.navigate(["/Dashboard"]);
  }
  ngOnInit() {
  }

}