import { Component, OnInit } from '@angular/core';
import {Etape} from './etape';
import {EtapeService} from "./etape.service";
import {OrigamiService} from "../origami/origami.service";

@Component({
  selector: 'app-etape',
  templateUrl: './etape.component.html',
  styleUrls: ['./etape.component.css']
})
export class EtapeComponent implements OnInit {

  private formEtape: Etape = null;
  public filtre: number;
public valeur: any;

  constructor(private etapeService: EtapeService, private origamiService: OrigamiService) { }

  ngOnInit() {
  }

  public list(filtre?: number) {
    return this.etapeService.findAll(filtre);
  }

  // public filtreur() {
  //   this.filtre = this.valeur;
  // }
  //
  // public listOri() {
  //   return this.etapeService.findAllOri();
  // }

  public add() {
    this.formEtape = new Etape();
  }

  public edit(id: number) {
    this.formEtape = this.etapeService.findById(id);
  }

  public save() {
    this.etapeService.save(this.formEtape);
    this.formEtape = null;
  }

  public delete(id: number) {
    this.etapeService.delete(this.etapeService.findById(id));
  }

  public cancel() {
    this.formEtape = null;
  }
}
