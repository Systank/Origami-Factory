import {NgModule} from '@angular/core';
import {CategorieComponent} from './categorie.component';
import {MatiereDetailComponent} from './matiere-detail.component';
import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {CategorieService} from './categorie.service';
import {CategorieDetailComponent} from './categorie-detail.component';
import {RouterModule, Routes} from '@angular/router';


const routes: Routes = [
  {path: 'categorie', component: CategorieComponent},
  {path: 'categorie/:id', component: CategorieDetailComponent},
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
    CategorieDetailComponent

  ],
  exports: [ ],
})
export class CategorieModule {
}
