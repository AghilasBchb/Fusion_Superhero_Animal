package animalStepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;

import animal.*;


public class TypeNourriture {
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	private Nourriture n = new Nourriture(null, animal);
	
	@Given("je demande le type de nourriture dun animal {string}")
	public void je_demande_le_type_de_nourriture_d_un_animal(String string) {
	    System.out.println("Quel est le type de nourriture de cet animal" + string + "?");
	}

	@When("je clique sur : Tu veux savoir son type de nourriture")
	public void je_clique_sur_Tu_veux_savoir_son_type_de_nourriture() {
	}

	@Then("un message avec le type de nourriture de lanimal apparait {string}")
	public void un_message_avec_le_type_de_nourriture_de_l_animal_apparait(String string) {
	    n.getTypeNourriture();
	}

	@Then("une popup souvre avec ecrit : Information manquante")
	public void une_popup_s_ouvre_avec_ecrit_Information_manquante() {
	    System.out.println("Informations manquantes");
	}
}
