package Day3_JavaProgramming_Assignments;
class Power{
	void powerUsage(double wat){
			System.out.println("The "+getClass().getSimpleName()+" Consume "+ wat+"W");
	}
}
class Fan extends Power{}
class AC extends Power{}
class Heater extends Power{}
public class AppliancePowerConsumption {
	public static void main(String[] args) {
		Fan f = new Fan();
		f.powerUsage(75);

		AC ac = new AC();
		ac.powerUsage(1500);

		Heater h = new Heater();
		h.powerUsage(2000);
	}
}
