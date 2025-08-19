package August13_DSA03;

import java.util.Scanner;

public class strTOint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Alphabets: ");
		char str = in.nextLine().charAt(0);
		System.out.println("The Number: "+(int) str);

		System.out.println("Enter the Numbers: ");
		int val = in.nextInt();
		if(val >= 65 && val <= 90){
			System.out.println("It is Small letters: "+(char) val);
		} else if (val >= 97 && val <= 122) {
			System.out.println("It is Big letters: "+(char) val);
		}else {
			System.out.println("For Small letters choose 65 - 90");
			System.out.println("For Big Letters choose 97 - 122");

		}

	}
}
