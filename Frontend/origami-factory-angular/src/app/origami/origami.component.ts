import { Component, OnInit } from '@angular/core';
import {OrigamiService} from "./origami.service";
import {Origami} from "./origami";

@Component({
  selector: 'app-origami',
  templateUrl: './origami.component.html',
  styleUrls: ['./origami.component.css']
})
export class OrigamiComponent implements OnInit {

  private formOrigami: Origami = null;

  constructor(private origamiService: OrigamiService) {
  }

  ngOnInit() {
  }

  public list() {
    return this.origamiService.findAll();
  }

  public add() {
    this.formOrigami = new Origami();
  }

  public edit(id: number) {
    this.formOrigami = this.origamiService.findById(id);
  }

  public save() {
    this.origamiService.save(this.formOrigami);
    this.formOrigami = null;
  }

  public delete(id: number) {
    this.origamiService.delete(this.origamiService.findById(id));
  }

}
