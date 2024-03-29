import { NgModule } from '@angular/core';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { AppRoutingModule } from '../app-routing.module';
import { TunelMapComponent } from './tunelmap/tunelmap.component';

@NgModule({
declarations:[
  FooterComponent,
  HeaderComponent,
  TunelMapComponent,
],
imports:[
  AppRoutingModule

],
exports:[
FooterComponent,
HeaderComponent,
TunelMapComponent

]
})

export class ComponentsModule   {}
