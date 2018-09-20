package la.factory.origami.factory.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Categorie {
	@Id
	@GenerateValue
	@JsonView(Views.ViewCommon.class)

	private Long id;
	private String nom;
	private Categorie SuperCat;
	private List<Origami> origamis = new ArrayList<>();

}
