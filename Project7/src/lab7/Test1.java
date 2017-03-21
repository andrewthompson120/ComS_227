package lab7;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	
	/**
	 * Given an array of integers, return a new array containing just the positive values in the array
	 * @param numbers
	 * @return positiveArray
	 */
	public static int[] getPositiveNumbers(int[] numbers) {
		
		int[] positiveArray = {};
		int[] numbersInput = numbers;
		int positiveCount = 0;
		int x = 0; //This is the number for the next positive array index
		
		for (int i=0; i < numbersInput.length; i++) {
			if(numbersInput[i] > 0) {
				positiveCount++;
			}
		}
		positiveArray = new int[positiveCount];
		
		for(int i=0; i < numbersInput.length; i++) {
			if (numbersInput[i] > 0) {				
				positiveArray[x] = numbersInput[i];
				x++;
			}
		}
		
		if(positiveArray.length != positiveCount) {
			System.out.println("ERROR CREATING ARRAY");
			int[] error = {4,0,4};
			return error;
		}		
		return positiveArray;
		
	}
	
	public static int[] randomExperiment(int max, int iters) {
		
		int givenMax = max;
		int givenTimes = iters;
		int[] randomArray;
		int index = 0;
		int arrayInt = 0;
		
		randomArray = new int[givenTimes];
		
		
		for (index = 0; index < givenTimes; index++) {
			Random num = new Random();
			for(int s = 0; s < index +1; s++){
				arrayInt = num.nextInt(givenMax - 1);
			}
			randomArray[index] = arrayInt;
		}	
		return randomArray;		
	}
	
	public static void main(String[] argc) {
		
		int[] testPositiveNumbers = {-1,0,1,5,-2,-34};
		String returnString = "";
		
		returnString = Arrays.toString(getPositiveNumbers(testPositiveNumbers));
		System.out.println(returnString);
		
		
		int randMax = 10;
		int randIters = 10;
		String randString = "";
	
		randString = Arrays.toString(randomExperiment(randMax, randIters));
		System.out.println(randString);
		
	}
	
}
