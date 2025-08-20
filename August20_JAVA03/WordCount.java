package August20_JAVA03;

// Assignment 4: Word count - Count the number of words in a string (words separated by spaces)

public class WordCount {

	public static int countWords(String str) {
		// Handle null or empty string
		if (str == null || str.trim().isEmpty()) {
			return 0;
		}

		// Trim whitespace and split by one or more spaces
		String[] words = str.trim().split("\\s+");
		return words.length;
	}

	// Alternative method using manual counting
	public static int countWordsManual(String str) {
		if (str == null || str.trim().isEmpty()) {
			return 0;
		}

		int count = 0;
		boolean inWord = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (!inWord) {
					count++;
					inWord = true;
				}
			} else {
				inWord = false;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "Hello World Java Programming";
		int wordCount1 = countWords(input);
		int wordCount2 = countWordsManual(input);

		System.out.println("String: " + input);
		System.out.println("Word count (method 1): " + wordCount1);
		System.out.println("Word count (method 2): " + wordCount2);

		// Test with edge cases
		String input2 = "   Hello    World   ";
		System.out.println("String with extra spaces: '" + input2 + "'");
		System.out.println("Word count: " + countWords(input2));
	}
}
