package InterfaceExample;

public class CseStudent implements College {
	
	@Override
	public void session()
	{
		System.out.println("Reach college at "+startTime);
		System.out.println("Attend the sessions.");
	}

}
