package DaySix.usingfinal;

public class FinalVariable {
	final int x = 100;
	final static int Y;
	final static int Z = 10;

	/*void change() {
		//x = 30; 
		Y = 200; 
	}*/

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		//Z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}
	
	public static void main(String[] args)
	{
		FinalVariable fv = new FinalVariable();
		System.out.println(fv);
	}

}
