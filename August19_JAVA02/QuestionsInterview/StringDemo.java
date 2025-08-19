package August19_JAVA02.QuestionsInterview;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		if(str1.equals(str3) ){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	public static void CompareToStr (){
		String str1 = "Apple";
		String str2 = "Banana";
		System.out.println(str1.compareTo("Apple"));
	}


}
