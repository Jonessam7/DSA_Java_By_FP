package August12_DSA02;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String original = sc.nextLine();


		String reversed = new StringBuilder(original).reverse().toString();

		if (original.equals(reversed)) {
			System.out.println(original + " is a palindrome.");
		} else {
			System.out.println(original + " is NOT a palindrome.");
		}

		sc.close();
	}


}
