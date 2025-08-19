package August18_DSA01;

public class StaticWorks {
	int val1 = 100;
	static int StatVal = 1 ;

	public void add(){
		System.out.println( val1 + StatVal);
	}
	public static void main(String[] args) {
		StaticWorks a = new StaticWorks();
		System.out.println(a.val1);
		System.out.println(StaticWorks.StatVal);

		a.add();
		StaticWorks.StatVal=233;
		a.add();
		a.val1=544;
		a.add();



	}
}
