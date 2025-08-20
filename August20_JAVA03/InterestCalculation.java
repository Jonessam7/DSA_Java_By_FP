package August20_JAVA03;

// Assignment 14: Interest calculation - Overload methods to calculate simple interest and compound interest

public class InterestCalculation {

	// Method to calculate simple interest
	public static double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}

	// Method to calculate compound interest
	public static double calculateCompoundInterest(double principal, double rate, double time) {
		return principal * Math.pow((1 + rate/100), time) - principal;
	}

	// Method to calculate compound interest with different compounding frequency
	public static double calculateCompoundInterest(double principal, double rate, double time, int compoundFrequency) {
		return principal * Math.pow((1 + (rate/100)/compoundFrequency), compoundFrequency * time) - principal;
	}

	// Method to calculate total amount with simple interest
	public static double calculateTotalAmountSimple(double principal, double rate, double time) {
		return principal + calculateSimpleInterest(principal, rate, time);
	}

	// Method to calculate total amount with compound interest
	public static double calculateTotalAmountCompound(double principal, double rate, double time) {
		return principal + calculateCompoundInterest(principal, rate, time);
	}

	// Method using integer parameters for simple interest
	public static double calculateSimpleInterest(int principal, int rate, int time) {
		return calculateSimpleInterest((double)principal, (double)rate, (double)time);
	}

	// Method using integer parameters for compound interest
	public static double calculateCompoundInterest(int principal, int rate, int time) {
		return calculateCompoundInterest((double)principal, (double)rate, (double)time);
	}

	// Method to display interest calculation results
	public static void displayInterestResults(double principal, double rate, double time) {
		double simpleInterest = calculateSimpleInterest(principal, rate, time);
		double compoundInterest = calculateCompoundInterest(principal, rate, time);
		double totalSimple = calculateTotalAmountSimple(principal, rate, time);
		double totalCompound = calculateTotalAmountCompound(principal, rate, time);

		System.out.println("Principal: $" + String.format("%.2f", principal));
		System.out.println("Rate: " + rate + "%");
		System.out.println("Time: " + time + " years");
		System.out.println("Simple Interest: $" + String.format("%.2f", simpleInterest));
		System.out.println("Total Amount (Simple): $" + String.format("%.2f", totalSimple));
		System.out.println("Compound Interest: $" + String.format("%.2f", compoundInterest));
		System.out.println("Total Amount (Compound): $" + String.format("%.2f", totalCompound));
		System.out.println("Difference: $" + String.format("%.2f", compoundInterest - simpleInterest));
		System.out.println("-------------------------------------------");
	}

	public static void main(String[] args) {
		// Test case 1
		double principal1 = 10000;
		double rate1 = 5;
		double time1 = 3;

		System.out.println("Test Case 1:");
		displayInterestResults(principal1, rate1, time1);

		// Test case 2
		double principal2 = 5000;
		double rate2 = 8.5;
		double time2 = 2;

		System.out.println("Test Case 2:");
		displayInterestResults(principal2, rate2, time2);

		// Test with different compounding frequencies
		System.out.println("Compound Interest with different frequencies:");
		System.out.println("Principal: $" + principal1 + ", Rate: " + rate1 + "%, Time: " + time1 + " years");

		double monthlyCompound = calculateCompoundInterest(principal1, rate1, time1, 12);
		double quarterlyCompound = calculateCompoundInterest(principal1, rate1, time1, 4);
		double yearlyCompound = calculateCompoundInterest(principal1, rate1, time1, 1);

		System.out.println("Monthly compounding: $" + String.format("%.2f", monthlyCompound));
		System.out.println("Quarterly compounding: $" + String.format("%.2f", quarterlyCompound));
		System.out.println("Yearly compounding: $" + String.format("%.2f", yearlyCompound));

		// Test with integer parameters
		System.out.println("\nUsing integer parameters:");
		int intPrincipal = 15000;
		int intRate = 6;
		int intTime = 4;

		double intSimpleInterest = calculateSimpleInterest(intPrincipal, intRate, intTime);
		double intCompoundInterest = calculateCompoundInterest(intPrincipal, intRate, intTime);

		System.out.println("Simple Interest (int params): $" + String.format("%.2f", intSimpleInterest));
		System.out.println("Compound Interest (int params): $" + String.format("%.2f", intCompoundInterest));
	}
}