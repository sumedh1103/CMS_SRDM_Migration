import { TestBed } from '@angular/core/testing';

import { ExpFeeHeadService } from './exp-fee-head.service';

describe('ExpFeeHeadService', () => {
  let service: ExpFeeHeadService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExpFeeHeadService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
