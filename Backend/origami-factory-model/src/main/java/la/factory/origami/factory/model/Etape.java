package la.factory.origami.factory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name = "etape")
public class Etape {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Column(name="numero_etape")
	@JsonView(Views.ViewCommon.class)
	private int numeroEtape;
	@Column(name="description")
	@JsonView(Views.ViewCommon.class)
	private String description;
	@Column(name="image_etape")
	@JsonView(Views.ViewCommon.class)
	private String imageEtape;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "origami_id")
	@JsonView(Views.ViewEtapeDetail.class)
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
