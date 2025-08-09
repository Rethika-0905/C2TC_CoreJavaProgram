package day3.Constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		/*Customer c = new Customer();
		System.out.println(c);*/
		
		Customer c2 = new Customer(104, "yakesh", "rajasthan");
		System.out.println(c2);
		
		Customer c3 = new Customer("rethika", "pune");
		System.out.println(c3);

	}

}
