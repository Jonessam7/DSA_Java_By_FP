package August20_JAVA03;


public class GreetPerson {


	public static String greet(String firstName) {
		return "Hello, " + firstName + "!";
	}


	public static String greetFullName(String firstName, String lastName) {
		return "Hello, " + firstName + " " + lastName + "!";
	}

	// Method to greet with time of day
	public static String greetWithTime(String firstName, String timeOfDay) {
		return "Good " + timeOfDay + ", " + firstName + "!";
	}

	// Method to greet with full name and time of day
	public static String greetFullNameWithTime(String firstName, String lastName, String timeOfDay) {
		return "Good " + timeOfDay + ", " + firstName + " " + lastName + "!";
	}

	// Method to greet with title
	public static String greetWithTitle(String title, String firstName, String lastName) {
		return "Hello, " + title + " " + firstName + " " + lastName + "!";
	}

	// Method for formal greeting
	public static String greetFormal(String firstName, String lastName) {
		return "Good day, Mr./Ms. " + lastName + ". How are you today?";
	}

	// Method for casual greeting
	public static String greetCasual(String firstName) {
		return "Hey " + firstName + "! What's up?";
	}

	public static void main(String[] args) {
		// Test different greeting methods
		String firstName = "John";
		String lastName = "Smith";

		// Greet with first name only
		System.out.println(greet(firstName));

		// Greet with full name
		System.out.println(greetFullName(firstName, lastName));

		// Greet with time of day
		System.out.println(greetWithTime(firstName, "morning"));

		// Greet with full name and time of day
		System.out.println(greetFullNameWithTime(firstName, lastName, "evening"));

		// Greet with title
		System.out.println(greetWithTitle("Dr.", firstName, lastName));

		// Additional greeting styles
		System.out.println(greetFormal(firstName, lastName));
		System.out.println(greetCasual(firstName));

		// Test with different names
		System.out.println("\nTesting with different names:");
		System.out.println(greet("Alice"));
		System.out.println(greetFullName("Bob", "Johnson"));
		System.out.println(greetWithTime("Sarah", "afternoon"));
		System.out.println(greetWithTitle("Prof.", "Emma", "Wilson"));
	}
}
