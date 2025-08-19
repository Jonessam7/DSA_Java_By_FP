package August13_DSA03;

import java.util.Scanner;
import java.util.stream.IntStream;

public class strFunction {
	public static void main(String[] args) {
		var in = new Scanner(System.in);
//		char val = in.nextLine().charAt(0);
		System.out.print("Enter a positive number: ");
		var input = in.nextLine();
		try{
			var num = Integer.parseInt(input);
			if(num <= 0){
				System.out.println("its Negative");
				return;
			}else{
				System.out.println("Yeah its Positive");
			}
			System.out.print("Enter the anything: ");
			var str = in.nextLine();
			IntStream.range(0, num).forEach(n-> System.out.println(str));
		}catch (NumberFormatException e){
			System.out.println("Rejected! it may Negative or alphabers or Special chars");
		}


	}
}
