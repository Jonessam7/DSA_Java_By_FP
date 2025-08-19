package August18_DSA01.Assignment01;

public class ReverseANumber {
//	public static void ReverseNumber(int n){
//		if(n == 0){
//			return;
//		}
//		System.out.println(n);
//		ReverseNumber(--n);
//	}

	public static void ReverseNumber(int n){
		if(n == 0){
			return;
		}
		System.out.print(n % 10+" ");
		ReverseNumber(n/10);

	}

	public static void main(String[] args) {
		ReverseNumber(12345);
	}
}
