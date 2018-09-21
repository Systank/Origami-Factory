import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {OrigamiModule} from './origami/origami.module';
import {RouterModule, Routes} from '@angular/router';
import {AppConfigService} from './app-config.service';
import {CategorieModule} from './categorie/categorie.module';
import {EtapeModule} from "./etape/etape.module";

const routes: Routes = [];

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule,
    RouterModule.forRoot(routes),
    EtapeModule,
    CategorieModule,
    OrigamiModule
  ],
  providers: [AppConfigService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
