package August18_DSA01.Assignment01;

public class SumOfDigits {
	public static int AddOfNumbers(int n){
		if (n == 0){
			return 0;
		}
		return n % 10 + AddOfNumbers(n /10);
	}
	public static void main(String[] args) {
		int ans = AddOfNumbers(123456);
		System.out.println(ans);
	}
}
