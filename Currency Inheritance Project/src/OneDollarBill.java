public class OneDollarBill extends Bills{
	@Override
	public void weight() {
		name = "one dollar bill";
		System.out.println("A " + name + " has a weight has of .2 grams.");
	}

	@Override
	public void size() {
		name = "one dollar bill";
		System.out.println("A " + name + " has a perimeter of 10 inches.");
	}

	@Override
	public void fold() {
		name = "one dollar bill";
		System.out.println("You can fold a " + name + " ten times.");
	}

	public void area() {
		name = "one dollar bill";
		System.out.println("A " + name + " has a area of 25 inches.");
	}

	public void value() {
		value = 1;
		name = "one dollar bill";
		System.out
				.println("A " + name + " has a value of " + value + " dollar.");

	}

	public void canMake() {
		name = "one dollar bills";
		System.out.println("One hundred " + name + " can make one thousand dollars.");
	}
	

}
