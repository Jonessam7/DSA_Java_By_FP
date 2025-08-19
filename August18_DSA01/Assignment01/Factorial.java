package August18_DSA01.Assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
//	public static void FractionalNum(int n){
//		long fact = 1;
//		for (int i = 1; i <= n; i++) {
//			fact *= i;
//		}
//		System.out.println("Factorial of " + n + " is: " + fact);
//	}

	public int FcatorialNum(int n){
		if(n == 1){
			return 1;
		}
		return n * FcatorialNum(--n);
	}
	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<>();
		Factorial f = new Factorial();
int ans = f.FcatorialNum(4);
		System.out.println(ans);
//		FractionalNum(4);
	}
}
