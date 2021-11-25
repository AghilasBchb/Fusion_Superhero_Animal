package animaljunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import animal.Animal;
import animal.Nourriture;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertThrows;



class NourritureTest {
	
	private static Animal animal;
	private static Animal animal2;
	private static Nourriture nourriture;
	ArrayList <Animal> listAnimal = new ArrayList<Animal>();
	
	public NourritureTest() {}

	@BeforeAll
	static void setUpBeforeClass(){
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ArrayList <Animal> listAnimal = new ArrayList<Animal>();
		nourriture = new Nourriture ("croquettes", listAnimal);
		animal = new Animal("bobby", "waoufwaouf", NourritureTest.nourriture);
		listAnimal.add(animal);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testgetNourriture() {
				assertEquals(nourriture.getTypeNourriture(), "croquettes");
	}
	
	@Test
	void testsetTypeNourriture() {
		nourriture.setTypeNourriture("croquette");
		assertEquals(nourriture.getTypeNourriture(), "croquette");
		assertThrows(
				 AssertionError.class,
		         () -> nourriture.setTypeNourriture(null)
		  );
	}
	
	@Test
	void testgetListAnimal() {
		assertEquals(nourriture.getListAnimal().size(), 1);
		assertEquals(nourriture.getListAnimal().get(0), animal);
	}
	
	@Test
	void testaddAnimal() {
		animal = new Animal("bobby", "wouafwouaf", new Nourriture("croquettes"));
		nourriture.addAnimal(animal);
		assertEquals(nourriture.jeVeuxVoirLesAnimaux(), "L'animal bobby cri waoufwaouf. Cet animal mange: croquettes., L'animal bobby cri wouafwouaf. Cet animal mange: croquettes.");
		assertThrows(
				 AssertionError.class,
		         () -> nourriture.addAnimal(null)
		  );
	}
	
	@Test
	void testremoveAnimal() {
		
		nourriture.removeAnimal(animal);
		assertEquals(nourriture.getListAnimal(), new ArrayList<>());
		assertThrows(
				 AssertionError.class,
		         () -> nourriture.addAnimal(null)
		  );
	}
	
	@Test
	void testsetListAnimal() {
		ArrayList <Animal> listAnimal1 = new ArrayList<Animal>();
		listAnimal1.add(animal);
		nourriture.setListAnimal(listAnimal1);
		assertEquals(nourriture.jeVeuxVoirLesAnimaux(),"L'animal bobby cri waoufwaouf. Cet animal mange: croquettes.");
		assertThrows(
				 AssertionError.class,
		         () -> nourriture.setListAnimal(null)
		  );
	}
	
	@Test
	void testaffichierListAnimal() {
		animal2 = new Animal("pioupiou", "miaou", new Nourriture("souris"));
		listAnimal.add(animal2);
		assertEquals(nourriture.jeVeuxVoirLesAnimaux(), "L'animal bobby cri waoufwaouf. Cet animal mange: croquettes.");
	}
	
	@Test
	void testqueMangentTils() throws Exception {
		assertEquals(nourriture.queMangentTils(), "Les animaux: bobby mange(nt) cette nourriture: croquettes.");
	}
	
	@Test
	void testExceptions() {
		ArrayList <Animal> listAnimal2 = new ArrayList<Animal>();
		nourriture = new Nourriture ("herbes", listAnimal2);
		assertThrows(
		          Exception.class,
		          () -> nourriture.queMangentTils()
		  );
		/*assertThrows(
		          AssertionError.class,
		          () -> new Nourriture (null, null)
		  );
		assertThrows(
		          AssertionError.class,
		          () -> new Nourriture (null)
		  );*/
		
	}
			

}
