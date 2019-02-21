package MissiontoMars;

public interface SpaceShip {

	public boolean launch();
		//a method that returns either true or false indicating if the launch was successful or if the rocket has crashed.
	public boolean land();
		//a method that also returns either true or false based on the success of the landing.
	public boolean canCarry(Item item);
		//a method that takes an Item as an argument and returns true if the rocket can carry such item or false if it will exceed the weight limit.
	public int carry(Item item);
		//a method that also takes an Item object and updates the current weight of the rocket.
}
