import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  nombre:string="César";
  apellidos:string="Bouzas Soto";
  fechaNacimiento:Date=new Date(1977,6,4);
  ahora:Date=new Date();
  edad=this.ahora.getTime()-this.fechaNacimiento.getTime();
  empresa:string="Desempleado";


  disambledInput:boolean=false;
  usarioRegistrado:boolean=false;

  getRegistroUsario(){
    this.usarioRegistrado=true;
  }


  constructor() { }

  ngOnInit(): void {
  }

}
