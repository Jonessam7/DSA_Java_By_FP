package August18_DSA01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountAutomation {
	private String name;
	private long value;
	private long AccNumber;
	private static int count = 0;

	public long getAccNumber() {
		return AccNumber;
	}

	public void setAccNumber(long accNumber) {
		AccNumber = accNumber;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BankAccountAutomation.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	BankAccountAutomation(){
		this("Jones",10000);
	}

	BankAccountAutomation(String name, long value) {
		this.name = name;
		this.value = value;
		AccNumber = (long) (Math.random() * 900000000L) + 100000000L;
		count++;
	}

	BankAccountAutomation(String name) {
		this.name = name;
		this.value = 0;
		AccNumber = (long) (Math.random() * 900000000L) + 100000000L;
		count++;
	}

	public void withDraw(int val) {
		if (val > value) {
			System.out.println(" Insufficient Balance. Available: " + getValue());
		} else if (val == 0) {
			System.out.println(" Current Balance: " + getValue());
		} else {
			value -= val;
			System.out.println(" Current Balance after withdraw: " + getValue());
		}
	}

	void show() {
		System.out.println("Customer " + getCount());
		System.out.println("Name: " + getName());
		System.out.println("AccNumber:" + getAccNumber());
		System.out.println("Balance: " + getValue());
		System.out.println("THANK YOU FOR BANKING WITH US "+name.toUpperCase()+"\n");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<BankAccountAutomation> accounts = new ArrayList<>();

		while (true) {
			BankAccountAutomation account = new BankAccountAutomation();
			System.out.println("Enter customer name (or type 'exit' to stop): ");
			String name = in.nextLine();
			if (name.equalsIgnoreCase("exit")) break;
			account.setName(name);

			System.out.println("Enter initial deposit amount: ");
			long val = in.nextLong();
			account.setValue(val);
			in.nextLine();

			accounts.add(account);
			System.out.println("Account created successfully!\n");

			System.out.println("Do you want to withdraw now? (yes/no): ");
			String choice = in.nextLine();
			if (choice.equalsIgnoreCase("yes")) {
				System.out.println("Enter withdraw amount: ");
				int withdrawAmt = in.nextInt();
				in.nextLine();
				account.withDraw(withdrawAmt);
			}
		}

		System.out.println("\n==== All Customer Accounts ====");
		for (BankAccountAutomation acc : accounts) {
			acc.show();
		}

		System.out.println("Total Customers: " + BankAccountAutomation.getCount());
	}
}
