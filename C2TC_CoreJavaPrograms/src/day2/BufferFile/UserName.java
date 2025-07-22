package day2.BufferFile;
import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha name");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
		sc.close();
		

	}

}
