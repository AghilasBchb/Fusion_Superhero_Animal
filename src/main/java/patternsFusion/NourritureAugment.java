package patternsFusion;

import superheros.Superheros;

public class NourritureAugment implements AugmentationStrategy{
	private Superheros s;
	private int health;
	
	
	public NourritureAugment(Superheros s) {
	this.s = s;
	this.health=s.getHealth();
	}

	
	public void giveBoost(int x) {
		s.setHealth(health + x);
		
	}
	
  
}
