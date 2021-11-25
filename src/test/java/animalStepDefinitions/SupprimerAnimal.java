package animalStepDefinitions;
import animal.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupprimerAnimal {
	
	private Nourriture n = new Nourriture(null);
	private Animal a = new Animal();
	
	@Given("je veux supprimer un animal")
	public void je_veux_supprimer_un_animal() {
	}

	@When("je demande a supprimer un animal")
	public void je_demande_a_supprimer_un_animal() {
		n.removeAnimal(a);
	}

	@Then("un message de confirmation apparait")
	public void un_message_de_confirmation_apparait() {
	    System.out.println("Voulez-vous supprimer cet animal?");
	}

	@Then("les informations sont supprimes en base")
	public void les_informations_sont_supprimes_en_base() {
	}
}
