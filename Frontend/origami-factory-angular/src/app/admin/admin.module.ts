import {NgModule} from '@angular/core';


import {RouterModule, Routes} from '@angular/router';

import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {AdminService} from './admin.service';
import {AdminDetailComponent} from './admin-detail.component';
import {AdminComponent} from './admin.component';




const routes: Routes = [
  {path: 'admin', component: AdminComponent},
  {path: 'admin/:id', component: AdminDetailComponent},
];

@NgModule({
  imports: [
    RouterModule.forChild(routes),
    BrowserModule,
    FormsModule,
    HttpModule,
  ],
  providers: [
    AdminService,


  ],
  declarations: [

    AdminComponent,
    AdminDetailComponent

  ],
  exports: [ ],
})
export class AdminModule {
}
