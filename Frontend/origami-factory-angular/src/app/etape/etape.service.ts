import { Injectable } from '@angular/core';
import {Etape} from "./etape";
import {Http} from "@angular/http";
import {AppConfigService} from "../app-config.service";
import {Origami} from "../origami/origami";

@Injectable()
export class EtapeService {
  apiUrl: string;
  etapes: Array<Etape> = new Array<Etape>();
  etapesOfOrgiami: Array<Etape> = new Array<Etape>();
  origamiOfEtape: Array<Origami> = new Array<Origami>();
  filtre: number;


  constructor(private http: Http, private appConfig: AppConfigService) {
    this.apiUrl = appConfig.apiUrl + 'etape/';

    this.http
      .get(this.apiUrl)
      .subscribe(resp => this.etapes = resp.json(),
        err => console.log(err));
    this.http
      .get(this.appConfig.apiUrl + 'origami/')
      .subscribe(resp => this.origamiOfEtape = resp.json(),
        err => console.log(err));
  }

  public findAll(filtre?: number) {
    if (!filtre) {
      return this.etapes;
  } else {
      this.findByOrigami(filtre);
      return this.etapes;
    }
  }

  public findAllOri() {
    return this.origamiOfEtape;
  }



  public findById (id: number) {
    for (const etape of this.etapes) {
      if (etape.id === id) {
        return etape;
      }
    }
  }
  public findByOrigami(id: number) {
      this.http
        .get(this.apiUrl + 'origami/' + id)
      .subscribe(resp => this.etapesOfOrgiami = resp.json(),
        err => console.log(err));

      return this.etapesOfOrgiami;
    }

  public save(etape: Etape) {
    if (etape) {
      if (!etape.id) {
        this.http
          .post(this.apiUrl, etape)
          .subscribe(resp => this.etapes.push(resp.json()),
            err => console.log(err));
      } else {
        this.http
          .put(this.apiUrl + etape.id, etape)
          .subscribe();
      }
    }
  }

  public delete(etape: Etape) {
    const pos: number = this.etapes.indexOf(etape);

    this.http
      .delete(this.apiUrl + etape.id)
      .subscribe(resp => this.etapes.splice(pos, 1),
        err => console.log(err));
  }
  }


