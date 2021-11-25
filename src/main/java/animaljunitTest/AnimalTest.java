package animaljunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animal.Animal;
import animal.Nourriture;

class AnimalTest {

	private static Animal animal = null;

	public AnimalTest() {
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		animal = new Animal("bobby", "wouafwouf", new Nourriture("croquettes"));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testgetNom() {
		assertEquals(animal.getNom(), "bobby");
	}

	@Test
	void testgetCri() {
		assertEquals(animal.getCri(), "wouafwouf");
	}

	@Test
	void testgetNourriture() {
		assertEquals(animal.getNourriture(), new Nourriture("croquettes"));
	}

	@Test
	void testsetNom() {
		animal.setNom("bob");
		assertEquals(animal.getNom(), "bob");
		//assertThrows(AssertionError.class, () -> animal.setNom(null));
	}

	@Test
	void testsetCri() {
		animal.setCri("wouaffwouaff");
		assertEquals(animal.getCri(), "wouaffwouaff");
		assertThrows(AssertionError.class, () -> animal.setCri(null));
	}

	@Test
	void testsetNourriture() {
		animal.setNourriture(new Nourriture("os"));
		assertEquals(animal.getNourriture(), new Nourriture("os"));
		assertThrows(AssertionError.class, () -> animal.setNourriture(null));
	}

	@Test
	void testNourritureAnimal() {
	//	assertEquals(animal.nourritureAnimal(), "L'animal bob cri wouaffwouaff. Cet animal mange: croquettes.");
	}

	@Test
	void testprofilAnimal() {
	//	assertEquals(animal.profilAnimal(), "L'animal bob cri wouaffwouaff.");
	}

	@Test
	void testParametres() {
	//	assertThrows(AssertionError.class, () -> new Animal(null, null, null));
	}

}
