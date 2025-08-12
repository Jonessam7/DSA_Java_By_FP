package August11_DSA01;

import java.util.Scanner;

abstract class Vehical {
	abstract void Wheels();
	abstract void Color();
	abstract void Engine();
	abstract void Brand();
	abstract void Model();

	void print(String message){
		String className = this.getClass().getSimpleName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("[" + className + "] " + methodName + " → " + message);
	}
	void print(int message){
		String className = this.getClass().getSimpleName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("[" + className + "] " + methodName + " → " + message);
	}
	void print(double message){
		String className = this.getClass().getSimpleName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("[" + className + "] " + methodName + " → " + message);
	}
	void print(float message){
		String className = this.getClass().getSimpleName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("[" + className + "] " + methodName + " → " + message);
	}
	void print(char message){
		String className = this.getClass().getSimpleName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("[" + className + "] " + methodName + " → " + message);
	}
}



class Cars extends Vehical {
	@Override
	void Wheels() {
		print(4);
	}

	@Override
	void Color() {
		print("Red");
	}

	@Override
	void Engine() {
		print("V8");
	}

	@Override
	void Brand() {
		print("BMW");
	}

	@Override
	void Model() {
		print("M5");
	}
	public void Modification(){
		print("Modified-2020");
	}
}
class Bike extends Cars{
	@Override
	void Wheels() {
		print(2);
	}

	@Override
	void Color() {
		super.Color();
	}

	@Override
	void Brand() {
		super.Brand();
	}

	@Override
	void Engine() {
		print("1000cc");
	}

	@Override
	void Model() {
		print("RR");
	}

	@Override
	public void Modification() {
		super.Modification();
	}
}
class Cycle{
	public String Brand;
	public int price;
	public boolean Gearbox;
}

public class Vehicals {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cars c = new Cars();
		c.Brand();
		c.Model();
		c.Engine();
		c.Color();
		c.Wheels();
		c.Modification();

		Bike b = new Bike();
		b.Brand();
		b.Model();
		b.Engine();
		b.Color();
		b.Wheels();
		b.Modification();

		Cycle cy = new Cycle();
		System.out.println("Enter the ");
		cy.Brand = in.next();
		System.out.println(cy.Brand);

	}
}




