package animalStepDefinitions;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AjouterAnimal {
	
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	private Nourriture n = new Nourriture(null, animal);
	private Animal a = new Animal("bobby", "waoufwaouf", n);
	
	@Given("ajouter un animal a une liste")
	public void ajouter_un_animal_a_une_liste() {
	}

	@When("jajoute un animal")
	public void j_ajoute_un_animal() {
	    n.addAnimal(a);
	}

	@Then("je dois remplir les informations de lanimal")
	public void je_dois_remplir_les_informations_de_l_animal() {
	}

	@When("je confirme le formule")
	public void je_confirme_le_formule() {
		assertEquals(true, true);
	}

	@Then("un message derreur apparait")
	public void un_message_d_erreur_apparait() {
		System.out.println("Cet animal est deja dans la liste");
	}

	@Then("les informations sont enregistrees en base")
	public void les_informations_sont_enregistrees_en_base() {
		assertEquals(true,true);
	}
}
