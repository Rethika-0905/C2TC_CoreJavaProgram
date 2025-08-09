package DaySeven.dayseven.overriding.covariant;

public class CovariantOverrdingDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student st1 = new Student(1, "Btech", "Yakesh");
		st1.printData();
		
		//obj created using clone method
		Student st2 = (Student) st1.clone();
		st2.printData();
				

	}

}
