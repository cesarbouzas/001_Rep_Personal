import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Arduino } from '../Models/Arduino';


const baseUrl='http://localhost:8080/api/distancias';

@Injectable({
  providedIn: 'root'
})


export class ArduinoService {

  constructor(private http:HttpClient) { }

  findAll() :Observable<Arduino[]>{
    return this.http.get<Arduino[]>(baseUrl);

  }
  findById(id:any):Observable<Arduino>{

    return this.http.get(`${baseUrl}/${id}`);
  }
  createArduino(arduino:Arduino):Observable<any>{

    return this.http.post(baseUrl,arduino);
  }
  updateArduino(arduino:Arduino):Observable<Arduino>{
return this.http.put(baseUrl,arduino);

  }
  deleteById(id:any):Observable<any>{
    return this.http.delete(`${baseUrl}/${id}`);

      }
      deleteAll():Observable<any>{
return this.http.delete(baseUrl);
      }
}
