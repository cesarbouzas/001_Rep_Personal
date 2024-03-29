import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PersonasComponent } from './views/personas/personas.component';
import { PersonaComponent } from './views/personas/persona/persona.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonasComponent,
    PersonaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
