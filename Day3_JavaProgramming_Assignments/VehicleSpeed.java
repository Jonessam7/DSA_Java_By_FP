package Day3_JavaProgramming_Assignments;

import August19_JAVA02.QuestionsInterview.Models.Vehical.Vehivals;

class Vehicle{
//	double Speed;
//
//	public Vehicle(double fast) {
//		this.Speed = fast;
//	}
//
//	public double getSpeed() {
//		return Speed;
//	}
//
//	public void setSpeed(double speed) {
//		Speed = speed;
//	}
//

	void Speed(long speed){
		System.out.println("The Speed of the "+getClass().getSimpleName()+": "+ speed+"km/h");
	}
	public Vehicle() {
	}

}
class Car extends Vehicle{

//	@Override
//	void Speed(long speed){
//		System.out.println("The Speed of the "+getClass().getSimpleName()+": "+ speed+"km/h");
//	}void display(){
//		System.out.println("The Speed of the "+getClass().getSimpleName()+": "+ getSpeed()+"km/h");
//	}
}
class Bike extends Car{
//	@Override
//	void Speed(long speed){
//		System.out.println("The Speed of the "+getClass().getSimpleName()+": "+ speed+"km/h");
//	}
}
class Truck extends Bike{
//	@Override
//	void display(){
//		System.out.println("The Speed of the "+getClass().getSimpleName()+": "+ getSpeed()+"km/h");
//	}
}
public class VehicleSpeed {
	public static void main(String[] args) {
		Car c = new Car();
		c.Speed(120);

		Bike b = new Bike();
		b.Speed(80);

		Truck t = new Truck();
		t.Speed(60);
	}
}
