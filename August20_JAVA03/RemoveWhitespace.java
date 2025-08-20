package August20_JAVA03;

// Assignment 5: Remove whitespace - Remove all spaces from the input string

public class RemoveWhitespace {

	public static String removeWhitespace(String str) {
		return str.replaceAll("\\s+", "");
	}

	// Alternative method using manual approach
	public static String removeWhitespaceManual(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		return result;
	}

	// Method using StringBuilder for better performance
	public static String removeWhitespaceStringBuilder(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "Hello World Java Programming";
		String result1 = removeWhitespace(input);
		String result2 = removeWhitespaceManual(input);
		String result3 = removeWhitespaceStringBuilder(input);

		System.out.println("Original string: '" + input + "'");
		System.out.println("After removing spaces (method 1): '" + result1 + "'");
		System.out.println("After removing spaces (method 2): '" + result2 + "'");
		System.out.println("After removing spaces (method 3): '" + result3 + "'");
	}
}
