package MissiontoMars;

public class U1 extends Rocket {

	public U1() {
	    cost = 100; //100 million
	    weight = 10000;
	    maxWeight = 18000;
	    launchExplosion = 0.0;
	    landingCrash = 0.0;
	    currentWeight = weight;
	}

	public boolean land() {
		//Chance of landing crash = 1% * (cargo carried / cargo limit)
		int random = (int)(Math.random() * 100 + 1);
		this.landingCrash = 0.01 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		if(this.landingCrash<=random) {
			return true;
		}	
		return false;
	}
	public boolean launch(int cargoCarried) {
		//Chance of launch explosion = 5% * (cargo carried / cargo limit)
		int random = (int)(Math.random() * 100 + 1);
		this.launchExplosion = 0.05 * ( this.currentWeight - this.weight) / (this.maxWeight - this.weight);
		if(this.launchExplosion<=random) {
			return true;
		}	
		return false;
	}
}