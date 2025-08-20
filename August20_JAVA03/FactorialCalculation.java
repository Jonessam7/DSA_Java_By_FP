package August20_JAVA03;

// Assignment 13: Factorial calculation - Overload methods to calculate factorial of a single integer or an array of integers

public class FactorialCalculation {

	// Method to calculate factorial of a single integer
	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if (n <= 1) {
			return 1;
		}

		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// Method to calculate factorial of an array of integers
	public static long[] factorial(int[] numbers) {
		long[] results = new long[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			results[i] = factorial(numbers[i]);
		}
		return results;
	}

	// Recursive method to calculate factorial
	public static long factorialRecursive(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if (n <= 1) {
			return 1;
		}
		return n * factorialRecursive(n - 1);
	}

	// Method to calculate factorial using BigInteger for very large numbers
	public static java.math.BigInteger factorialBig(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}

		java.math.BigInteger result = java.math.BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(java.math.BigInteger.valueOf(i));
		}
		return result;
	}

	// Method to display factorial results nicely
	public static void displayFactorial(int n, long result) {
		System.out.println(n + "! = " + result);
	}

	public static void displayFactorialArray(int[] numbers, long[] results) {
		System.out.println("Factorial results for array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "! = " + results[i]);
		}
	}

	public static void main(String[] args) {
		// Calculate factorial of single numbers
		int num1 = 5;
		long fact1 = factorial(num1);
		displayFactorial(num1, fact1);

		int num2 = 7;
		long fact2 = factorial(num2);
		displayFactorial(num2, fact2);

		// Calculate factorial using recursive method
		int num3 = 6;
		long fact3 = factorialRecursive(num3);
		System.out.println(num3 + "! (recursive) = " + fact3);

		// Calculate factorial of an array
		int[] numbers = {3, 4, 5, 6, 7};
		long[] factorials = factorial(numbers);
		displayFactorialArray(numbers, factorials);

		// Test with larger number using BigInteger
		int largeNum = 20;
		java.math.BigInteger largeFact = factorialBig(largeNum);
		System.out.println("\nLarge factorial:");
		System.out.println(largeNum + "! = " + largeFact);

		// Edge cases
		System.out.println("\nEdge cases:");
		displayFactorial(0, factorial(0));
		displayFactorial(1, factorial(1));
	}
}
