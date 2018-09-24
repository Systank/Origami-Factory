import {NgModule} from '@angular/core';
import {CategorieMereComponent} from './categorie-mere.component';
import {RouterModule, Routes} from '@angular/router';

import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {CategorieMereService} from './categorie-mere.service';




const routes: Routes = [
  {path: 'categorie-mere', component: CategorieMereComponent},

];

@NgModule({
  imports: [
    RouterModule.forChild(routes),
    BrowserModule,
    FormsModule,
    HttpModule,
  ],
  providers: [
    CategorieMereService,


  ],
  declarations: [

    CategorieMereComponent,


  ],
  exports: [ ],
})
export class CategorieMereModule {
}
