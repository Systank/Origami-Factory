import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { EtapeComponent } from './etape/etape.component';
import { CategorieComponent } from './categorie/categorie.component';


@NgModule({
  declarations: [
    AppComponent,
    EtapeComponent
    CategorieComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
