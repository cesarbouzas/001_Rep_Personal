import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule}  from '@angular/forms'
import { AppComponent } from './app.component';

import {HttpClientModule} from '@angular/common/http';
import { CategoriasService } from './services/categorias.service';

import {HeaderComponent} from './header/header.component';
import { MenuComponent } from './menu/menu.component';
import { FooterComponent } from './footer/footer.component';
import { PortadaComponent } from './portada/portada.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MenuComponent,
    FooterComponent,
    PortadaComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule//para que pueda ser utilizado por todos los componentes del modulo
  ],
  providers: [CategoriasService],//Para que puda ser utilizado por toda la aplicacion
  bootstrap: [AppComponent]
})
export class AppModule { }
