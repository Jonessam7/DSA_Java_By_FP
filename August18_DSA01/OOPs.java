package August18_DSA01;

abstract class Animal{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void sound();
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Whooo!!");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Mewooooo");
	}
}

 public class OOPs {
	 public static void main(String[] args) {
		 Dog d = new Dog();
		 d.setName("Dogesh Bahi");
		 d.sound();

		 Cat c = new Cat();
		 c.setName("PussyCat");
		 c.sound();
	 }
}
