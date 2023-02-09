import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateMedicamentosComponent } from './components/create-medicamentos/create-medicamentos.component';
import { MedicamentosComponent } from './components/medicamentos/medicamentos.component';
import { HttpClientModule } from '@angular/common/http';
import { VentasComponent } from './components/ventas/ventas.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateMedicamentosComponent,
    MedicamentosComponent,
    VentasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
