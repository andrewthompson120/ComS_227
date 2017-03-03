package lab6;

import java.util.Scanner;

public class InitialsMachine {
	public static void main(String[] argc) {
		
		String nameIn = "dfsdf asdfas tTs Tdsv";
		String initReturn = "";
		int firstVowel = 0;
		System.out.println("Name entered: " + nameIn);
	
		initReturn = getInitials(nameIn);
		System.out.println(initReturn);
		
		firstVowel = getFirstVowel(nameIn);
		System.out.println("First vowel at: " + firstVowel);
		
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
	
	public static int getFirstVowel(String name) {
		
		int stringLength = name.length();
		int firstIndex = -1;
		
		for (int i = 0; i < stringLength; i++) {
			if(name.charAt(i) == 'a') {
				firstIndex = name.indexOf('a');
				break;
			}
			else if(name.charAt(i) == 'e') {
				firstIndex = name.indexOf('e');
				break;
			}
			else if(name.charAt(i) == 'i') {
				firstIndex = name.indexOf('i');
				break;
			}
			else if(name.charAt(i) == 'o') {
				firstIndex = name.indexOf('o');
				break;
			}
			else if(name.charAt(i) == 'u') {
				firstIndex = name.indexOf('u');
				break;
			}
			else if(name.charAt(i) == 'A') {
				firstIndex = name.indexOf('A');
				break;
			}
			else if(name.charAt(i) == 'E') {
				firstIndex = name.indexOf('E');
				break;
			}
			else if(name.charAt(i) == 'I') {
				firstIndex = name.indexOf('I');
				break;
			}
			else if(name.charAt(i) == 'O') {
				firstIndex = name.indexOf('O');
				break;
			}
			else if(name.charAt(i) == 'U') {
				firstIndex = name.indexOf('U');
				break;
			}
		}
		
		return firstIndex;
		
	}
	
}
