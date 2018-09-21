import { Component, OnInit } from '@angular/core';
import {Etape} from './etape';
import {EtapeService} from "./etape.service";

@Component({
  selector: 'app-etape',
  templateUrl: './etape.component.html',
  styleUrls: ['./etape.component.css']
})
export class EtapeComponent implements OnInit {

  private FormEtape: Etape = null;

  constructor(private etapeService: EtapeService) { }

  ngOnInit() {
  }

}
