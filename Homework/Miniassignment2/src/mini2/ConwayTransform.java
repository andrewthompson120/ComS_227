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
		int S = 0; // sum of neighbors
		int centerValue = elements[1][1];
		
		// Find sum of neighbors
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {
					j++;
				}
				S = elements[i][j];
			}
		}
		
		// Determining new center value
		if(centerValue == 0 && S == 3) {
			return 1;
		}
		else if(centerValue == 1 && (S == 2 || S == 3)) {
			return 1;
		}
		else if(S < 2) { 
			return 0;
		}
		else if(S > 3) {
			return 0;
		}
		
		return 0;
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
