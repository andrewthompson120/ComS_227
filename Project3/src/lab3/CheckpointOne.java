package lab3;

public class CheckpointOne {
	
	public static void main(String[] argc) {
		
		// Question 1
		int i;
		int Answer = 0;		
		for (i = 0; i < 1000000; i++) {			
			Answer = i % 7;			
		}
		System.out.println("Checkpoint: 1, Question 1 Answer: " + Answer);
		/*
		 * Write a line of code that determines the one millionth number in this sequence: n % 7
		 */
		
		
		// Question 3
		System.out.println("Question 3: ");
		int questionThreeInt = 42;
		String questionThreeString = "" + questionThreeInt;
		System.out.println(questionThreeString); // Should be 42
		questionThreeInt = 0; // Resets the int and prints to ensure
		System.out.println(questionThreeInt);
		questionThreeInt = Integer.parseInt(questionThreeString);
		System.out.println(questionThreeInt); //Should print 42
		questionThreeString = "Hello There!";
		questionThreeInt = 0;
		questionThreeInt = Integer.parseInt(questionThreeString);
		System.out.println(questionThreeInt); 
		
		
	}
	
}
