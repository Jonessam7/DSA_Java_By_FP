package August18_DSA01.Assignment01;

public class PalindromeNumberCheck {
	public static int reverse(int n){
		int digit = (int)(Math.log10(n))  + 1;
		return reverseHelper(n,digit);
	}
	private static int reverseHelper(int n, int digits){
		if(n < 10){
			return n;
		}
  int lastDigit = n % 10;
		return (int) (lastDigit * Math.pow(10 ,digits -1)) + reverseHelper(n/10 , digits-1);
	}

	public static boolean isPalindrome(int n){
return n == reverse(n);
	}



	public static void main(String[] args) {
		boolean ans = isPalindrome(121);
		if(ans){
			System.out.println("Is Palindrome");
		}else{
			System.out.println("Its not Palindrome");
		}

	}
}
