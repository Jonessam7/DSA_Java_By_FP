package August20_JAVA03;

// Assignment 15: String to number - Convert a string to integer, double, and float using wrapper classes

public class StringToNumber {

	// Method to convert string to integer
	public static int stringToInteger(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to integer: " + e.getMessage());
			return 0;
		}
	}

	// Method to convert string to double
	public static double stringToDouble(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to double: " + e.getMessage());
			return 0.0;
		}
	}

	// Method to convert string to float
	public static float stringToFloat(String str) {
		try {
			return Float.parseFloat(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to float: " + e.getMessage());
			return 0.0f;
		}
	}

	// Method using valueOf methods
	public static int stringToIntegerValueOf(String str) {
		try {
			return Integer.valueOf(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to integer using valueOf: " + e.getMessage());
			return 0;
		}
	}

	public static double stringToDoubleValueOf(String str) {
		try {
			return Double.valueOf(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to double using valueOf: " + e.getMessage());
			return 0.0;
		}
	}

	public static float stringToFloatValueOf(String str) {
		try {
			return Float.valueOf(str);
		} catch (NumberFormatException e) {
			System.out.println("Error converting '" + str + "' to float using valueOf: " + e.getMessage());
			return 0.0f;
		}
	}

	// Method to convert and display all three types
	public static void convertAndDisplay(String str) {
		System.out.println("\nConverting string: '" + str + "'");
		System.out.println("To Integer: " + stringToInteger(str));
		System.out.println("To Double: " + stringToDouble(str));
		System.out.println("To Float: " + stringToFloat(str));
	}

	// Method to demonstrate valueOf vs parse methods
	public static void demonstrateValueOfVsParse(String str) {
		System.out.println("\nDemonstrating valueOf vs parse for: '" + str + "'");

		// Using parse methods
		int intParse = stringToInteger(str);
		double doubleParse = stringToDouble(str);
		float floatParse = stringToFloat(str);

		// Using valueOf methods
		int intValueOf = stringToIntegerValueOf(str);
		double doubleValueOf = stringToDoubleValueOf(str);
		float floatValueOf = stringToFloatValueOf(str);

		System.out.println("parseInt: " + intParse + ", valueOf: " + intValueOf);
		System.out.println("parseDouble: " + doubleParse + ", valueOf: " + doubleValueOf);
		System.out.println("parseFloat: " + floatParse + ", valueOf: " + floatValueOf);
	}

	// Method to handle different number formats
	public static void handleDifferentFormats() {
		System.out.println("\nHandling different number formats:");

		// Binary string to integer
		String binaryStr = "1010";
		int fromBinary = Integer.parseInt(binaryStr, 2);
		System.out.println("Binary '" + binaryStr + "' to decimal: " + fromBinary);

		// Hexadecimal string to integer
		String hexStr = "FF";
		int fromHex = Integer.parseInt(hexStr, 16);
		System.out.println("Hexadecimal '" + hexStr + "' to decimal: " + fromHex);

		// Octal string to integer
		String octalStr = "77";
		int fromOctal = Integer.parseInt(octalStr, 8);
		System.out.println("Octal '" + octalStr + "' to decimal: " + fromOctal);
	}

	public static void main(String[] args) {
		// Test valid conversions
		convertAndDisplay("123");
		convertAndDisplay("45.67");
		convertAndDisplay("89.123");

		// Test valueOf vs parse methods
		demonstrateValueOfVsParse("456");
		demonstrateValueOfVsParse("78.9");

		// Test invalid conversions
		System.out.println("\nTesting invalid conversions:");
		convertAndDisplay("abc");
		convertAndDisplay("12.34.56");
		convertAndDisplay("");

		// Handle different number formats
		handleDifferentFormats();

		// Additional examples
		System.out.println("\nAdditional examples:");
		String[] testStrings = {"100", "25.5", "3.14159", "0", "-50", "1.23E+2"};

		for (String test : testStrings) {
			convertAndDisplay(test);
		}
	}
}
