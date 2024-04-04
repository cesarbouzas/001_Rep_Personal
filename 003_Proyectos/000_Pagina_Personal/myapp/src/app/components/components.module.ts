import { NgModule } from '@angular/core';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { AppRoutingModule } from '../app-routing.module';
import { TunelMapComponent } from './tunelmap/tunelmap.component';
import { OficinaMapComponent } from './oficinamap/oficinamap.component';

@NgModule({
declarations:[
  FooterComponent,
  HeaderComponent,
  TunelMapComponent,
  OficinaMapComponent
],
imports:[
  AppRoutingModule

],
exports:[
FooterComponent,
HeaderComponent,
TunelMapComponent,
OficinaMapComponent

]
})

export class ComponentsModule   {}
