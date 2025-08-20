package August20_JAVA03;

// Assignment 9: Add numbers - Overload methods to add two integers, two doubles, and two floats

public class AddNumbers {

	// Method to add two integers
	public static int add(int a, int b) {
		return a + b;
	}

	// Method to add two doubles
	public static double add(double a, double b) {
		return a + b;
	}

	// Method to add two floats
	public static float add(float a, float b) {
		return a + b;
	}

	// Additional overloaded methods for three parameters
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double a, double b, double c) {
		return a + b + c;
	}

	public static float add(float a, float b, float c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// Testing integer addition
		int int1 = 10, int2 = 20;
		int intResult = add(int1, int2);
		System.out.println("Integer addition: " + int1 + " + " + int2 + " = " + intResult);

		// Testing double addition
		double double1 = 15.5, double2 = 25.3;
		double doubleResult = add(double1, double2);
		System.out.println("Double addition: " + double1 + " + " + double2 + " = " + doubleResult);

		// Testing float addition
		float float1 = 12.7f, float2 = 18.3f;
		float floatResult = add(float1, float2);
		System.out.println("Float addition: " + float1 + " + " + float2 + " = " + floatResult);

		// Testing three parameter methods
		System.out.println("\nThree parameter additions:");
		System.out.println("Integer: " + add(5, 10, 15));
		System.out.println("Double: " + add(5.5, 10.2, 15.8));
		System.out.println("Float: " + add(5.1f, 10.2f, 15.3f));
	}
}