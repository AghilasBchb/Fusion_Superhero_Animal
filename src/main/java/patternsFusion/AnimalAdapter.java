package patternsFusion;

import animal.Animal;
import superheros.Superheros;

public class AnimalAdapter extends Superheros{
	
private Animal animal;
	
	public AnimalAdapter(Animal a) {
		super(a.getCri().length());
		this.setHealth(a.getNom().length());
		this.animal = a;
	}
	
	
}
