import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Categorie} from './categorie';
import {AppConfigService} from '../app-config.service';

@Injectable()
export class CategorieMereService {
  categories: Array<Categorie> = new Array<Categorie>();
  apiUrl = '';

  constructor(private http: Http, private appConfig: AppConfigService) {
    this.apiUrl = appConfig.apiUrl + 'categorie/mere/';

    this.http
      .get(this.apiUrl)
      .subscribe(resp => this.categories = resp.json());
  }

  public findAll() {
    return this.categories;
  }

  public findById(id: number, http?: boolean): any {
    if (http) {
      return this.http
        .get(this.apiUrl + id);
    }

    for (const categorie of this.categories) {
      if (categorie.id === id) {
        return categorie;
      }
    }

    return null;
  }

  public save(categorie: Categorie) {
    if (categorie) {
      if (!categorie.id) {

        if (this.categories.length > 0) {
          categorie.id = this.categories[this.categories.length - 1].id + 1;
        } else {
          categorie.id = 1;
        }


        this.http
          .post(this.apiUrl, categorie)
          .subscribe(
            resp => this.categories.push(categorie),
            err => console.log(err)
          );


      } else {
        this.http
          .put(this.apiUrl + categorie.id, categorie)
          .subscribe(
            resp => null,
            err => console.log(err)
          );
      }
    }
  }

  public delete(categorie: Categorie) {
    const pos: number = this.categories.indexOf(categorie);

    this.http
      .delete(this.apiUrl + categorie.id)
      .subscribe(
        resp => this.categories.splice(pos, 1),
        err => console.log(err)
      );
  }
}
