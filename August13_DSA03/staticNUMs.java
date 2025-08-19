package August13_DSA03;

public class staticNUMs {
	int data = 11;
	static int typ = 12;

	public void add() {
		System.out.println("Result_> " + (data + typ));
	}

	public static void main(String[] args) {
		staticNUMs num1 = new staticNUMs();
		staticNUMs num2 = new staticNUMs();

		System.out.println("1data-> " + num1.data);
		System.out.println("1static type-> " + staticNUMs.typ);

		System.out.println("2data-> " + num2.data);
		System.out.println("2static type-> " + staticNUMs.typ);

		staticNUMs.typ = 100;

		System.out.println("1data-> " + num1.data);
		System.out.println("1static type-> " + staticNUMs.typ);

		System.out.println("2data-> " + num2.data);
		System.out.println("2static type-> " + staticNUMs.typ);

		num1.add();   // reuse existing object
		staticNUMs.typ=200;
		num2.add();
	}
}
