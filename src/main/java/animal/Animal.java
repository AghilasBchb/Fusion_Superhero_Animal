package animal;

public class Animal {
	// variables d'instance
	private String nom;
	private String cri;
	private Nourriture nourriture;

	/**
	 * Constructeur d'objets de classe Animal
	 */
	public Animal(String nom, String cri, Nourriture n) {
		// initialisation des variables d'instance
		//assert nom != null;
		//assert cri != null;
		//assert n != null;
		this.nom = nom;
		this.cri = cri;
		this.nourriture = n;
	}

	public Animal(String nom, String cri) {
		// initialisation des variables d'instance
		//assert nom != null;
		//assert cri != null;
		this.nom = nom;
		this.cri = cri;
	}

	public Animal() {
	};

	public Nourriture getNourriture() {
		return nourriture;
	}

	public void setNourriture(Nourriture nourriture) {
		assert nourriture != null;
		this.nourriture = nourriture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		//assert nom != null;
		this.nom = nom;
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		assert cri != null;
		this.cri = cri;
	}

	public String profilAnimal() {
		return "L'animal " + nom + " cri " + cri + ".";
	}

	/**
	 * méthode qui donne le nom de l'animal, son cri et sa nourriture
	 *
	 * @return le nom, le cri et la nourriture de l'animal
	 */
	public String nourritureAnimal() {
		return profilAnimal() + " Cet animal mange: " + this.nourriture.getTypeNourriture() + ".";
	}

}