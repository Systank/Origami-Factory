export class Categorie {
  public id: number;
  public nom: string;
  origami: any = ''
  public superCat: Categorie;
  constructor(id?: number, nom?: string) {
    this.id = id;
    this.nom = nom;


  }
}

