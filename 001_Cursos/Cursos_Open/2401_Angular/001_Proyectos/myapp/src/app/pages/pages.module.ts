import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ComponentsModule } from '../components/components.module';
import { SobreMiComponent } from './sobreMi/sobreMi.component';
import { NotFoundComponent } from './notFound/notFound.component';
import { IotComponent } from './iot/iot.component';
import { TunelMapComponent } from '../components/tunelmap/tunelmap.component';



@NgModule({
  declarations: [
  SobreMiComponent,
  NotFoundComponent,
  IotComponent
  ],
  imports: [
    CommonModule,
    ComponentsModule
  ],
  exports: [
    SobreMiComponent,
    NotFoundComponent,
    IotComponent
  ],
})
export class PagesModule { }
