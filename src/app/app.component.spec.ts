import { TestBed, async } from '@angular/core/testing';
import { Http } from '@angular/http';
import { MockBackend } from '@angular/http/testing';

import { AppComponent } from './app.component';

import { Employee } from './employee';
import { EmployeeService } from './employee.service';

class MockEmployeeService {
  getEmployees(): Promise<Employee[]> {
    console.log('Mock getEmployees called');
    return Promise.resolve([new Employee(1000), new Employee(2000)]);
  }
}

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ]
    }).overrideComponent(AppComponent, {
      set: {
        providers: [
          {provide: EmployeeService, useClass: MockEmployeeService }
        ]
      }
    }).compileComponents();
  }));


  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));

  it(`should have as title 'app'`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('Leave Management Application');
  }));

  it('should render title in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to Leave Management Application!');
  }));

  it('should render one employee record', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    fixture.whenStable().then(() => {
      fixture.detectChanges();
      const compiled = fixture.debugElement.nativeElement;
      expect(compiled.querySelectorAll('.employees tr').length).toBe(2);
    });
  }));
});
