package PatternsJunitTest;

import animal.Animal;
import animal.Nourriture;
import patternsFusion.AnimalAdapter;
import patternsFusion.AnimalAugment;
import patternsFusion.AugmentationStrategy;
import patternsFusion.NourritureAugment;
import superheros.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternsTest {

	@Test
	public void testStrategyAskHelpAnimal() {
		Superheros flash = new Superheros(100);
		Animal chien = new Animal("chien", "wouf");
		AugmentationStrategy help = new AnimalAugment(flash);
		flash.askHelp(help, chien.getCri());
		assertEquals(104, flash.getPower());
	}

	@Test
	public void testStrategyAskHelpFood() {
		Superheros flash = new Superheros(100);
		Nourriture cornichon = new Nourriture("Cucurbitaceae");
		AugmentationStrategy help = new NourritureAugment(flash);
		flash.askHelp(help, cornichon.getTypeNourriture());
		assertEquals(113, flash.getHealth());
	}

	@Test
	public void testAnimalAdapter() {
		Ennemi cyboborg = new Ennemi(100);
		Animal chat = new Animal("minou", "miawww");
		AnimalAdapter chathero = new AnimalAdapter(chat);
		chathero.addEnnemi(cyboborg);
		assertTrue(chathero.hurt(cyboborg));
	}

}
