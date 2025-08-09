package InterfaceExample;

public class ItStudents implements College{
	
	@Override
	public void session()
	{
		System.out.println("Reach the college at "+startTime);
		System.out.println("Attend the session afternoon.");
	}

}
