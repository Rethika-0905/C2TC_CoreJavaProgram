package DayEight.interfaces.instanceinterfaces;

public class Samsung implements Phone {
	
	@Override
	public void call() {
		System.out.println("Calling using samsung");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using samsung");
	}
}
