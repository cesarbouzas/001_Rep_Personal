import { Component, OnInit } from '@angular/core';

import { IotDataService } from '../../services/iot-data.service';

@Component({
  selector: 'app-iot',
  templateUrl: './iot.component.html',
  styleUrl: './iot.component.css'
})
export class IotComponent implements OnInit{
  tables = ['111', '112', '100', '211', '212',
           '121', '122', '200', '221', '222',
           '131', '132', '300', '321', '322'];
dataByTable:{[nombreTabla:string]:any[]}={}


constructor(){

}
ngOnInit():void{
// this.loadTableData();
}
//   loadTableData():void {
//     this.tables.forEach(nombreTabla=>{
//       this.iotdata.getDataFromTable(nombreTabla).subscribe(
//         data=>{
//           this.dataByTable[nombreTabla]=data
//         },
//         error=>{
//         console.error('Error cargando dataos de tabala ${nombreTabla}:',error);
//         }
//         );
//     });
//   }
 }
