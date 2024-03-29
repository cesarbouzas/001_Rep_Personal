import { Injectable } from '@angular/core';

import {HttpClient,HttpHeaders} from "@angular/common/http"//Clase/servicio que permite la conexion a una APi REST via http
import { Observable } from 'rxjs';
import { Categoria } from "../Model/categoria";

import { Respuesta } from '../Model/respuesta';

@Injectable({
  providedIn:'root'
})
export class CategoriasService{


private categoriasUrl:string='http://localhost:33333/category/category?columns=cat_name,cat_description';
 httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'Basic ' + btoa('demo:demouser')
  })
};



  constructor(private httpClient:HttpClient){};//inyeccion del servicio HttpClient mendiante instancia privada en el constructor

  public getCategorias():Observable<any>{
    return this.httpClient.get<any>(this.categoriasUrl,this.httpOptions);

}
}
