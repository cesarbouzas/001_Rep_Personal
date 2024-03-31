import {NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SobreMiComponent } from './pages/sobreMi/sobreMi.component';
import { NotFoundComponent } from './pages/notFound/notFound.component';
import { IotComponent } from './pages/iot/iot.component';




const routes: Routes = [
  {path:'sobreMi',component:SobreMiComponent},
  {path:'iot',component:IotComponent},
  {path:'',component:NotFoundComponent},
  {path: '***', component:NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
