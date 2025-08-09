package DaySix.usingfinal;

public class FinalMethodClassTest extends FinalMethodClass{
	/*@Override
	void show()
	{
		System.out.println("This is the final method of finalmethod class");
	}*/
	FinalMethodClassTest()
	{
		System.out.println("This inheritance cant access declare method of other class if defined final!!");
		
	}
	
	public static void main(String[] args)
	{
		FinalMethodClassTest fmct = new FinalMethodClassTest();
		fmct.show();
	}

}
