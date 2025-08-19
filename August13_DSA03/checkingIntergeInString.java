package August13_DSA03;

import java.util.Scanner;

public class checkingIntergeInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean isInteger = true;

		try{
			Integer.parseInt(str);
		}catch (NumberFormatException e){
			isInteger=false;
		}
		if(isInteger){
			System.out.println("It have integer");
		}else {
			System.out.println("it Doesn't Have");
		}
	}
}
