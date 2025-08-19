package August19_JAVA02.QuestionsInterview.StringsWorks;

public class UpperLowerOrder {
	public static void main(String[] args) {
		String input = "Hello1234!@#$World";
		StringBuilder  Upper = new StringBuilder();
		StringBuilder lower = new StringBuilder();
		for (int i = 0; i < input.length() ; i++) {
			char c = input.charAt(i);
			if(c >='A' && c <='Z'){
				Upper.append(c);
			} else if (c >= 'a' && c <='z') {
				lower.append(c);
			}
		}
		System.out.println("Upper: "+Upper);
		System.out.println("Lower: "+ lower);




	}
	}


