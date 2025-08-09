package day2.BufferFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter name ");
		name = br.readLine();
		
		int age;
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		
		float avg;
		System.out.println("Enter average ");
		avg = Float.parseFloat(br.readLine());
		

	}

}
