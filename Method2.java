class Meth{

	private class Meths{
		public int add(int a, int b)
		{
			return a+b;
		}
		public int add(int a, int b,int c)
		{
			return a+b+c;
		}
		public double add(int a, double b)
		{
			return a+b;
		}
		public void greet(String name)
		{
			System.out.println("Hi There "+name);
		}
	}

	// Public method to access private inner class
	public void useMeths() {
		Meths m = new Meths();
		System.out.println(m.add(2, 3));
		System.out.println(m.add(2, 3, 5));
		System.out.println(m.add(2, 3.87));
		m.greet("Aradhya");
	}
}

public class Method2 {
	public static void main(String[] args) {
		Meth outer = new Meth();

		outer.useMeths(); // access private class functionality
	}
}
