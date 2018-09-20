package la.factory.origami.factory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "origami")
public class Origami {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "name")
	private String nom;
	@Column(name = "time_to_do")
	private String tempsRea;
	@Column(name = "nb_sheet")
	private int nbFeuille;
	
	@Column(name = "level")
	@Enumerated(EnumType.STRING)
	private Niveau niveau;
	@Column(name = "note")
	private float note;
	@Column(name = "active")
	private boolean actif;
	@Column(name = "youtube_link")
	private String youtube;
	@Column(name = "picture_link")
	private String imageOri; 
	
	
	private List<Etape> etapes = new ArrayList<Etape>();
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
