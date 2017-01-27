package Lab2;

public class StringTest {
	static public void main(String[] argc){
		
		String message;
		message = "Hello, world!";
		
		char theChar = message.charAt(0);
		System.out.println(theChar);
		
		theChar = message.charAt(1);
		System.out.println(theChar);
		
		System.out.println(message.toUpperCase());
		System.out.println(message.substring(0,5));
		System.out.println(message.replace("o","*"));
		
	}
}
