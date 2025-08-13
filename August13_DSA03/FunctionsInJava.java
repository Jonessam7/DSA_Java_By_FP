package August13_DSA03;

import java.util.ArrayList;

class ArrayListFunctions {
	public void run() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Pineapple");
		list.add(1, "berry");
		System.out.println("ArrayList: " + list);

		list.remove("pineapple");
		list.remove(0);
		System.out.println("After removal: " + list);

		list.set(0, "Mango");
		System.out.println("After set: " + list);

		System.out.println("Get element at index 0: " + list.get(0));
		System.out.println("Contains Mango? " + list.contains("Mango"));
		System.out.println("Size: " + list.size());

		list.clear();
		System.out.println("After clear: " + list);
	}
}

class StringFunctions {
	public void run() {
		String str = "Hello World";
		System.out.println("Length: " + str.length());
		System.out.println("Char at 4: " + str.charAt(4));
		System.out.println("Substring(0,5): " + str.substring(0, 5));
		System.out.println("To Uppercase: " + str.toUpperCase());
		System.out.println("To Lowercase: " + str.toLowerCase());
		System.out.println("Replace l with x: " + str.replace('l', 'x'));
		System.out.println("Index of 'o': " + str.indexOf('o'));
		System.out.println("Starts with 'Hel'? " + str.startsWith("Hel"));
		System.out.println("Ends with 'ld'? " + str.endsWith("ld"));
		System.out.println("Equals 'Hello World'? " + str.equals("Hello World"));
		System.out.println("Trim: " + "   spaces   ".trim());
	}
}

class PalindromeCheck {
	public void run() {
		String word = "madam";
		System.out.println("\nPalindrome check for: " + word);

		String reversed1 = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed1 += word.charAt(i);
		}
		System.out.println("For loop: " + reversed1.equals(word));

		boolean isPalindrome = true;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Index matching: " + isPalindrome);

		String reversed2 = new StringBuilder(word).reverse().toString();
		System.out.println("Reverse function: " + reversed2.equals(word));
	}
}

public class FunctionsInJava {
	public static void main(String[] args) {
		new ArrayListFunctions().run();
		new StringFunctions().run();
		new PalindromeCheck().run();
	}
}