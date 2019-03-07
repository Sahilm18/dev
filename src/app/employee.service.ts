import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Employee } from "./employee";
import 'rxjs/add/operator/map';


@Injectable()
export class EmployeeService {

  constructor(private http:Http) {
   } 
   getEmployee(): Observable<Employee[]> {
     return this.http.get
     ("http://localhost:8080/FTP114/api/employees")
     .map((res:Response) => res.json()); }
    searchEmployee(empId : number): Observable<Employee> {
      return this.http.get("http://localhost:8080/FTP114/api/employees/" +empId)
      .map((res:Response) => res.json());
 }
}