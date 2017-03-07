package mini1;


public class TallyNumber {
	
	private int userValue = 0; // Gets the user value in the constructor
	private String userString = ""; // Gets the user string from the constructor
	private int currentIntTally = 0; // Running int tally
	private String currentStrTally = ""; // Running String tally 
	
	/**
	 * Constructs a tally number with the given integer value.
	 * @param givenValue
	 */
	public TallyNumber(int givenValue) {
		userValue = givenValue;
		currentIntTally = userValue;
	}
	
	/**
	 * Constructs a TallyNumber with the given string representation.
	 * @param givenString
	 */
	public TallyNumber(String givenString) {
		userString = givenString;
		currentStrTally = userString;
	}
	
	/**
	 * Adds the value of the given TallyNumber to this one. 
	 * After the operation, this TallyNumber's value will be the sum of this 
	 * and the given number, and its representation will the fully normalized form. 
	 * The given TallyNumber is not modified.
	 * @param other
	 */
	public void add(TallyNumber other) {
		currentIntTally = currentIntTally + other;
	}
	
	/**
	 * Add the given TallyNumber to this one by concatenating the corresponding 
	 * tally groups. After the operation, this TallyNumber's value will be the 
	 * sum of this and the given number, and its representation will consist of 
	 * each of this number's tally groups concatenated with the corresponding 
	 * tally group from the given number's representation. The given 
	 * TallyNumber is not modified.
	 * @param other
	 */
	public void combine(TallyNumber other) {
		
	}
	
	/**
	 * Converts this TallyNumber's representation to its normalized 
	 * form without changing the value.
	 */
	public void normalize() {
		
	}
	
	/**
	 * Returns the integer value of this tally number.
	 */
	public int getIntValue() {
		
	}
	
	/**
	 * Returns the string representation of this tally number.
	 */
	public String getStringValue() {
		
	}
	
	
	/**
	 * Method that returns the normalized int from the string
	 * @param input
	 * @return total (aka normalized int)
	 */
	private int normalizeInt(String input) {
		int total = 0;
		int fives = 0;
		int ones = 0;
		int digit = 0;
		
		for (int i = input.length() - 1; i > -1; i--) {
			
			if (input.charAt(i) == '*') {
				fives++;
			}
			else if (input.charAt(i) == '|') {
				ones++;
			}
			else if (input.charAt(i) == ' ') {
				total = total + (fives * 5 + ones) * 10^digit;
				digit++;
				ones = 0;
				fives = 0;
			}
			
		}
		
		return total;
		
	}
	
	/**
	 * Method that normalizes string. It is separate since it is called many times;
	 * @param input
	 * @return tallyString (aka normallized string)
	 */
	private String normalizeString(int input) {
		String tallyString = "";
		int numberInput = input;
		String numberAsString = Integer.toString(numberInput);
		int digit = 0;
		int five = 0;
		int ones = 0;
		
		for(int i = 0; i < numberAsString.length(); i++) {
			
			digit = numberAsString.charAt(i);
			five = digit / 5;
			ones = digit % 5;	
			if(five > 0) {
				tallyString = tallyString + "*";
			}
			for (int f = 0; f < ones; f++) {
				tallyString = tallyString + "|";
			}
			
			tallyString = tallyString + " ";
			
		}
		
		return tallyString;
		
	}
	
	
}
