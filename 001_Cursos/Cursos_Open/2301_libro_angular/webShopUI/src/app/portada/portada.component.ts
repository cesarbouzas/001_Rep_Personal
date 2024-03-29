import { style } from "@angular/animations";
import { Component } from "@angular/core";

@Component({
  selector:'app-portada',
  templateUrl:'./portada.component.html',
  styleUrls:['./portada.component.css']

})

export class PortadaComponent{
mensaje:string="Bienvenido a la webShop de César";
}
