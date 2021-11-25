package animalStepDefinitions;
import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NourritureAnimal {
	
	private Nourriture nChien= new Nourriture("croquettes");
	private Nourriture nChat= new Nourriture("souris");
	private Animal chien = new Animal("bobby", "waoufwaouf", nChien);
	private Animal chat = new Animal("choupi", "miaouh", nChat);
	
	@Given("je demande la nourriture dun animal")
	public void je_demande_la_nourriture_d_un_animal() {
		chien = new Animal("bobby", "waoufwaouf", nChien);
		chat = new Animal("choupi", "miaouh", nChat);
	}

	@When("je vois la presentation dun animal")
	public void je_vois_la_presentation_d_un_animal() {
	    chien.nourritureAnimal();
	    chat.nourritureAnimal();
	    
	}

	@Then("son type de nourriture apparait")
	public void son_type_de_nourriture_apparait() {
		chien.nourritureAnimal();
	    chat.nourritureAnimal();
	}

	@When("je clique sur : Que mangetil")
	public void je_clique_sur_Que_mange_t_il() {
	    System.out.println("Que mange t-il?");
	}

	@Then("un message : Cet animal mange avec sa nourriture {string} apparait")
	public void un_message_Cet_animal_mange_avec_sa_nourriture_apparait(String string) {
		chien.nourritureAnimal();
	    chat.nourritureAnimal();
	    System.out.println(string);
	}
}
