import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { HttpModule } from '@angular/http';
import {RouterModule, Routes} from '@angular/router';
import { LoginComponent } from './login/login.component';
import {FormsModule} from '@angular/forms';
import { EmployeeComponent } from './employee/employee.component';
import { LeaveHistoryComponent } from './leave-history/leave-history.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EmployComponent } from './employ/employ.component';
import { ManagerComponent } from './manager/manager.component';
import { LeavePendingComponent } from './leave-pending/leave-pending.component';
import { ApproveDenyComponent } from './approve-deny/approve-deny.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { FilterdataPipe } from './filterdata.pipe';
import { SortdataPipe } from './sortdata.pipe';
import { LeaveDetailsService } from './leave-details.service';


const data:Routes=[
  {path:'Login',component:LoginComponent},
  {path:'',component:EmployeeComponent},
  {path:'Dashboard',component : DashboardComponent},
  {path:'applyleave',component : ApplyLeaveComponent},
  {path:'appDen',component : ApproveDenyComponent},
  {path:'leavehistory',component : LeaveHistoryComponent},
  {path:'applyleave',component : ApplyLeaveComponent},
  {path:'pending',component : LeavePendingComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    EmployeeComponent,
    LeaveHistoryComponent,
    DashboardComponent,
    EmployComponent,
    ManagerComponent,
    LeavePendingComponent,
    ApproveDenyComponent,
    ApplyLeaveComponent,
    FilterdataPipe,
    SortdataPipe
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(data)
  ],
  providers: [LeaveDetailsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
