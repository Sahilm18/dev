import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employee : Observable<Employee[]>
  // empId : string;
  // empMgrId  :string;
  constructor(private employeeService : EmployeeService,private router : Router) {
    this.employee = employeeService.getEmployee();
    // this.empId = "empId";
    // this.empMgrId ="empMgrId";
   }
   login( empId,empMgrId ) {
     localStorage.setItem("empId",empId);
     localStorage.setItem("empMgrId",empMgrId);
     this.router.navigate(["/Login"]);
   }

  ngOnInit() {
  }

}