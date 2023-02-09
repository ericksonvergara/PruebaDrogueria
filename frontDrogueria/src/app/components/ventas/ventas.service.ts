import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VentasService {

  url : string = 'http://localhost:5000/apiRest/venta/get'
  constructor(private http:HttpClient) { }

  getVentas(){
    return this.http.get(this.url).pipe((response)=>response)
  }
}
