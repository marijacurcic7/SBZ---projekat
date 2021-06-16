import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Zahtev2Component } from './zahtev2.component';

describe('Zahtev2Component', () => {
  let component: Zahtev2Component;
  let fixture: ComponentFixture<Zahtev2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Zahtev2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Zahtev2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
