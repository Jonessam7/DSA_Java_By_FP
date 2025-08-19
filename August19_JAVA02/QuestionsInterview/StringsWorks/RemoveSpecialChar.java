package August19_JAVA02.QuestionsInterview.StringsWorks;

public class RemoveSpecialChar {
	public static void main(String[] args) {
			String var = "Hello!@#$%World(*&^";
//			String ne = var.replaceAll("[^a-zA-Z0-9]","");
       String replaced = "";
		for (int i = 0; i < var.length() ; i++) {
			char ch = var.charAt(i);
			if(ch >='A'&& ch<='Z'||
				ch >='a' && ch <='z'||
					ch >='0' && ch <='9'){
				replaced += ch;
			}
		}
		System.out.println(replaced);
	}
}
