package August20_JAVA03.oops;

import August11_DSA01.Car;

import java.util.Random;
import java.util.Scanner;

abstract class Employee{
	Random r = new Random();
	String Name;
	long id = 10000000 + r.nextInt(90000000);

	Employee(){

	}

	public Employee(long id, String name) {
		this.id = id;
		Name = name;
	}

	public long getId() {
		return id;
	}

//	public void setId(long id) {
//		this.id = id;
//	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	abstract double calculateSalary();
	public void displayDetails(){
		System.out.println("name of the Employee: "+getName());
		System.out.println("Id of the Employee: "+ getId());
	}

}
class FullTimeEmployee extends Employee{
	double monthlySalary;

	FullTimeEmployee(){

	}

	public FullTimeEmployee(long id, String name, double monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double calculateSalary(){
		return getMonthlySalary();
	}

}

class ContractEmployee extends Employee{
	private double HourlyRate = 1500;
	 double HoursWorked;

	ContractEmployee(){

	}
	public ContractEmployee(long id, String name, double hourlyRate, double hoursWorked) {
		super(id, name);
		HoursWorked=hoursWorked;
	}

	public double getHourlyRate() {
		return HourlyRate;
	}


	public double getHoursWorked() {
		return HoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		HoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return getHourlyRate() * getHoursWorked();
	}
}


public class PayrollSystem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the type Of the Job (fe / ce): ");
		String Input = in.nextLine();
		if(Input.equals("fe")) {
			FullTimeEmployee e = new FullTimeEmployee();
			System.out.print("Name of Employee: ");
			e.setName(in.nextLine());
//			in.nextLine();
			System.out.print("Enter the salary: ");
			e.setMonthlySalary(in.nextLong());
			System.out.println("Full Time Employee Details:");
			e.displayDetails();
			System.out.println("Monthly Salary: " + e.calculateSalary());
		}else if(Input.equals("ce")){
			ContractEmployee c = new ContractEmployee();
			System.out.print("Name of Employee: ");
			c.setName(in.nextLine());
//			in.nextLine();
			System.out.print("Enter Hours you work: ");
			c.setHoursWorked(in.nextInt());
			System.out.println("\nContract Employee Details:");
			c.displayDetails();
			System.out.println("Contract Salary: " + c.calculateSalary());
		}


	}
}
