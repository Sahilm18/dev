import { Component, OnInit } from '@angular/core';
import { Observable }from 'rxjs';
import { LeaveDetailsService } from"../leave-details.service";
import { EmployeeService }from"../employee.service";
import {Router} from '@angular/router';

import { LeaveDetails }from"../leave-details";
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-apply-leave',
  templateUrl: './apply-leave.component.html',
  styleUrls: ['./apply-leave.component.css']
})
export class ApplyLeaveComponent implements OnInit {
  leav : Observable<LeaveDetails>;
  empno : number;
  obj : LeaveDetails;
  msg : String;
  isValidFormSubmitted : boolean;
  // inValidFormSubmitted : boolean;

  
  constructor(private leaveDetailsService: LeaveDetailsService,
    private employeeService: EmployeeService,
    private _router : Router) 
    {
this.empno = parseInt(localStorage.getItem("empId"));
this.obj = new LeaveDetails();
alert("Employ ID " +this.empno);

 }
 calculateDays() {
  let date1: string=this.obj.levStartDate.toString();
  let date2: string=this.obj.levEndDate.toString();
  let diffInMs: number = Date.parse(date2) - Date.parse(date1);
  let diffInHours: number = diffInMs / 1000 / 60 / 60/24;
  this.obj.levNoOfDays=diffInHours + 1;
  
 // alert(diffInHours);
  //console.log(diffInHours);

  //alert("Event Fired");
 }
apply(form : NgForm)
{
      this.isValidFormSubmitted=false;
    if(form.invalid){
      alert("Invalid");
     return; 
  }  
    console.log ('end date component' + this.obj.levEndDate);
    this.leaveDetailsService.applyLeave(this.empno,this.obj).subscribe(
        success => {
            this.msg=success;
        },
        err => { 
            this.msg=err;
            console.log(err);
        }
    )
    this.isValidFormSubmitted = true;
    setTimeout(() => {
      this._router.navigate(['/Dashboard'])
    }, 10000);
}
cancel() {
  this._router.navigate(["/Dashboard"]);
}
history() {
  this._router.navigate(["/leavehistory"]);
}
applyL() {
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