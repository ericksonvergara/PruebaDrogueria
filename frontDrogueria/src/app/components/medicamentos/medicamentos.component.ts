import { Component, OnInit } from '@angular/core';
import { MedicamentoServiceService } from './medicamento-service.service';

@Component({
  selector: 'app-medicamentos',
  templateUrl: './medicamentos.component.html',
  styleUrls: ['./medicamentos.component.css']
})
export class MedicamentosComponent implements OnInit {

  medicamentos:any[] = [];

  constructor(private medicamentoService:MedicamentoServiceService) { }

  ngOnInit(): void {
    this.getMedicamento();
  }
getMedicamento(){
this.medicamentoService.getMedicamentos().subscribe((response:any)=>{
  if(response.Medicamentos){
    this.medicamentos = response.Medicamentos;
  }else{

  }
})
}
}
