import { Mensaje } from "./mensaje"

export class Respuesta{

  datos:any;
  mansajes:Mensaje[];


  constructor(datos:any,mensajes:Mensaje[]){
    this.datos=datos;
    this.mansajes=mensajes;
  }
}
