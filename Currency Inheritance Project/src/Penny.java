public class Penny extends Coins {
	@Override
	public void weight() {
		name = "penny";
		System.out.println("A " + name + " has a weight has of 1.2 grams.");
	}

	@Override
	public void size() {
		name = "penny";
		System.out.println("A " + name + " has a circumference of 1.4 inches.");
	}

	@Override
	public void flip() {
		name = "penny";
		System.out.println("The " + name + " landed on heads.");
	}

	public void diameter() {
		name = "penny";
		System.out.println("A " + name + " has a diameter of .3 inches.");
	}

	public void value() {
		value = 1;
		name = "penny";
		System.out
				.println("A " + name + " has a value of " + value + "c ents.");

	}

	public void canMake() {
		name = "pennies";
		System.out.println("One hundred " + name + " can make one dollar.");
	}

}
