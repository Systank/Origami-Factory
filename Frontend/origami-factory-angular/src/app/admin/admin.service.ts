import {Injectable} from '@angular/core';
import {Http} from '@angular/http';

import {AppConfigService} from '../app-config.service';
import {Admin} from "./admin";

@Injectable()
export class AdminService {
  admins: Array<Admin> = new Array<Admin>();
  apiUrl = '';

  constructor(private http: Http, private appConfig: AppConfigService) {
    this.apiUrl = appConfig.apiUrl + 'admin/';

    this.http
      .get(this.apiUrl)
      .subscribe(resp => this.admins = resp.json());
  }

  public findAll() {
    return this.admins;
  }

  public findById(id: number, http?: boolean): any {
    if (http) {
      return this.http
        .get(this.apiUrl + id);
    }

    for (const admin of this.admins) {
      if (admin.id === id) {
        return admin;
      }
    }

    return null;
  }

  public save(admin: Admin) {
    if (admin) {
      if (!admin.id) {

        if (this.admins.length > 0) {
          admin.id = this.admins[this.admins.length - 1].id + 1;
        } else {
          admin.id = 1;
        }


        this.http
          .post(this.apiUrl, admin)
          .subscribe(
            resp => this.admins.push(admin),
            err => console.log(err)
          );


      } else {
        this.http
          .put(this.apiUrl + admin.id, admin)
          .subscribe(
            resp => null,
            err => console.log(err)
          );
      }
    }
  }

  public delete(admin: Admin) {
    const pos: number = this.admins.indexOf(admin);

    this.http
      .delete(this.apiUrl + admin.id)
      .subscribe(
        resp => this.admins.splice(pos, 1),
        err => console.log(err)
      );
  }
}
