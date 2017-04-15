package mini2;

import api.ITransform;

/**
 * Transformation implementing Conway's Game of Life.
 * All cells have value 0 or 1. The new value is based on the center 
 * cell along with the sum S of its eight neighbors, according to 
 * the rules:
 * 
 *   	if S is less than 2 the result is 0
 *   	if S is greater than 3 the result is 0
 *   	if the center cell is 1 and S is 2 or 3, the result is 1
 *   	if the center cell is 0 and S is exactly 3, the result is 1
 * 
 * See
 * http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 *
 * 
 * The radius is 1 and the isWrapped() method 
 * always returns true.
 */
public class ConwayTransform implements ITransform {

	@Override
	public int apply(int[][] elements) {
		// Center is always at elements[1][1]
		int sum = 0; // sum of neighbors
		int rows = elements.length;
		int cols = elements[0].length;
		int size = 3;
		int centerValue = elements[1][1];
		
		if (rows != size || cols != size) {
			throw new IllegalArgumentException("Not a 3x3 array");
		}
		
		// Find sum of neighbors
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				// if it isn't the center
				sum = sum + elements[i][j];
			}
		}
		sum = sum - elements[1][1];
		//System.out.println(sum);
		// Determining new center value
		if(sum < 2 || sum > 3) {
			centerValue = 0;
		}
		else if ((centerValue == 0) && (sum == 3)) {
			centerValue = 1;
		}
		
		return centerValue;
	}

	@Override
	 public int getRadius() {
		return 1;
	}

	@Override
	public boolean isWrapped() {
		return true;
	}
  
}
