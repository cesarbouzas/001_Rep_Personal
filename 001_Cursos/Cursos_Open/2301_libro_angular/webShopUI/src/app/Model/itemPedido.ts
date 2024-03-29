export class ItemPedido{

id:number;
idPedido:number;
idLibro:number;
titulo:string;
precio:number;
unidades:number;

constructor(id:number,idPedido:number,idLibro:number,titulo:string,precio:number,unidades:number){
  this.id=id;
  this.idPedido=idPedido;
  this.idLibro=idLibro;
  this.titulo=titulo;
  this.precio=precio;
  this.unidades=unidades;
}


}
