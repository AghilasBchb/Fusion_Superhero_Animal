package animalStepDefinitions;
import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CriAnimal {
	
	private Animal a= new Animal("bobby", "waoufwaouf",null);;
	
	@Given("Je demande le cri de mon animal {string}")
	public void je_demande_le_cri_de_mon_animal(String string) {
	   System.out.println(a.getCri());
	}

	@When("Je clique sur Quel est le cri de cet animal")
	public void sharon_clique_sur_Quel_est_le_cri_de_cet_animal() {
		System.out.println("Quel est le cri de cet animal?");
	}

	@Then("le cri de mon animal apparait {string} avec son nom {string}")
	public void le_cri_de_mon_animal_apparait_avec_son_nom(String string, String string2) {
	   System.out.println(a.profilAnimal());
	}

	@Then("un message souvre avec ecrit Le cri nest pas connu")
	public void un_message_s_ouvre_avec_ecrit_Le_cri_n_est_pas_connu() {
	  System.out.println("Le cri n'est pas connu!");
	}

}
