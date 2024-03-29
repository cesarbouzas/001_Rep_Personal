import { ItemCesta } from "./itemCesta";

export class cesta{
localizador:string;
estado:string;
items:ItemCesta[];
fecha:Date;
totalUnidades:number;
totalPrecio:number;

constructor(localizador:string,estado:string,items:ItemCesta[],fecha:Date,totalUnidades:number,totalPrecio:number){
this.localizador=localizador;
this.estado=estado;
this.items=items;
this.fecha=fecha;
this.totalUnidades=totalUnidades;
this.totalPrecio=totalPrecio;
}

}
