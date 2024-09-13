package in.freshertalk.commonjavaprograms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

		Scanner scanner = new Scanner(System.in);
		// Input: Ask the user to enter a number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is prime
		if (checkPrimeNumber.isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();

	}

}
