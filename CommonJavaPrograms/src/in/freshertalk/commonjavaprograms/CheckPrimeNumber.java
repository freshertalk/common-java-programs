package in.freshertalk.commonjavaprograms;

public class CheckPrimeNumber {

	// Function to check if a number is prime
	public boolean isPrime(int num) {
		// Edge cases: Numbers less than 2 are not prime
		if (num <= 1) {
			return false;
		}

		// Check for factors from 2 to √num
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // If divisible, not prime
			}
		}
		return true; // No divisors found, prime number
	}

	public void checkPrime(int number) {

		// Check if the number is prime
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
