package Day3_JavaProgramming_Assignments;
class Animal{
	void makeSound(String Sound){
		System.out.println("The "+getClass().getSimpleName()+" says "+ Sound);
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
class Cow  extends Animal{}

public class AnimalSounds {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound("Boww Boww");

		Cat c = new Cat();
		c.makeSound("Meoww Meoww");

		Cow co = new Cow();
		co.makeSound("Moooo Moooo");
	}

}
