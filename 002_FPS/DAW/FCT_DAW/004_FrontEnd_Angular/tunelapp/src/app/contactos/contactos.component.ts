import { Component, OnInit } from '@angular/core';
import { ContactoService } from '../shared/services/contacto.service';

@Component({
  selector: 'app-contactos',
  templateUrl: './contactos.component.html',
  styleUrls: ['./contactos.component.css']
})
export class ContactosComponent implements OnInit {

  contactos:any;

  constructor(private contactoService:ContactoService) { }

  ngOnInit(): void {
    this.getCategorias();
  }

  private getCategorias():void{
    this.contactoService.getCategorias().subscribe(
      (data)=>{this.contactos=Object.values(data)[2];
      console.log(this.contactos);
      }
      );
  }

}
