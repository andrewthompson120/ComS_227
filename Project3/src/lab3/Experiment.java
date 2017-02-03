package lab3;

public class Experiment {
	
	public static void main(String[] argc) {
		int Div = 1; 
		/*
		 * used for the int that is divided by 0
		 */
		
		String Test = "Abcdefghij";
		/*
		 * string to test charAt(11)
		 */

		
		System.out.println(Div/0);
		System.out.println(Test.charAt(11));
		System.out.println(Test.substring(2,2));
		//System.out.println(5);
	}
}
