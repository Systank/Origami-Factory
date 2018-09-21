import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {EtapeComponent} from "./etape.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import {EtapeService} from "./etape.service";


const routes: Routes = [
  {path: 'etape', component: EtapeComponent}
]

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forChild(routes),
  ],
  declarations: [ EtapeComponent],

  providers: [EtapeService, ]
})
export class EtapeModule { }
