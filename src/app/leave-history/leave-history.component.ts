import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { LeaveDetails } from '../leave-details';
import { LeaveDetailsService } from '../leave-details.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-leave-history',
  templateUrl: './leave-history.component.html',
  styleUrls: ['./leave-history.component.css']
})
export class LeaveHistoryComponent implements OnInit {
  empNo : string;
  leavedetails : Observable<LeaveDetails[]>;

  constructor(private leaveDetailsService : LeaveDetailsService, private _router : Router) { 
    this.empNo = localStorage.getItem("empId")
    this.leavedetails = leaveDetailsService.getHistory(this.empNo);
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
