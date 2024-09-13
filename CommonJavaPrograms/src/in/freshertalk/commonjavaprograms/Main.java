package in.freshertalk.commonjavaprograms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
		Palindrome palindrome = new Palindrome();

		Scanner scanner = new Scanner(System.in);
//		// Input: Ask the user to enter a number
//		System.out.print("Enter a number: ");
//		int number = scanner.nextInt();

//		checkPrimeNumber.checkPrime(number);

		// Input: Ask the user to enter a string
		System.out.print("Enter a string: ");
		String original = scanner.nextLine();

		palindrome.checkPalindrome(original);

		scanner.close();

	}

}
