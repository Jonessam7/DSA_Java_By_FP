package August11_DSA01;

public class Car {
	String color;
	String brand;
	int wheels;
	int model;
	double speed;
	boolean OffRoading;

	// Override toString to print car details
	@Override
	public String toString() {
		String className = this.getClass().getSimpleName();
		return className+" {" +
				"brand='" + brand + "\n"+
				", color='" + color +"\n"+
				", model=" + model +"\n"+
				", speed=" + speed +"\n"+
				", wheels=" + wheels +"\n"+
				", OffRoading=" + OffRoading +"\n"+
				'}';
	}

	public static void main(String[] args) {
		Car thar = new Car();
		thar.brand = "Mahindra";
		thar.color = "black";
		thar.model = 2025;
		thar.speed = 120.5;
		thar.wheels = 4;
		thar.OffRoading = true;

		Car swift = new Car();
		swift.brand = "Maruthi";
		swift.color = "white";
		swift.model = 2021;
		swift.speed = 80;
		swift.wheels = 4;
		swift.OffRoading = false;

		Car supra = new Car();
		supra.brand = "Toyota";
		supra.color = "black";
		supra.model = 2019;
		supra.speed = 150;
		supra.wheels = 4;
		supra.OffRoading = false;

		// Print the car details using toString
		System.out.println(thar);
		System.out.println(swift);
		System.out.println(supra);
	}
}
