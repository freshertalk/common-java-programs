package in.freshertalk.commonjavaprograms;

public class Palindrome {

	// Function to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		int length = str.length();

		// Compare characters from both ends moving towards the center
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false; // If characters do not match, not a palindrome
			}
		}

		return true; // All characters match, it's a palindrome
	}

	public void checkPalindrome(String original) {
		// Remove any spaces and convert to lowercase for uniformity
		original = original.replaceAll("\\s+", "").toLowerCase();

		// Check if the string is a palindrome
		if (isPalindrome(original)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

}
