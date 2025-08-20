package August20_JAVA03;

// Assignment 3: Reverse string - Reverse the string without using StringBuffer.reverse()

public class ReverseString {

	public static String reverseString(String str) {
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

	// Alternative method using character array
	public static String reverseStringArray(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			// Swap characters
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		String input = "Hello World";
		String reversed1 = reverseString(input);
		String reversed2 = reverseStringArray(input);

		System.out.println("Original string: " + input);
		System.out.println("Reversed (method 1): " + reversed1);
		System.out.println("Reversed (method 2): " + reversed2);
	}
}
