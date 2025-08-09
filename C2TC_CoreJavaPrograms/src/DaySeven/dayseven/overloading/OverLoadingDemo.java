package DaySeven.dayseven.overloading;

public class OverLoadingDemo {

	public static void main(String[] args) {
		
		System.out.println("--------Constructor Overloading--------");
		
		Point p = new Point();
		System.out.println(p);
		
		//Point p1 = new Point(14.5f);
		p = new Point(14.5f);
		System.out.println(p);
		
		p = new Point(12.5f, 20.50f);
		System.out.println(p);
		
		System.out.println("---------Method Overloading---------");
		System.out.println("Addition of two integer: "+MethodOverloading.addition(10, 20));
		System.out.println("Addition of two float: "+MethodOverloading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float: "+MethodOverloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer: "+MethodOverloading.addition(10.0f, 20));
		System.out.println("Addition of two string: "+MethodOverloading.addition("Hello", "World"));

	}

}
