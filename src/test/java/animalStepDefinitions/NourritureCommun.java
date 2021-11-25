package animalStepDefinitions;

import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NourritureCommun {

	private Nourriture n = new Nourriture(null, null);

	@Given("je demande la liste des animaux qui mange un type de nourriture commun")
	public void je_demande_la_liste_des_animaux_qui_mange_un_type_de_nourriture_commun() {

	}

	@When("la liste danimaux est vide")
	public void la_liste_danimaux_est_vide() {
		// a faire
	}

	@Then("un message derreur apparait a la liste est vide")
	public void un_message_d_erreur_apparait_la_liste_est_vide() {
		System.out.println("La liste est vide!");
	}

	@Then("La nourriture en commun de ces animaux saffiche {string}")
	public void la_nourriture_en_commun_de_ces_animaux(String string) throws Exception {
		n.queMangentTils();
	}

}
