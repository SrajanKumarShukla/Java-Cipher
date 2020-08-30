import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeadlinesDetailsComponent } from './headlines-details.component';

describe('HeadlinesDetailsComponent', () => {
  let component: HeadlinesDetailsComponent;
  let fixture: ComponentFixture<HeadlinesDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeadlinesDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeadlinesDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
