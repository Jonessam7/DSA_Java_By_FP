package August20_JAVA03;

// Assignment 7: Character frequency - Count the frequency of each character in a string

import java.util.*;

public class CharacterFrequency {

	public static Map<Character, Integer> getCharacterFrequency(String str) {
		Map<Character, Integer> frequency = new HashMap<>();

		for (char c : str.toCharArray()) {
			frequency.put(c, frequency.getOrDefault(c, 0) + 1);
		}
		return frequency;
	}

	// Alternative method using arrays (for ASCII characters)
	public static void displayCharacterFrequencyArray(String str) {
		int[] frequency = new int[256]; // ASCII characters

		// Count frequency
		for (char c : str.toCharArray()) {
			frequency[c]++;
		}

		// Display results
		System.out.println("Character frequencies:");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println("'" + (char)i + "' : " + frequency[i]);
			}
		}
	}

	public static void displayCharacterFrequency(Map<Character, Integer> frequency) {
		System.out.println("Character frequencies:");
		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String input = "programming";

		System.out.println("Input string: " + input);
		System.out.println();

		// Method 1: Using HashMap
		Map<Character, Integer> frequency = getCharacterFrequency(input);
		displayCharacterFrequency(frequency);

		System.out.println();

		// Method 2: Using array
		displayCharacterFrequencyArray(input);
	}
}
