package August20_JAVA03;

// Assignment 10: Find maximum - Overload a method to find the maximum of two or three numbers

public class FindMaximum {

	// Method to find maximum of two integers
	public static int findMax(int a, int b) {
		return (a > b) ? a : b;
	}

	// Method to find maximum of three integers
	public static int findMax(int a, int b, int c) {
		return findMax(findMax(a, b), c);
	}

	// Method to find maximum of two doubles
	public static double findMax(double a, double b) {
		return (a > b) ? a : b;
	}

	// Method to find maximum of three doubles
	public static double findMax(double a, double b, double c) {
		return findMax(findMax(a, b), c);
	}

	// Method to find maximum of two floats
	public static float findMax(float a, float b) {
		return (a > b) ? a : b;
	}

	// Method to find maximum of three floats
	public static float findMax(float a, float b, float c) {
		return findMax(findMax(a, b), c);
	}

	// Method to find maximum in an integer array
	public static int findMax(int[] numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Array cannot be empty");
		}

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// Testing with two integers
		int a = 25, b = 40;
		System.out.println("Maximum of " + a + " and " + b + " = " + findMax(a, b));

		// Testing with three integers
		int c = 30;
		System.out.println("Maximum of " + a + ", " + b + " and " + c + " = " + findMax(a, b, c));

		// Testing with two doubles
		double d1 = 25.7, d2 = 40.2;
		System.out.println("Maximum of " + d1 + " and " + d2 + " = " + findMax(d1, d2));

		// Testing with three doubles
		double d3 = 30.1;
		System.out.println("Maximum of " + d1 + ", " + d2 + " and " + d3 + " = " + findMax(d1, d2, d3));

		// Testing with two floats
		float f1 = 15.5f, f2 = 20.3f;
		System.out.println("Maximum of " + f1 + " and " + f2 + " = " + findMax(f1, f2));

		// Testing with array
		int[] numbers = {10, 45, 23, 67, 12, 89, 34};
		System.out.println("Maximum in array = " + findMax(numbers));
	}
}
