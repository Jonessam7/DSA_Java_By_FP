package August19_JAVA02.QuestionsInterview.StringsWorks;

public class UpperToLower {
	public static void main(String[] args) {
		String input = "Helloworld";
		String var = "";

    for(char c : input.toCharArray()){
		    if(c >='A' && c <='Z'){
			    var += (char)(c + 32);
		    }else{
				var+=c;
		    }
		}
		System.out.println("Converted: " + var);
	}
}
