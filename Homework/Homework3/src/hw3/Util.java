package hw3;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import api.Flow;
import api.Cell;

/**
 * Utility class with methods for creating Flows from string descriptors
 * and reading string descriptors from a file.  A string descriptor is
 * an array of strings, all with the same length, in which an alphabetic
 * character at a given row and column represents a cell at that
 * row and column.  The color of the cell is determined from the character
 * by the Cell constructor.  A descriptor is invalid if not all strings
 * are the same length or if there is an alphabetic character that 
 * does not appear exactly twice.
 */
public class Util {
	/**
	 * Creates an array of Flow objects based on the string descriptor.
	 * If the descriptor is invalid, this method returns null.
	 * @param descriptor
	 *   array of strings
	 * @return
	 *   array of Flow objects determined by the descriptor 
	 */
	public static Flow[] createFlowsFromStringArray(String[] descriptor) {
		int descRows = Array.getLength(descriptor); // Gets height
		int descCols = descriptor[0].length(); // Gets width
		int currentCellNumber = 0; 
		ArrayList<Cell> cells = new ArrayList<Cell>();
		Flow[] gameFlows = new Flow[descRows];
		
		
		for(int i=0; i < descRows; i++) {
			//Checks if row is valid. Return null if not
			if(descriptor[i].length() != descCols) { 
				return null;
			}
			// Searches string for end points in the row
			for(int j=0; j < descCols; j++) {
				// Checks for any end points
				if(descriptor[i].charAt(j) == 'R' || descriptor[i].charAt(j) == 'G' || descriptor[i].charAt(j) == 'B' ||
						descriptor[i].charAt(j) == 'C' || descriptor[i].charAt(j) == 'Y' || descriptor[i].charAt(j) == 'M' || 
						descriptor[i].charAt(j) == 'O' || descriptor[i].charAt(j) == 'P' || descriptor[i].charAt(j) == 'S' || 
						descriptor[i].charAt(j) == 'V' || descriptor[i].charAt(j) == 'F') {
					
					Cell cell = new Cell(i,j,descriptor[i].charAt(j));
					cells.add(cell); // Stores each endpoint in a cell;
				}
				// If anything other than a '-' left returns null
				else if(descriptor[i].charAt(j) != '-') {
					return null;
				}				
			}					  
		}
		//Checks if there are an even # of end pts
		if(cells.size() %2 != 0) {
			return null;
		}
		// Constructs the flow cells
		for(int w = 1; w < cells.size(); w++) {
			if(cells.get(w).colorMatches(cells.get(0).getColor())) {
				gameFlows[currentCellNumber] = new Flow(cells.get(0),cells.get(w));
				cells.remove(w);
				cells.remove(0);
				w = 0;
				currentCellNumber++;
			}
		}
		// Returns null if it doesnt equal rows
		if(currentCellNumber != descRows) {
			return null;
		}
		return gameFlows;
		
	}
 
	/**
	 * Reads the given file and constructs a list of FlowGame objects, one for
	 * each descriptor in the file.  Descriptors in the file are separated by 
	 * some amount of whitespace, but the file need not end with whitespace and
	 * may have extra whitespace at the beginning.  Invalid descriptors in the file
	 * are ignored, so the method may return an empty list.
	 * @param filename
	 *   name of the file to read
	 * @return
	 *   list of FlowGame objects created from the valid descriptors in the file
	 * @throws FileNotFoundException
	 */
	public static ArrayList<FlowGame> readFile(String filename) throws FileNotFoundException {
		// TODO
		return null;
	}

}
