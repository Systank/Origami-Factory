export class Categorie {
  public id: number;
  public nom: string;
  origami: any = ''
  public superCat: Categorie;

  constructor(withParent: boolean = false, id?: number, nom?: string) {
    this.id = id;
    this.nom = nom;
    if (withParent) {
      this.superCat = new Categorie();
    }

  }
}

