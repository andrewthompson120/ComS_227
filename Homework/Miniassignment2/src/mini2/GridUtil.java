package mini2;

import api.ITransform;

/**
 * Utility class for applying transformations to 2d arrays.
 * A transformation computes a new value for a cell that is
 * based on the square neighborhood of cells that surround it.
 * Each transformation is an implementation of 
 * the ITransform interface.
 */
public class GridUtil {
	/**
	 * Applies the given transformation to all cells of the given
	 * array and produces a new array of the same size.  The original
	 * array is not modified.
	 * @param arr
	 *   given array
	 * @param transform
	 *   transformation to apply
	 * @return
	 *   new array consisting of transformed values
	 */
	public static int[][] applyAll(int[][] arr, ITransform transform) {
		// THIS METHOD IS FULLY IMPLEMENTED AND SHOULD NOT BE MODIFIED
		int numRows = arr.length;
		int numCols = arr[0].length;
		int[][] result = new int[numRows][numCols];
		for (int row = 0; row < numRows; row += 1) {
			for (int col = 0; col < numCols; col += 1) {
				int[][] subArray = getSubArray(arr, row, col, transform.getRadius(), transform.isWrapped());
				int newValue = transform.apply(subArray);
				result[row][col] = newValue;
			}
		}
		return result;
	}
   
	/**
	 * Displays the contents of a 2d int array
	 * @param arr
	 *   a 2d array of ints
	 */
	public static void printArray(int[][] arr) {
		for (int row = 0; row < arr.length; row += 1) {
			for (int col = 0; col < arr[0].length; col += 1) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
	}
  
	/**
	 * Returns the neighborhood surrounding the specified cell. In general,
	 * the returned array is a square sub-array of arr, 
	 * with width and height 2 * radius + 1, whose center is 
	 * arr[centerRow][centerCol]. For cells within
	 * radius of the edge, the value for out-of-range
	 * indices is determined by the wrapped parameter, as follows:
	 * 		-if wrapped is false, cells for out-of-range indices
 	 * 			are filled with zeros
 	 * 		-if wrapped is true, cells for out-of-range indices
 	 * 			are determined by "wrapping" the indices:
 	 * 			-for a row index, the array height is added to or subtracted from the index
 	 * 				to bring it within range
 	 * 			-for a column index, the array width is added to or subtracted from
 	 * 				the index to bring it within range
 	 * 
 	 * Note that the size of neighborhood, neighborhood size 2 * radius + 1, 
 	 * 		is not allowed to be greater than either the width or height of the given array.
 	 * 
 	 * @param arr
  	 *   the original array
 	 * @param centerRow
 	 *   row index of center cell
 	 * @param centerCol
 	 *   column index of center cell
 	 * @param radius
 	 *   radius of the neighborhood (return array has width and height
 	 *   equal to 2 * radius + 1
 	 * @param wrapped
 	 *   true if out-of-range indices should be wrapped, false if cells
 	 *   should be filled with zeros
 	 * @return
 	 *   a new 2d array consisting of the cells surrounding the given center
 	 *   cell
 	 * @throws IllegalArgumentException
 	 *   if the neighborhood size 2 * radius + 1 is greater
 	 *   than the given array's width or height
 	 */
	public static int[][] getSubArray(int[][] arr, int centerRow, int centerCol, int radius, boolean wrapped) {
		// Input variables
		int inputRow = centerRow;
		int inputCol = centerCol;
		int inputRadius = radius; 
		boolean inputWrap = wrapped;
		int height = 2 * inputRadius + 1;
		int width = 2 * inputRadius + 1;
		// Array to be returned
		int[][] returnArray = new int[height][width];
		// Max index for row and col
		int maxRows = arr.length;
		int maxCols = arr[0].length;
		// Current row/col of the new array
		int currRow = 0;
		int currCol = 0;
				
		//Throws illegal arg warning if the size is bigger than the inputArray
		if(height > maxRows || width > maxCols) {
			throw new IllegalArgumentException("Size is bigger than given array");
		}
		
		// Cells out of index brought down to into the index
		if(inputWrap) {
			 for(int rows = -inputRadius; rows <= inputRadius; rows++) {
				 for (int cols = -inputRadius; cols < inputRadius; cols++) {
					 // Actual row and col in the original array
					 int actRow = inputRow + rows; 
					 int actCol = inputCol + cols;

					 // Checks if actRow < 0
					 if(actRow < 0) {
						 actRow = actRow + maxRows;
					 }					 
					 // Checks if actRow >= maxRows
					 else if(actRow >= maxRows) {
						 actRow = actRow - maxRows;
					 }
					 // Checks if actCol < 0
					 else if(actCol < 0) {
						 actCol = actCol + maxCols;
					 }
					 // Checks if actCol >= 0			 
					 else if(actCol >= maxCols) {
						 actCol = actCol - maxCols;
					 }
					 
					 // Sets new array
					 returnArray[currRow][currCol] = arr[actRow][actCol];
					 
					 currCol++;
				 }
				 currCol = 0;
				 currRow++;
			 }
		}
		// Cells out of range filled with 0;
		else{
			for(int rows = -inputRadius; rows <= inputRadius; rows++) {
				 for (int cols = -inputRadius; cols <= inputRadius; cols++) {
					 // Actual row and col from original array
					 int actRow = inputRow + rows;
					 int actCol = inputCol + cols;
					 
					 
					 // Checks if actRow < 0 				 
					 if(actRow < 0) {
						 returnArray[currRow][currCol] = 0;
					 }
					 // Checks if actRow >= maxRows				 
					 else if(actRow >= maxRows) {
						 returnArray[currRow][currCol] = 0;
					 }
					 // Checks if actCol < 0					 
					 else if(actRow < 0){
						 returnArray[currRow][currCol] = 0;
					 }
					 // Checks if actCol >= maxCols
					 else if(actCol >= maxCols){
						 returnArray[currRow][currCol] = 0;
					 }
					 // If both are in the array
					 else {
						 returnArray[currRow][currCol] = arr[actRow][actCol];
					 }
					 
					 currCol++;
				 }
				 currCol = 0;
				 currRow++;
			 }
		}
		
		
		return returnArray;
	}
}
