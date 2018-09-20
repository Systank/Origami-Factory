package la.factory.origami.factory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etapes")
public class Etape {

	@Id
	@GeneratedValue
	private Long id;
	private int numeroEtape;
	private String description;
	private String imageEtape;
	private Origami origami;

	public Etape() {
		super();
	}

	public Etape(int numeroEtape, String description, String imageEtape) {
		super();
		this.numeroEtape = numeroEtape;
		this.description = description;
		this.imageEtape = imageEtape;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroEtape() {
		return numeroEtape;
	}

	public void setNumeroEtape(int numeroEtape) {
		this.numeroEtape = numeroEtape;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageEtape() {
		return imageEtape;
	}

	public void setImageEtape(String imageEtape) {
		this.imageEtape = imageEtape;
	}

	public Origami getOrigami() {
		return origami;
	}

	public void setOrigami(Origami origami) {
		this.origami = origami;
	}	
	
}
