package DaySeven.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		RBI rbi;//reference variable
		
		rbi = new RBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

	}

}
