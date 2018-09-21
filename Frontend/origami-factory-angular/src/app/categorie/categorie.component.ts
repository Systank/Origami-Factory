import {Component, OnInit} from '@angular/core';import {CategorieService} from './categorie.service';
import {Categorie} from './categorie';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {

  private formCategorie: Categorie = null;

  constructor(private categorieService: CategorieService) {
  }

  ngOnInit() {
  }

  public list() {
    return this.categorieService.findAll();
  }

  public add() {
    this.formCategorie = new Categorie();
  }

  public edit(id: number) {
    this.formCategorie = this.categorieService.findById(id);
  }

  public save() {
    this.categorieService.save(this.formCategorie);
    this.formCategorie = null;
  }

  public delete(id: number) {
    this.categorieService.delete(this.categorieService.findById(id));
  }
}
