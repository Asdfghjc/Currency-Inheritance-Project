
public class OneHundredDollarBill extends Bills{
	@Override
	public void weight() {
		name = "one hundred dollar bill";
		System.out.println("A " + name + " has a weight has of .4 grams.");
	}

	@Override
	public void size() {
		name = "one hundred dollar bill";
		System.out.println("A " + name + " has a perimeter of 10 inches.");
	}

	@Override
	public void fold() {
		name = "one hundred dollar bill";
		System.out.println("You can fold a " + name + " 11 times.");
	}

	public void area() {
		name = "one hundred dollar bill";
		System.out.println("A " + name + " has a area of 25 inches.");
	}

	public void value() {
		value = 100;
		name = "one hundred dollar bill";
		System.out
				.println("A " + name + " has a value of " + value + " 100 dollars.");

	}

	public void makeChange() {
		name = "one hundred dollars";
		System.out.println("Five twenty dollar bills can make " + name + ".");
	}

}
