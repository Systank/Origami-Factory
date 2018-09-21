import { Component, OnInit } from '@angular/core';
import {Etape} from './etape';
import {EtapeService} from "./etape.service";

@Component({
  selector: 'app-etape',
  templateUrl: './etape.component.html',
  styleUrls: ['./etape.component.css']
})
export class EtapeComponent implements OnInit {

  private formEtape: Etape = null;

  constructor(private etapeService: EtapeService) { }

  ngOnInit() {
  }

  public list() {
    return this.etapeService.findAll();
  }

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
