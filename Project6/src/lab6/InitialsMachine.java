package lab6;

import java.util.Scanner;

public class InitialsMachine {
	public static void main(String[] argc) {
		
		String nameIn = "dfsdf asdfas tTs Tdsv";
		String initReturn = "";
	
		initReturn = getInitials(nameIn);
		System.out.println(initReturn);
		
	}
	
	public static String getInitials(String name) {
		
		String initials = "";
		String currentString = "";
		Scanner in = new Scanner(name);
		
		while(in.hasNext()) {			
			currentString = in.next();
			initials = initials + currentString.charAt(0);
		}
		
		in.close();
		return initials;
		
	}
}
