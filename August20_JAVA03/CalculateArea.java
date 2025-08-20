package August20_JAVA03;

// Assignment 11: Calculate area - Overload methods to calculate the area of a square (1 parameter) and rectangle (2 parameters)

public class CalculateArea {

	// Method to calculate area of a square
	public static double calculateArea(double side) {
		return side * side;
	}

	// Method to calculate area of a rectangle
	public static double calculateArea(double length, double width) {
		return length * width;
	}

	// Additional overloaded method for circle area
	public static double calculateArea(double radius, String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			return Math.PI * radius * radius;
		}
		return 0;
	}

	// Method to calculate area of a triangle
	public static double calculateArea(double base, double height, String shape) {
		if (shape.equalsIgnoreCase("triangle")) {
			return 0.5 * base * height;
		}
		return 0;
	}

	// Method using integer parameters for square
	public static int calculateArea(int side) {
		return side * side;
	}

	// Method using integer parameters for rectangle
	public static int calculateArea(int length, int width) {
		return length * width;
	}

	public static void main(String[] args) {
		// Calculate area of square
		double squareSide = 5.5;
		double squareArea = calculateArea(squareSide);
		System.out.println("Area of square with side " + squareSide + " = " + squareArea);

		// Calculate area of rectangle
		double length = 8.0, width = 6.0;
		double rectangleArea = calculateArea(length, width);
		System.out.println("Area of rectangle with length " + length + " and width " + width + " = " + rectangleArea);

		// Calculate area of circle
		double radius = 4.0;
		double circleArea = calculateArea(radius, "circle");
		System.out.println("Area of circle with radius " + radius + " = " + String.format("%.2f", circleArea));

		// Calculate area of triangle
		double base = 10.0, height = 8.0;
		double triangleArea = calculateArea(base, height, "triangle");
		System.out.println("Area of triangle with base " + base + " and height " + height + " = " + triangleArea);

		// Using integer parameters
		int intSquareSide = 4;
		int intSquareArea = calculateArea(intSquareSide);
		System.out.println("Area of integer square with side " + intSquareSide + " = " + intSquareArea);

		int intLength = 7, intWidth = 5;
		int intRectangleArea = calculateArea(intLength, intWidth);
		System.out.println("Area of integer rectangle with length " + intLength + " and width " + intWidth + " = " + intRectangleArea);
	}
}
