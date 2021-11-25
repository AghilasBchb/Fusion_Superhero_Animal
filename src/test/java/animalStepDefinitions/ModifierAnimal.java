package animalStepDefinitions;

import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModifierAnimal {
	private Animal a;

	@Given("je veux modifier le nom de mon animal")
	public void je_veux_modifier_le_nom_de_mon_animal() {
		a = new Animal("bobby", "waoufwaouf", null);
	}

	@When("je clique sur Modifier le nom de cet animal {string}")
	public void je_clique_sur_Modifier_le_nom_de_cet_animal(String string) {
		System.out.println("Modifier le nom de cet animal" + string);
	}

	@Then("une pop up permettant de modifier le nom souvre")
	public void une_pop_up_permettant_de_modifier_le_nom_s_ouvre() {
		System.out.println("Tu peux maintenant modifier le nom");
	}

	@Given("je modifie le nom de mon animal")
	public void je_modifie_le_nom_de_mon_animal() {
		a = new Animal("bobby", "waoufwaouf", null);
		a.setNom("bob");
	}

	@When("jenregistre le nouveau nom")
	public void jenregistre_le_nouveau_nom() {

	}

	@Then("le nom est enregistre en bdd")
	public void le_nom_est_enregistre_en_bdd() {
	    System.out.println("Le nom a ete modifie !");
	}

}
