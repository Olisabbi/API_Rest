import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; 

import { AppRoutingModule } from './app-routing.module';
import { PaisesComponent } from './paises.component';


@NgModule({
  declarations: [
    PaisesComponent, PaisesComponent ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [PaisesComponent]
})
export class AppModule { }
