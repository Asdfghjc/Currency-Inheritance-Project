public class Bills extends Currency{
	protected int area;
	
	@Override
	public void weight()
	{
		System.out.println("Bills are lighter than coins.");
	}
	
	@Override
	public void size()
	{
		System.out.println("Bills are larger than coins");
	}
	
	public void fold()
	{
		System.out.println("You can fold all types of bill currency.");
	}

}
