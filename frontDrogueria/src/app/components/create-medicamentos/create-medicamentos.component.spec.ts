import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateMedicamentosComponent } from './create-medicamentos.component';

describe('CreateMedicamentosComponent', () => {
  let component: CreateMedicamentosComponent;
  let fixture: ComponentFixture<CreateMedicamentosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateMedicamentosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateMedicamentosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
