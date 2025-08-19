package August18_DSA01.Assignment01;

public class PrimeCheckRecursive {
	public static boolean isPrime(int n, int i) {
		if (n <= 1) return false;

		if (i * i > n) return true;

		if (n % i == 0) return false;

		return isPrime(n, i + 1);
	}

	public static void main(String[] args) {
		boolean ans = isPrime(7,2);
		System.out.println(ans);
	}
}
