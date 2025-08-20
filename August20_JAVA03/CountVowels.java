package August20_JAVA03;

// Assignment 1: Count vowels - Input a string and count how many vowels it contains (ignore case)

public class CountVowels {

	public static int countVowels(String str) {
		int count = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "Hello World";
		int vowelCount = countVowels(input);
		System.out.println("String: " + input);
		System.out.println("Number of vowels: " + vowelCount);
	}
}
