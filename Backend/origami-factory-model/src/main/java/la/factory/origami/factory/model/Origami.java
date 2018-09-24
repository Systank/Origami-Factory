package la.factory.origami.factory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name = "origami")
public class Origami {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Column(name = "name")
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Column(name = "time_to_do")
	@JsonView(Views.ViewCommon.class)
	private String tempsRea;
	@Column(name = "nb_sheet")
	@JsonView(Views.ViewCommon.class)
	private int nbFeuille;
	
	@Column(name = "level")
	@Enumerated(EnumType.STRING)
	@JsonView(Views.ViewCommon.class)
	private Niveau niveau;
	@Column(name = "note")
	@JsonView(Views.ViewCommon.class)
	private float note;
	@Column(name = "active")
	@JsonView(Views.ViewCommon.class)
	private boolean actif;
	@Column(name = "youtube_link")
	@JsonView(Views.ViewCommon.class)
	private String youtube;
	@Column(name = "picture_link")
	@JsonView(Views.ViewCommon.class)
	private String imageOri; 
	
	@OneToMany(mappedBy = "origami", fetch=FetchType.EAGER)
	@JsonView(Views.ViewOrigamiDetail.class)
	private List<Etape> etapes = new ArrayList<Etape>();
	@ManyToMany
	@JoinTable(name = "origami_categorie", joinColumns = @JoinColumn(name = "origami_id"), inverseJoinColumns = @JoinColumn(name = "categorie_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"origami_id", "categorie_id" }))
	@JsonView(Views.ViewOrigami.class)
	private List<Categorie> categories = new ArrayList<Categorie>();
	
	
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
	public String getTempsRea() {
		return tempsRea;
	}
	public void setTempsRea(String tempsRea) {
		this.tempsRea = tempsRea;
	}
	public int getNbFeuille() {
		return nbFeuille;
	}
	public void setNbFeuille(int nbFeuille) {
		this.nbFeuille = nbFeuille;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}
	public String getImageOri() {
		return imageOri;
	}
	public void setImageOri(String imageOri) {
		this.imageOri = imageOri;
	}
	
	public List<Etape> getEtapes() {
		return etapes;
	}
	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}
	public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	
	
	
	
}
