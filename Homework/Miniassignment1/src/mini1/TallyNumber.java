package mini1;

import java.util.Scanner;

public class TallyNumber {
	
	private int userValue = 0; // Gets the user value in the constructor
	private String userString = ""; // Gets the user string from the constructor
	private int currentIntTally = 0; // Running int tally
	private String currentStrTally = ""; // Running String tally 
	private int tempInt = 0;
	private String tempStr = "";
	
	/**
	 * Constructs a tally number with the given integer value.
	 * @param givenValue
	 */
	public TallyNumber(int givenValue) {
		
		if (givenValue < 0) {
			userValue = -1;
		}
		else {
			userValue = givenValue;
		}
		currentIntTally = userValue;
		
		currentStrTally = normalizeString(userValue);
		if (userValue == -1) {
			currentStrTally = "";
		}
		
	}
	
	/**
	 * Constructs a TallyNumber with the given string representation.
	 * @param givenString
	 */
	public TallyNumber(String givenString) {
		String inputString = givenString;
		
		if (inputString.length() == 0 || inputString.charAt(0) == ' ') {
			currentStrTally = "";
			currentIntTally = 0;
		}
		else if(onlyNumbers(inputString) == 0) {
			currentIntTally = -1;
			currentStrTally = "";		
		}
		else {
			userString = givenString;
			currentIntTally = normalizeInt(userString);
			currentStrTally = inputString;
		}
		
		
	}
	
	/**
	 * Adds the value of the given TallyNumber to this one. 
	 * After the operation, this TallyNumber's value will be the sum of this 
	 * and the given number, and its representation will the fully normalized form. 
	 * The given TallyNumber is not modified.
	 * @param other (int)
	 */
	public void add(TallyNumber other) {
		

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
		currentIntTally = normalizeInt(currentStrTally);
	}
	
	/**
	 * Returns the integer value of this tally number.
	 */
	public int getIntValue() {
		return currentIntTally;
	}
	
	/**
	 * Returns the string representation of this tally number.
	 */
	public String getStringValue() {
		return currentStrTally;
	}
	
	
	/**
	 * Method that returns the normalized int from the string
	 * @param input
	 * @return total (aka normalized int)
	 */
	private int normalizeInt(String input) {
		
		String inputString = input;
		String tempString = "";
		int returnInt = 0;
		int numberDigits = 1;
		int tens = 0;
		int fives = 0;
		int ones = 0;
	
		char one = '|';
		char five = '*';
				
		Scanner readString = new Scanner(inputString);
		while (readString.hasNext()) {
			numberDigits++;
		}
		for (int j = numberDigits; j > 0; j--) {
			
			tempString = readString.next();
			for (int x = 0; x < tempString.length(); x++) {	
				if(tempString.charAt(x) == one) {
					ones++;
				}
				else if (tempString.charAt(x) == five) {
					fives++;
				}
			}
			
			returnInt = returnInt + (fives * 5 + ones) * tenPower(tens);
			tens++;
			
			fives = 0;
			ones = 0;
			
		}
		readString.close();
		return returnInt;
	}
	
	/**
	 * Method that normalizes string. It is separate since it is called many times;
	 * @param input
	 * @return tallyString (aka normallized string)
	 */
	private String normalizeString(int input) {
		
		String returnString = "";
		String toString = Integer.toString(input);
		int methodInput = input;
		int numberDigits = toString.length();
		int fives = 0;
		int ones = 0;
		int digit = numberDigits-1;
		
		System.out.println(digit);
		/*
		char zero = '0';
		char one = '|';
		char five = '*';
		char space = ' ';
		*/
		for (int i = 0; i < numberDigits; i++) {
			
			ones = (methodInput / tenPower(digit)) % 5;
			methodInput = methodInput - (tenPower(digit) * ones);
			fives = (methodInput / tenPower(digit)) / 5;
			
			if(ones > 0) {
				for(int j = 0; j < ones; j++) {
					returnString = returnString + "|";
				}
			}
			if(fives > 0) {
				for(int k = 0; k < fives; k++) {
					returnString = returnString + "*";
				}
			}
			if (fives == 0 && ones == 0) {
				returnString = returnString + "0";
			}
			
			if (!(i + 1 == numberDigits)) {
				returnString = returnString + " ";
			}
			digit--;
			
		}
		
		return returnString;
		
	}
	
	private int tenPower(int power) {
		int exponent = power;
		int answer = 1;
		for (int b = 0; b < exponent; b++) {
			answer = answer * 10;
		}
		return answer;
	}

	private int onlyNumbers(String input) {
		String stringIn = input;
		int stringLength = stringIn.length();
		int continueSearch = 1;
		
		char zero = '0';
		char one = '|';
		char five = '*';
		char space = ' ';
		
		for (int i = 0; i < stringLength; i++) {
			if (!( stringIn.charAt(i) == zero || stringIn.charAt(i) == one || stringIn.charAt(i) == five || stringIn.charAt(i) == space )) {
				continueSearch = 0;
				break;
			}
		}
		
		return continueSearch;
	}
	
	
}