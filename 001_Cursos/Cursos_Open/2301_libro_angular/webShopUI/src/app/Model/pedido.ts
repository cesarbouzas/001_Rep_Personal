import { ItemPedido } from "./itemPedido";

export class Pedido{
idPedido:number;
localizador:string;
estado:string;
fecha:Date;
nombre:string;
apellidos:string;
telefono:number;
email:string;
direccion:string;
comentario:string;
items:ItemPedido[];
totalUnidades:number;
totalPrecio:number;

constructor (idPedido:number,localizador:string,estado:string,fecha:Date,
  nombre:string,apellidos:string,telefono:number,email:string,direccion:string,comentario:string,
  items:ItemPedido[],totalUnidades:number,totalPrecio:number){
    this.idPedido=idPedido;
    this.localizador=localizador;
    this.estado=estado;
    this.fecha=fecha;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.telefono=telefono;
    this.email=email;
    this.direccion=direccion;
    this.comentario=comentario;
    this.items=items;
    this.totalUnidades=totalUnidades;
    this.totalPrecio=totalPrecio;


  }

}
