package DaySix.usingfinal;
class FinalMethodClass {
	FinalMethodClass() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	final void show() {
		System.out.println("Value of a: " + a);
	}
	
	public static void main(String[] args)
	{
		FinalMethodClass fmc = new FinalMethodClass();
		fmc.show();
	}
}
