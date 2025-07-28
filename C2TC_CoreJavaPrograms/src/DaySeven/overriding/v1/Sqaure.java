package DaySeven.overriding.v1;

public class Sqaure extends Shape{
	
	private double side;
	
	public Sqaure(double side)
	{
		this.side = side;
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing the square of side "+side);
	}
	
	@Override
	public void erase()
	{
		System.out.println("Erasing a sqaure of side "+ side);
	}
}
