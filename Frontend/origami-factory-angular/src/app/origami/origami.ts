import {Etape} from "../etape/etape";
import {Categorie} from "../categorie/categorie";

export class Origami {
  public id: number;
  public nom: string;
  public tempsRea: string;
  public nbFeuille: number;
  public niveau: string;
  public note: string;
  public actif: boolean;
  public youtube: string;
  public imageOri: string;
  public etapes: Array<Etape>;
  public categories: Array<Categorie>;


}
