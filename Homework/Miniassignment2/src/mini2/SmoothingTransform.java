package mini2;

import api.ITransform;

/**
 * Transformation implementing a smoothing operation
 * on cells of an array.  The new value is the 
 * average of the values in a neighborhood
 * around a given cell, rounded to the nearest
 * integer. The size of the neighborhood is 
 * 2 * radius + 1, where the radius is a parameter
 * provided to the constructor. 
 * The isWrapped() method always returns false.
 */
public class SmoothingTransform implements ITransform {
	private int radius;
  
	public SmoothingTransform(int givenRadius) {
		radius = givenRadius;
	}
  
	@Override
	public int apply(int[][] elements) {
		int returnTot = 0;
		int runTotal = 0;
		int size = 2 * radius + 1;
		int numElements = size * size;	
		
		for(int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				runTotal = runTotal + elements[row][col];
			}
		}
		
		returnTot = Math.round(runTotal/numElements);	
		return returnTot;
	}

	@Override
	public int getRadius() {
		return radius;
	}

	@Override
	public boolean isWrapped() {
		return false;
	}

}
