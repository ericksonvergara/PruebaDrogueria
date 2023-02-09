import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MedicamentoServiceService {
url : string = 'http://localhost:5000/apiRest/medicamento/get'
  constructor(private http:HttpClient) { }

  getMedicamentos(){
    return this.http.get(this.url).pipe((response)=>response)
  }
}

