package August18_DSA01.Assignment01;

public class CheckEvenOrOdd {
	public static String EvenOrOdd(int n){
		if (n % 2 == 0){
			return "Even";
		}

		return "Odd";
	}

	public static void main(String[] args) {
		String ans = EvenOrOdd(7);
		System.out.println(ans);
	}
}
