package java;

	public class Rocket implements SpaceShip {
	    int cost;
	    int weight;
	    int maxWeight;
	    double launchExplosion;
	    double landingCrash;
	    int currentWeight;

	    @Override
		public boolean launch() {
			//to be override
			return true;
		}

		@Override
		public boolean land() {
			//to be override
			return true;
		}

		public int carry(Item item) {
			//to be implemented
	        this.currentWeight += item.weight;
	        return this.currentWeight;
		}
		public boolean canCarry(Item item) {
			//to be implemented
	        return this.currentWeight + item.weight <= maxWeight;

		}
	}