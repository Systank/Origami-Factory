import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';


import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {OrigamiComponent} from "./origami.component";
import {OrigamiService} from "./origami.service";



const routes: Routes = [
  {path: 'origami', component: OrigamiComponent}

];

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forChild(routes)
  ],
  declarations: [
    OrigamiComponent
  ],
  providers: [OrigamiService]
})
export class OrigamiModule { }
