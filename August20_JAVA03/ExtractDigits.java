package August20_JAVA03;

// Assignment 8: Extract digits - From a string, extract all numeric digits and display them as a single string

public class ExtractDigits {

	public static String extractDigits(String str) {
		String digits = "";

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				digits += c;
			}
		}
		return digits;
	}

	// Alternative method using StringBuilder for better performance
	public static String extractDigitsStringBuilder(String str) {
		StringBuilder digits = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.append(c);
			}
		}
		return digits.toString();
	}

	// Method using regular expressions
	public static String extractDigitsRegex(String str) {
		return str.replaceAll("[^0-9]", "");
	}

	// Method to extract digits and convert to integer array
	public static int[] extractDigitsAsArray(String str) {
		String digitString = extractDigits(str);
		int[] digitArray = new int[digitString.length()];

		for (int i = 0; i < digitString.length(); i++) {
			digitArray[i] = Character.getNumericValue(digitString.charAt(i));
		}
		return digitArray;
	}

	public static void main(String[] args) {
		String input = "Hello123World456Java789";

		String digits1 = extractDigits(input);
		String digits2 = extractDigitsStringBuilder(input);
		String digits3 = extractDigitsRegex(input);
		int[] digitArray = extractDigitsAsArray(input);

		System.out.println("Input string: " + input);
		System.out.println("Extracted digits (method 1): " + digits1);
		System.out.println("Extracted digits (method 2): " + digits2);
		System.out.println("Extracted digits (method 3): " + digits3);

		System.out.print("Digits as array: ");
		for (int digit : digitArray) {
			System.out.print(digit + " ");
		}
		System.out.println();

		// Test with another example
		String input2 = "Phone: 9876543210, Age: 25";
		System.out.println("\nInput: " + input2);
		System.out.println("Extracted digits: " + extractDigits(input2));
	}
}
