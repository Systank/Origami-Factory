import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CategorieService } from './categorie.service';
import {Categorie} from './categorie';


@Component({
  templateUrl: './categorie-detail.component.html',
  styleUrls: ['./categorie-detail.component.css']
})
export class OrigamiDetailComponent implements OnInit {

  private categorie : Categorie= new Categorie();

  constructor(private route: ActivatedRoute, private categorieService: CategorieService ) {
    this.route.params.subscribe(params => {
      console.log(params['id']);
      this.categorieService
        .findById(Number(params['id']), true)
        .subscribe(resp => this.categorie = resp.json());
    });
  }

  
  ngOnInit() {
  }
}
