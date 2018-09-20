package la.factory.origami.factory.model;

public enum Niveau {
	Niv1("Occasionnel"), Niv2("Normal"), Niv3("Avancé"), Niv4("Expert");

	private final String label;

	private Niveau(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
