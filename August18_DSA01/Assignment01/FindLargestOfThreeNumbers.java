package August18_DSA01.Assignment01;

public class FindLargestOfThreeNumbers {
	public static int FindLargestNum(int n ){
		if(n < 10){
			return n;
		}
		int lastDigit = n % 10;

		int max = FindLargestNum( n / 10);
		return Math.max(lastDigit ,max);

	}
	public static void main(String[] args) {
		int ans = FindLargestNum(321);
		System.out.println(ans);
	}
}
