import { TestBed, inject } from '@angular/core/testing';

import { LeaveDetailsService } from './leave-details.service';

describe('LeaveDetailsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LeaveDetailsService]
    });
  });

  it('should be created', inject([LeaveDetailsService], (service: LeaveDetailsService) => {
    expect(service).toBeTruthy();
  }));
});
