import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LeavePendingComponent } from './leave-pending.component';

describe('LeavePendingComponent', () => {
  let component: LeavePendingComponent;
  let fixture: ComponentFixture<LeavePendingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LeavePendingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LeavePendingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
