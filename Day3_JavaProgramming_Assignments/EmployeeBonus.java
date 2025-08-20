package Day3_JavaProgramming_Assignments;
 class Employee{
	 long salary;
	 float per=0.1f;

Employee(){

}
	 public Employee(long salary, float per) {
		 this.salary = salary;
		 this.per = per;
	 }

	 public Employee(long salary) {
		 this.salary = salary;
	 }

	 public long getSalary() {
		 return salary;
	 }

	 public void setSalary(long salary) {
		 this.salary = salary;
	 }
	 void calculateBonus(){
		 System.out.println( "Manager Bonus: "+(double) ((getSalary()* per) /100 ));
	 }
}

class Manager extends Employee{
	Manager(){

	}
	public Manager(long salary, float per) {
		super(salary);
		this.per = per;
	}

	float per = 20.0f;
	void calculateBonus(){
		System.out.println( "Manager Bonus: "+(double) ((getSalary()* per) /100 ));
	}
}
class Developer extends Manager{
	public Developer() {
	}

	public Developer(long salary, float per) {
		super(salary, per);
	}
	float per = 10.0f;
	@Override
	void calculateBonus(){
		System.out.println( "Developer Bonus: "+(double) ((getSalary()* per) /100 ));
	}

}
class Intern extends Developer{
	public Intern() {
	}

	public Intern(long salary, float per) {
		super(salary, per);
	}
	float per = 5.0f;
	@Override
	void calculateBonus(){
		System.out.println( "Intern Bonus: "+(double) ((getSalary()* per) /100 ));
	}
}
public class EmployeeBonus {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setSalary(80000);
		m.calculateBonus();

		Developer d = new Developer();
		d.setSalary(60000);
		d.calculateBonus();

		Intern i = new Intern();
		i.setSalary(12000);
		i.calculateBonus();
	}

}
