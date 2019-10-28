package java;

import java.util.Random;

public class U2 extends Rocket {
	private Random r = new Random();
	U2() {
		cost = 120;
		weight = 18000;
		maxWeight = 29000;
		launchExplosion = 0.0;
		landingCrash = 0.0;
		currentWeight = weight;
	}

	public boolean land() {
		//Chance of landing crash = 8% * (cargo carried / cargo limit)
		int random = r.nextInt(100);
		this.launchExplosion = 0.08 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.launchExplosion <= random;
	}
	public boolean launch(int cargoCarried) {
		//Chance of launch explosion = 4% * (cargo carried / cargo limit)
		int random = r.nextInt(100);
		this.landingCrash = 0.04 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		return this.landingCrash <= random;
	}

}
