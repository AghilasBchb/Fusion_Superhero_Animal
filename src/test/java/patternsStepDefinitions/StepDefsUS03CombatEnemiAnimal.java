package patternsStepDefinitions;

import static org.junit.Assert.*;

import animal.Animal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import patternsFusion.AnimalAdapter;
import superheros.Ennemi;

public class StepDefsUS03CombatEnemiAnimal {

	private Animal chien;
	private Ennemi cyboborg;
	private AnimalAdapter ad;
	private int animalPower, ennemiStrength;

	@Given("un ennemi de {int}")
	public void un_ennemi_de_force(Integer int1) {
		this.cyboborg = new Ennemi(int1);
		this.ennemiStrength = int1;
	}

	@Given("un animal appele {string} et son cri {string}")
	public void un_Animal(String n, String c) {
		this.chien = new Animal(n, c);
	}

	@When("lennemi et lanimal sappretent au combat")
	public void Ennemi_Animal() {
		this.ad = new AnimalAdapter(chien);
		this.animalPower = ad.getPower();
		this.cyboborg.setOpponent(ad);
		// automatiquement l'ennemi sera ajouté à la liste d'ennemis du
		// l'animal(adapter)
	}

	@Then("le plus fort gagnera ennemiVSanimal")
	public void le_plus_fort_gagnera() {
		if (this.animalPower > this.ennemiStrength) {
			assertFalse(cyboborg.attack(ad));
		}

		else {
			assertTrue(cyboborg.attack(ad));
		}
	}

	@Then("lennemi nest plus relie a lanimal et vice versa")
	public void lennemi_nest_plus_relie_a_lanimal_et_vice_versa() {
		assertFalse(ad.isEnnemi(cyboborg));
		assertNull(cyboborg.getOpponent());
	}

}
