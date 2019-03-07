import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
user:string;
pwd:string;
  constructor(private router : Router) {
    this.user=localStorage.getItem("empId");
  }
login() {
  if(this.user == localStorage.getItem("empId") && this.pwd == "114"){
    this.router.navigate(["/Dashboard"]);
  } else {
    alert("Invalid Credentials...");
  }
}
  ngOnInit() {
  }

}
