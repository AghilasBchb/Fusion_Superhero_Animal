package animal;

import java.util.ArrayList;
import java.util.Objects;

public class Nourriture {

	private String typeNourriture;
	private ArrayList<Animal> listAnimal;

	/**
	 * Constructeur d'objets de classe Nourriture avec une liste déjà existante
	 */
	public Nourriture(String typeNourriture, ArrayList<Animal> listAnimal) {
		// initialisation des variables d'instance
		//assert typeNourriture != null;
		//assert listAnimal != null;
		this.typeNourriture = typeNourriture;
		this.listAnimal = listAnimal;
	}

	/**
	 * Constructeur d'objets de classe Nourriture avec une liste vide
	 */
	public Nourriture(String typeNourriture) {
		// initialisation des variables d'instance
		//assert typeNourriture != null;
		this.typeNourriture = typeNourriture;
		this.listAnimal = new ArrayList<Animal>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(listAnimal, typeNourriture);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nourriture other = (Nourriture) obj;
		return Objects.equals(listAnimal, other.listAnimal) && Objects.equals(typeNourriture, other.typeNourriture);
	}

	/**
	 * Cette méthode retourne le type de nourriture commun à la liste des animaux
	 *
	 * @return le type de nourriture
	 * @throws Exception
	 */
	public String queMangentTils() throws Exception {
		if (listAnimal.isEmpty()) {
			throw new Exception("Il n'y a pas d'animaux");
		}
		String affichage = "Les animaux: " + listAnimal.get(0).getNom();
		for (int i = 1; i < listAnimal.size(); i++) {
			affichage = affichage + ", " + listAnimal.get(i).getNom();
		}
		return affichage + " mange(nt) cette nourriture: " + this.typeNourriture + ".";
	}

	public String getTypeNourriture() {
		return this.typeNourriture;

	}

	public void setTypeNourriture(String typeNourriture) {
		assert typeNourriture != null;
		this.typeNourriture = typeNourriture;
	}

	public ArrayList<Animal> getListAnimal() {
		return listAnimal;
	}

	public void setListAnimal(ArrayList<Animal> listAnimal) {
		assert listAnimal != null;
		this.listAnimal = listAnimal;
	}

	/**
	 * Cette méthode permet d'ajouter un animal à la liste
	 *
	 */
	public void addAnimal(Animal animal) {
		assert animal != null;
		if (!listAnimal.contains(animal)) {
			if (animal.getNourriture() != null) {
				animal.getNourriture().removeAnimal(animal);
			}
			listAnimal.add(animal);
		}
	}

	/**
	 * Cette méthode permet de supprimer un animal de la liste
	 *
	 */
	public void removeAnimal(Animal animal) {
		assert animal != null;
		listAnimal.remove(animal);
	}

	/**
	 * Cette méthode permet d'ajouter un animal à la liste
	 *
	 */
	public String jeVeuxVoirLesAnimaux() {
		return salutCestNous();
	}

	private String salutCestNous() {
		String affichage = listAnimal.get(0).profilAnimal() + " Cet animal mange: "
				+ listAnimal.get(0).getNourriture().getTypeNourriture() + ".";
		for (int i = 1; i < listAnimal.size(); i++) {
			affichage = affichage + ", " + listAnimal.get(i).profilAnimal() + " Cet animal mange: "
					+ listAnimal.get(i).getNourriture().getTypeNourriture() + ".";
		}
		return affichage;
	}

}