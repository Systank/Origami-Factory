import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {AppComponent} from './app.component';
import {OrigamiModule} from './origami/origami.module';
import {RouterModule, Routes} from '@angular/router';
import {AppConfigService} from './app-config.service';
import {CategorieModule} from './categorie/categorie.module';
import {CategorieMereModule} from './categorie-mere/categorie-mere.module';
//import {CategorieFilleModule} from './categorie-fille/categorie-fille.module';
import {AdminModule} from './admin/admin.module';
import {EtapeModule} from "./etape/etape.module";
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';


const routes: Routes = [];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule,
    RouterModule.forRoot(routes),
    EtapeModule,
    CategorieModule,
    CategorieMereModule,
    //CategorieFilleModule,
    OrigamiModule,
    AdminModule
  ],
  providers: [AppConfigService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
