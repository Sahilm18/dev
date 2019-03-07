import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable } from 'rxjs';
import { LeaveDetails } from './leave-details';

@Injectable()
export class LeaveDetailsService {

  constructor(private http : Http) { }

  getHistory(empId : string): Observable<LeaveDetails[]> {
    return this.http.get
    ("http://localhost:8080/FTP114/api/leavedetails/history/"+empId)
    .map((res : Response) => res.json());
  }

  getPendingLeaves(empId : number): Observable<LeaveDetails[]> {
    return this.http.get
    ("http://localhost:8080/FTP114/api/leavedetails/pending/"+empId)
    .map((res : Response) => res.json());
  }

  getLeaves(levId : number): Observable<LeaveDetails> {
    return this.http.get("http://localhost:8080/FTP114/api/leavedetails/leave/" +levId)
    .map((res : Response) => res.json());
  }

  approveDeny(empId : number, status : string, leaveDetails : LeaveDetails): Observable<string> {
    return this.http.post("http://localhost:8080/FTP114/api/leavedetails/approveDeny/" + empId + "/" + status, leaveDetails)
    .map((res : Response) => res.text());
  }

  applyLeave(empId : number, leaveDetails : LeaveDetails): Observable<string> {
    return this.http.post("http://localhost:8080/FTP114/api/leavedetails/applyLeave/" + empId, leaveDetails)
    .map((res : Response) => res.text());
  }
}
