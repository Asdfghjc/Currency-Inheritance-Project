public class Quarter extends Coins{
	@Override
	public void weight() {
		name = "quarter";
		System.out.println("A " + name + " has a weight has of 2.7 grams.");
	}

	@Override
	public void size() {
		name = "quarter";
		System.out.println("A " + name + " has a circumference of 2.2 inches.");
	}

	@Override
	public void flip() {
		name = "quarter";
		System.out.println("The " + name + " landed on tails.");
	}

	public void diameter() {
		name = "quarter";
		System.out.println("A " + name + " has a diameter of .9 inches.");
	}

	public void value() {
		value = 25;
		name = "quarter";
		System.out.println("A " + name + " has a value of " + value + "cents");

	}

	public void makeChange() {
		name = "quarter";
		System.out.println("Five nickels can make one " + name + ".");
	}

}
