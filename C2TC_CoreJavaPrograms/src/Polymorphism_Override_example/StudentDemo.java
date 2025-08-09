package Polymorphism_Override_example;

class College
{
	protected College getobject()
	{
		return new College();
	}
}

class Student extends College
{
	@Override
	public Student getobject()
	{
		return new Student();
	}
}


public class StudentDemo {

	public static void main(String[] args) {

	}

}
