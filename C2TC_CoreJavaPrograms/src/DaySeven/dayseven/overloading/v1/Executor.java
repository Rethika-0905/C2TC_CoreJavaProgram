package DaySeven.dayseven.overloading.v1;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Is 121 palindrome? "+Operations.isPalindrome(121));
		System.out.println("Is 345 palindrome? "+Operations.isPalindrome(345));
		
		System.out.println("Is CAR palindrome? "+Operations.isPalindrome("CAR"));
		System.out.println("Is RACECAR palindrome? "+Operations.isPalindrome("RACECAR"));

	}

}
