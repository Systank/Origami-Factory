package la.factory.origami.factory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;




@Entity
@Table
public class Categorie {
	
	@Id
	@GeneratedValue
    private Long id;
	@Column(name = "nom", length = 50)
	@NotEmpty(message = "Le nom est obligatoire")
	private String nom;
	@Column(name = "Categorie", length = 100)
	private Categorie SuperCat;
	@ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
	private List<Origami> origamis = new ArrayList<Origami>();
	
	
	public Categorie() {
		super();
	}
	


	public Categorie(String nom, Categorie superCat) {
		super();
		this.nom = nom;
		SuperCat = superCat;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Categorie getSuperCat() {
		return SuperCat;
	}


	public void setSuperCat(Categorie superCat) {
		SuperCat = superCat;
	}


	public List<Origami> getOrigamis() {
		return origamis;
	}


	public void setOrigamis(List<Origami> origamis) {
		this.origamis = origamis;
	}

	
	
}


