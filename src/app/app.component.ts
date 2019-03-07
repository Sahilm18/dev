import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ EmployeeService ]
})
export class AppComponent implements OnInit {


  title = 'Leave Management Application';
  
  

  ngOnInit(): void {

  }
}

