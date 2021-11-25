package patternsFusion;

import superheros.Superheros;

public class AnimalAugment implements AugmentationStrategy {
	private Superheros s;
	private int power;

	public AnimalAugment(Superheros s) {
	this.s = s;
	this.power = s.getPower();

	}

public void giveBoost(int x) {
	s.setPower(power + x);
}
	

}