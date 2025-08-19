package August19_JAVA02.QuestionsInterview.StringsWorks;

public class LowerToUpper {
	public static void main(String[] args) {
		String input = "Helloworld";
		String var = "";

    for(char c : input.toCharArray()){
		    if(c >='a' && c <='z'){
			    var += (char)(c - 32);
		    }else{
				var+=c;
		    }
		}
		System.out.println("Converted: " + var);
	}
}
