
public class Coins extends Currency{
	protected int diameter;
	
	@Override
	public void weight()
	{
		System.out.println("Coins are heavier than bills.");
	}
	
	@Override
	public void size()
	{
		System.out.println("Coins are smaller than bills.");
	}
	
	public void flip()
	{
		System.out.println("You can flip every coin.");
	}
	
}
