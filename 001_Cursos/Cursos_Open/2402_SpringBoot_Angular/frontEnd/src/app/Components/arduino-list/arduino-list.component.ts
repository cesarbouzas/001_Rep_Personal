import { Component, OnInit } from '@angular/core';
import { Arduino } from '../../Models/Arduino';
import { ArduinoService } from '../../Services/arduino.service';


@Component({
  selector: 'app-arduino-list',
  templateUrl: './arduino-list.component.html',
  styleUrl: './arduino-list.component.css'
})
export class ArduinoListComponent implements OnInit {


arduinos?:Arduino[];

constructor(private arduinoservice:ArduinoService){


};


ngOnInit(): void {
this.findAllBooks();
  };

  private findAllBooks(){
    this.arduinoservice.findAll().subscribe(
    {
      next : value=> {
      this.arduinos=value
      console.log(this.arduinos)
        },

      error: (error: any) =>{
          console.log(error)
        }
      }
    )


  }
}
