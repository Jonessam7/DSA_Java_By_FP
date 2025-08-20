package August19_JAVA02.QuestionsInterview.Models.Vehical;

import java.util.ArrayList;

public class Vehivals {
	private String brand;
	private String color;
	private String invented;
	private String modelName;
	private int numberOfStock;
	private Boolean Register;
	private Boolean DrivingLicence;


	public Vehivals(){

	}
	public Vehivals(String brand, String color, String invented, String modelName, int numberOfStock, Boolean Register,Boolean DrivingLicence) {
		this.brand = brand;
		this.color = color;
		this.invented = invented;
		this.modelName = modelName;
		this.numberOfStock = numberOfStock;
		this.Register= Register;
		this.DrivingLicence= DrivingLicence;
	}

	// Getters and Setters
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }

	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }

	public String getInvented() { return invented; }
	public void setInvented(String invented) { this.invented = invented; }

	public String getModelName() { return modelName; }
	public void setModelName(String modelName) { this.modelName = modelName; }

	public int getNumberOfStock() { return numberOfStock; }
	public void setNumberOfStock(int numberOfStock) { this.numberOfStock = numberOfStock; }

	public Boolean getDrivingLicence() {
		return DrivingLicence;
	}

	public void setDrivingLicence(Boolean drivingLicence) {
		DrivingLicence = drivingLicence;
	}

	public Boolean getRegister() {
		return Register;
	}

	public void setRegister(Boolean register) {
		Register = register;
	}
}
 class Cars extends Vehivals{
	private String sound;
	private String Modifaction;

	public Cars(){

	}
	public Cars(String brand, String color, String invented, String modelName, int numberOfStock, Boolean Register, Boolean DrivingLicence, String modifaction, String sound) {
		super(brand, color, invented, modelName, numberOfStock, Register, DrivingLicence);
		Modifaction = modifaction;
		this.sound = sound;
	}

	public String getModifaction() {
		return Modifaction;
	}

	public void setModifaction(String modifaction) {
		Modifaction = modifaction;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}


