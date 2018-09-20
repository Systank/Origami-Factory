package la.factory.origami.factory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;




@Entity
@Table
public class Categorie {
	
	@Id
	@GeneratedValue
	@Column(name="categorie_id")
    private Long id;
	@Column(name = "nom", length = 50)
	@NotEmpty(message = "Le nom est obligatoire")
	private String nom;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "categorie_parent_id")
	private Categorie superCat;
	@OneToMany(mappedBy = "superCat", fetch=FetchType.LAZY)
	private List<Categorie> sousCats = new ArrayList<Categorie>();
	@ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
	private List<Origami> origamis = new ArrayList<Origami>();
	
	
	public Categorie() {
		super();
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
		return superCat;
	}






	public void setSuperCat(Categorie superCat) {
		this.superCat = superCat;
	}






	public List<Categorie> getSousCats() {
		return sousCats;
	}






	public void setSousCats(List<Categorie> sousCats) {
		this.sousCats = sousCats;
	}






	public List<Origami> getOrigamis() {
		return origamis;
	}


	public void setOrigamis(List<Origami> origamis) {
		this.origamis = origamis;
	}

	
	
}


