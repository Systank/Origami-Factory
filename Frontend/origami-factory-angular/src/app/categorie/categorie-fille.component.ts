import {Component, OnInit} from '@angular/core';
import {CategorieService} from './categorie.service';
import {Categorie} from './categorie';
import {forEach} from "@angular/router/src/utils/collection";
import {ActivatedRoute} from "@angular/router";


@Component({
  selector: 'app-categorie-fille',
  templateUrl: './categorie-fille.component.html',
  styleUrls: ['./categorie-fille.component.css']
})
export class CategorieFilleComponent implements OnInit {

  private formCategorie: Categorie = null;
  private idMere : number;
  private categoriesFilles: Array<Categorie> = null;
  constructor(private categorieService: CategorieService,private route: ActivatedRoute) {
    this.route.params.subscribe(params => {
      this.idMere = params['id']
    });
  }

  ngOnInit() {
  }

  public list() {
    this.categorieService.findAll().forEach(function (c : Categorie){
      if (c.superCat) {
        if (c.superCat.id === this.idMere) {
          this.categoriesFilles.push(c)
        }
      }
      }
    )
    return this.categoriesFilles;
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

