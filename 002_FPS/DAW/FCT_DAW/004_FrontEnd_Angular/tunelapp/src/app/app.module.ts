import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { ContactosComponent } from './contactos/contactos.component';
import { AppRoutingModule } from './app-routing.module';

import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ContactoService } from './shared/services/contacto.service';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ContactosComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule


  ],
  providers: [HttpClient,ContactoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
