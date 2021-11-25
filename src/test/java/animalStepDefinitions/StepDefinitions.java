package animalStepDefinitions;

import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private Animal a = new Animal("bobby", "waoufwaouf", null);

	@Given("je demande le nom de animal")
	public void je_demande_le_nom_de_animal() {
		a.getNom();
	}

	@When("je clique sur Tu veux savoir son nom")
	public void je_clique_sur_Tu_veux_savoir_son_nom() {
		System.out.println("Tu veux savoir mon nom?");
	}

	@Then("le nom de lanimal apparait {string}")
	public void le_nom_de_lanimal_apparait(String string) {
		System.out.println(string);
	}

	@Given("je demande le nom dun animal {string}")
	public void je_demande_le_nom_dun_animal(String string) {
		System.out.println(string);
	}

	@Then("un message Pas de nom apparait")
	public void un_message_Pas_de_nom_apparait() {
		System.out.println("Cet animal n'a pas de nom!");
	}
}