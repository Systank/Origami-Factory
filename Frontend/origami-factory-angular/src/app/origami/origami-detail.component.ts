import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { OrigamiService } from './origami.service';
import {Origami} from './origami';


@Component({
  templateUrl: './origami-detail.component.html',
  styleUrls: ['./origami-detail.component.css']
})
export class OrigamiDetailComponent implements OnInit {

  private origami : Origami= new Origami();

  constructor(private route: ActivatedRoute, private origamiService: OrigamiService ) {
    this.route.params.subscribe(params => {
      console.log(params['id']);
      this.origamiService
        .findById(Number(params['id']), true)
        .subscribe(resp => this.origami = resp.json());
    });
  }

  
  ngOnInit() {
  }
}
