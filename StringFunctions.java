class StringFunctions {
	public void run() {
		String str = "Hello World";
		System.out.println("Length: " + str.length());
		System.out.println("Char at 4: " + str.charAt(4));
		System.out.println("Substring(0,5): " + str.substring(0, 5));
		System.out.println("To Uppercase: " + str.toUpperCase());
		System.out.println("To Lowercase: " + str.toLowerCase());
		System.out.println("Replace l with x: " + str.replace('l', 'x'));
		System.out.println("Index of 'o': " + str.indexOf('o'));
		System.out.println("Starts with 'Hel'? " + str.startsWith("Hel"));
		System.out.println("Ends with 'ld'? " + str.endsWith("ld"));
		System.out.println("Equals 'Hello World'? " + str.equals("Hello World"));
		System.out.println("Trim: " + "   spaces   ".trim());
	}
}
