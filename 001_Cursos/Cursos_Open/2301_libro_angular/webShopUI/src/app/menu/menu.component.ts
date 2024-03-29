import { Component, OnInit } from "@angular/core";
import { Libro } from "../Model/libro";
import { Categoria } from "../Model/categoria";
import { CategoriasService } from "../services/categorias.service";



@Component({
  selector:'app-menu',
  templateUrl:'./menu.component.html',
  styleUrls:['./menu.component.css'],
  providers:[CategoriasService]//indico los servicos que voy a usar
})

export class MenuComponent implements OnInit{



categorias:any;

filtro:Libro=new Libro(null,null,null,null,null,null,null,null,null);
mensaje:string="";
selectedCategoria:Categoria=null;

//constructor con los servicios a emplear como instancia privada , no necesito saber como funciona el constructor del servicio (nada de new...)

constructor(private categoriasService:CategoriasService){};

buscarCategoriaOnClick(){

  if(this.filtro.titulo!=='' && this.filtro.titulo!==null){
    this.mensaje="";
  }else{
    this.mensaje="Introduzca el valor que desea buscar";
  }
}
categoriaOnClick(categoria:Categoria){

  this.selectedCategoria=categoria;
}
ngOnInit(): void {
   this.obtenerCategorias();
}
 private obtenerCategorias():void{
  this.categoriasService.getCategorias().subscribe(
    (data)=>{
      this.categorias=data;

    },//respuesta correcta
    (error)=>{


    },//respuesta error
    ()=>{

    }
  )
}
}
