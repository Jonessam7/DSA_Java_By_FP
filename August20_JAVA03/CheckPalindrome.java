package August20_JAVA03;

// Assignment 2: Check palindrome - Input a string and check whether it reads the same forward and backward

public class CheckPalindrome {

	public static boolean isPalindrome(String str) {
		// Convert to lowercase and remove spaces for comparison
		str = str.toLowerCase().replaceAll("\\s+", "");

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String input = "A man a plan a canal Panama";
		boolean result = isPalindrome(input);
		System.out.println("String: " + input);
		System.out.println("Is palindrome: " + result);

		// Test with another example
		String input2 = "hello";
		boolean result2 = isPalindrome(input2);
		System.out.println("String: " + input2);
		System.out.println("Is palindrome: " + result2);
	}
}
