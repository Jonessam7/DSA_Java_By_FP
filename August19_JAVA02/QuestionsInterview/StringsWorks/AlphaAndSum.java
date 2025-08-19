package August19_JAVA02.QuestionsInterview.StringsWorks;

public class AlphaAndSum {
	public static void main(String[] args) {
		String input = "Hello!@#12345World";
		StringBuilder alpha = new StringBuilder();
		int sum =0;

		for(char c : input.toCharArray()){
			if(c >='A' && c <= 'Z' || c >='a' && c<= 'z'){
				alpha.append(c);
			}else if(c >='0' && c<='9'){
				sum+=c-'0';
			}
		}
		System.out.println("Alphabets: " + alpha);
		System.out.println("Sum of numbers: " + sum);
	}
}
