import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MedicamentosComponent } from './components/medicamentos/medicamentos.component';
import { VentasComponent } from './components/ventas/ventas.component';

const routes: Routes = [
  {path:'medicamentos',component:MedicamentosComponent},
  {path:'ventas',component:VentasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
