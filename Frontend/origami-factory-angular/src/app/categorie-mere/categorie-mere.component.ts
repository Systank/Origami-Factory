import {Component, OnInit} from '@angular/core';
import {CategorieMereService} from './categorie-mere.service';
import {Categorie} from './categorie';


@Component({
  selector: 'app-categorie',
  templateUrl: './categorie-mere.component.html',
  styleUrls: ['./categorie-mere.component.css']
})
export class CategorieMereComponent implements OnInit {

  private formCategorie: Categorie = null;

  constructor(private categorieService: CategorieMereService) {
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
  public cancel() {
    this.formCategorie = null;
  }
}
