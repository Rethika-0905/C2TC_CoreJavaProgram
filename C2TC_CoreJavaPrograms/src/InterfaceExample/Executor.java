package InterfaceExample;

//helps in loose coupling - interface
public class Executor {

	public static void main(String[] args) {
		College c1;//college reference
		
		c1 = new CseStudent();
		c1.session();
		
		c1 = new ItStudents();
		c1.session();
	}

}
