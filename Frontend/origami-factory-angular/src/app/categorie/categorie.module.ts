import {NgModule} from '@angular/core';
import {CategorieComponent} from './categorie.component';
import {RouterModule, Routes} from '@angular/router';

import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {CategorieService} from './categorie.service';
import {CategorieDetailComponent} from './categorie-detail.component';
import {CategorieFilleComponent} from './categorie-fille.component';



const routes: Routes = [
  {path: 'categorie', component: CategorieComponent},
  {path: 'categorie/:id', component: CategorieDetailComponent},
  {path: 'categorie/fille/:id', component: CategorieFilleComponent},
];

@NgModule({
  imports: [
    RouterModule.forChild(routes),
    BrowserModule,
    FormsModule,
    HttpModule,
  ],
  providers: [
    CategorieService,


  ],
  declarations: [

    CategorieComponent,
    CategorieDetailComponent,
    CategorieFilleComponent


  ],
  exports: [ ],
})
export class CategorieModule {
}
