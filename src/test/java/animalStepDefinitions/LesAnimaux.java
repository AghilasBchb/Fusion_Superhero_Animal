package animalStepDefinitions;

import java.util.ArrayList;

import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LesAnimaux {
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	private Nourriture n = new Nourriture("eau", animal);
	private Nourriture nChien = new Nourriture("croquettes");
	private Nourriture nChat = new Nourriture("souris");
	private Animal chien = new Animal("bobby", "waoufwaouf", nChien);
	private Animal chat = new Animal("choupi", "miaouh", nChat);

	@Given("je demande la liste des animaux avec leurs nourritures")
	public void je_demande_la_liste_des_animaux_avec_leurs_nourritures() {
		animal.add(chien);
		animal.add(chat);
	}

	@When("je clique sur : Tu veux connaitre la liste des animaux avec leur type de nourriture respective")
	public void je_clique_sur_Tu_veux_connaitre_la_liste_des_animaux_avec_leur_type_de_nourriture_respective() {
	}

	@Then("on a la liste des animaux avec le type de nourriture quil mange respectivement")
	public void on_a_la_liste_des_animaux_avec_le_type_de_nourriture_qu_il_mange_respectivement() {
		n.jeVeuxVoirLesAnimaux();
	}

	@Then("on a le message :La liste est vide")
	public void on_a_le_message_La_liste_est_vide() {
		animal.isEmpty();
	}

}
