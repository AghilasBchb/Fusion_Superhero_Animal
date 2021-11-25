package patternsStepDefinitions;

import static org.junit.Assert.assertEquals;

import animal.Animal;
import animal.Nourriture;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import patternsFusion.AnimalAugment;
import patternsFusion.AugmentationStrategy;
import patternsFusion.NourritureAugment;
import superheros.Superheros;

public class StefDefsUS04DemandeAide {
	private Superheros flash;
	private Animal animal;
	private Nourriture food;
	private int power, health;

	@Given("un superheros de force {int}")
	public void un_superheros_de_force(Integer int1) {
		this.flash = new Superheros(int1);
		this.power = int1;
		this.health = flash.getHealth();
	}

	@Given("une nourriture de famille {string}")
	public void une_nourriture_de_famille(String f) {
		this.food = new Nourriture(f);

	}

	@When("le superheros mange la nourriture")
	public void le_superheros_mange_la_nourriture() {
		AugmentationStrategy help = new NourritureAugment(flash);
		flash.askHelp(help, food.getTypeNourriture());
	}

	@Then("le niveau de vie de superheros va augmenter selon la longueur du typeNourriture")
	public void le_niveau_de_vie_de_superheros_va_augmenter_selon_la_longueur_du_typeNourriture() {
		int newHealth = health + food.getTypeNourriture().length();
		assertEquals(newHealth, flash.getHealth());

	}

	@Given("un animal de nom {string} et son cri {string}")
	public void un_animal_appele_et_son_cri(String name, String sound) {
		this.animal = new Animal(name, sound);
	}

	@When("le superheros demande de laide de lanimal")
	public void le_superheros_demande_de_laide_de_lanimal() {
		AugmentationStrategy help = new AnimalAugment(flash);
		flash.askHelp(help, animal.getCri());
	}

	@Then("la force de superheros va augmenter selon la longueur du cri")
	public void la_force_de_superheros_va_augmenter_selon_la_longueur_du_cri() {
		int newPower = power + animal.getCri().length();
		assertEquals(newPower, flash.getPower());

	}
}
