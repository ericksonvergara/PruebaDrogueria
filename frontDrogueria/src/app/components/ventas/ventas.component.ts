import { Component, OnInit } from '@angular/core';
import { VentasService } from './ventas.service';

@Component({
  selector: 'app-ventas',
  templateUrl: './ventas.component.html',
  styleUrls: ['./ventas.component.css']
})
export class VentasComponent implements OnInit {
ventas: any[] = []
  constructor(private ventasServices:VentasService) { }

  ngOnInit(): void {
    this.getVentas();
  }

  getVentas(){
    this.ventasServices.getVentas().subscribe((response:any) =>{
      console.log("ventas", response.ventas);

      if(response.ventas){
        this.ventas = response.ventas;
      }else{

      }
    })
    }

}
