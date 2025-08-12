package August11_DSA01;

import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

class Grade{
	String name;
	int grade;
	String classes;
	String RollNumber;
	boolean passed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(String rollNumber) {
		RollNumber = rollNumber;
	}

	public Grade() {

	}
	public Grade(String name, int grade, String classes, String rollNumber) {
		this.name = name;
		this.grade = grade;
		this.classes = classes;
		RollNumber = rollNumber;
//		this.passed = passed;
	}

	public void GetDetails() {
		System.out.println("=========Details========");
		System.out.println("School Name: " + name);
		System.out.println("Class: " + classes);
		System.out.println("Grade: " + grade);
		System.out.println("RollNumber:"+RollNumber);
		System.out.println("Grade:"+grade);
		passed= grade >= 5;
		System.out.println("Passed: " + passed);
	}
}
public class School{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade s = new Grade();

		System.out.print("Enter the name of the school: ");
		 s.setName(sc.nextLine());

		System.out.print("Enter the class of the student: ");
		s.setClasses(sc.nextLine());

		System.out.println("Enter the Roll Number of the student: ");
		s.setRollNumber(sc.nextLine());

		System.out.println("Enter the Grade of the student: ");
		s.setGrade(sc.nextInt());

		s.GetDetails();


		Grade ns = new Grade("Jones",7,"10th","6462638");
		ns.GetDetails();



	}

}
