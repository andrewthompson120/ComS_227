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
		// Input array variables
		int maxRows = arr.length;
		int maxCols = arr[0].length;
		int currentRow = inputRow - radius;
		int currentCol = inputCol - radius;
		int hasNull = -1; // for debugging
		
		System.out.println(arr.length);
		// Cells out of index brought down to into the index
		if(inputWrap) {
			 for(int rows = 0; rows < arr.length; rows++) {
				 for (int cols = 0; cols < width; cols++) {

					 // - If one is out of arr and one is in
					 // Check if row below 0 and col in arr
					 if(currentRow < 0 && currentCol >= 0 && currentCol < maxCols) {
						returnArray[rows][cols] = arr[0][currentCol];
						hasNull = 1;
					 }
					 // Check if row above max index and col are in arr
					 else if(currentRow >= maxRows && currentCol >= 0 && currentCol < maxCols) {
						 returnArray[rows][cols] = arr[maxRows-1][cols];
						 hasNull = 1;
					 }
					 // Check if col is below array (null) and row in arr
					 else if(currentCol < 0 && currentRow >= 0 && currentRow < maxRows) {
						 returnArray[rows][cols] = arr[currentRow][0];
						 hasNull = 1;
					 }
					 // check if col is above array (returns null) and row in arr
					 else if(currentCol >= maxCols && currentRow >= 0 && currentRow < maxRows) {
						 returnArray[rows][cols] = arr[currentRow][maxCols-1];
						 hasNull = 1;
					 }
					 
					 // - If both are outside
					 // Check if both row and col are below array (returns null)
					 else if(currentRow < 0 && currentCol < 0) {
						 returnArray[rows][cols] = arr[0][0];
						 hasNull = 1;
					 }
					 // Check if both row and col are above array
					 else if(currentRow >= maxRows && currentCol >= maxCols) {
						 returnArray[rows][cols] = arr[maxRows-1][maxCols-1];
						 hasNull = 1;
					 }
					 // Check if row below 0 and cols above max
					 else if(currentRow < 0 && currentCol >= maxCols) {
						 returnArray[rows][cols] = arr[0][maxCols-1];
						 hasNull = 1;
					 }
					 // Check if row above max and cols below 0
					 else if(currentRow >= maxRows && currentCol < 0) {
						 returnArray[rows][cols] = arr[maxRows-1][0];
						 hasNull = 1;
					 }
					 
					 // - If both are inside
					 // Check if row inside and col inside
					 else if ( (currentRow > -1 && currentRow < maxRows) && (currentCol > -1 && currentCol < maxCols) ) {
						 returnArray[rows][cols] = arr[currentRow][currentCol];
						 hasNull = 0;
					 }
					 
					 
					 // DEBUG STEP:
					 // This is a debug that will fire if nothing is placed in the array
					 if(hasNull == -1) { 
						 System.out.println("ERROR IN getSubArray-Wrap:TRUE");
					 }
					 hasNull = -1; // reset hasNull
		
					 currentCol++;
				 }
				 currentRow++;
			 }
		}
		// Cells out of range filled with 0;
		else{
			 for(int rows = 0; rows < height; rows++) {
				 for (int cols = 0; cols < width; cols++) {
					 
					 // Check if row below 0 (returns null)
					 if(currentRow < 0) {
						returnArray[rows][cols] = 0;
						hasNull = 1;
					 }
					 // Check if row above max index (return null)
					 else if(currentRow >= maxRows) {
						 returnArray[rows][cols] = 0;
						 hasNull = 1;
					 }
					 
					 // Check if col is in array
					 else if(currentCol < 0) {
						 returnArray[rows][cols] = 0;
						 hasNull = 1;
					 }
					 else if (currentCol >= maxCols) {
						 returnArray[rows][cols] = 0;
						 hasNull = 1;
					 }
					 
					 // - If both are inside
					 // Check if row inside and col inside
					 else if ( (currentRow > -1 && currentRow < maxRows) && (currentCol > -1 && currentCol < maxCols) ) {
						 returnArray[rows][cols] = arr[currentRow][currentCol];
						 hasNull = 0;
					 }
					 
					 
					 // DEBUG STEP:
					 // This is a debug that will fire if nothing is placed in the array
					 if(hasNull == -1) { 
						 System.out.println("ERROR IN getSubArray-Wrap:TRUE");
					 }
					 hasNull = -1; // reset hasNull
					 
					 currentCol++;
				 }
				 currentRow++;
			 }
		}
		
		
		return returnArray;
	}
}
