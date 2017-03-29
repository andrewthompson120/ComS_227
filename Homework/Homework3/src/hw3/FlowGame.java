package hw3;

import java.awt.Color;
import java.lang.reflect.Array;

import api.Cell;
import api.Flow;
import hw3.Util;

/**
 * @author Andrew Thompson
 * Game state for a Flow Free game.
 */
public class FlowGame {
	
	private int gameWidth = 0; // Holds the # of columns
	private int gameHeight = 0; // Holds the # of rows
	private Cell[] currentCell = null; // Current cell	
	private Flow[] gameFlows = null; // Current flow[] of the game
	private String[] gameDescriptor = null;
	
	
	/**
	 * Turns the given flow into a string array
	 * @param input, givenRows, givenCols
	 * @return returnString
	 * 		returns a string converted from the Flow
	 */
	private String[] getGameDescriptor(Flow[] input, int givenRows, int givenCols) {
		int rows;
		int columns;
		String[] returnString;
		
		//for()
		
	}
	
	/**
	 * Constructs a FlowGame to use the given array of Flows and
	 * the given width and height.  Client is responsible for ensuring that all
	 * cells in the given flows have row and column values within
	 * the given width and height.
	 * @param givenFlows
	 *   an array of Flow objects
	 * @param givenWidth
	 *   width to use for the game
	 * @param givenHeight
	 *   height to use for the game
	 */
	 public FlowGame(Flow[] givenFlows, int givenWidth, int givenHeight) {
		gameWidth = givenWidth;
		gameHeight = givenHeight;
		gameFlows = givenFlows;
		
	 }
  
	 /**
	  * Constructs a FlowGame from the given descriptor.
	  * @param descriptor
	  *   array of strings representing initial endpoint positions
	  */
	  public FlowGame(String[] descriptor) {
		  int descRows = Array.getLength(descriptor);
		  int descCols = descriptor[0].length();
		  
		  if(Util.createFlowsFromStringArray(descriptor) != null) {  
			  for
		  }
			  
	  }
	  
	  /**
	   * Returns the width for this game.
	   * @return
	   *  width for this game
	   */
	  public int getWidth() {		  
		  return gameWidth;
	  }
	  
	  /**
	   * Returns the height for this game.
	   * @return
	   *   height for this game
	   */
	  public int getHeight() {		  
		  return gameHeight;
	  }
	  
	  /**
	   * Returns the current cell for this game, possible null.
	   * @return
	   *   current cell for this game
	   */
	  public Cell getCurrent() {
		  // TODO
		  return null;
	  }
	  
	  /**
	   * Returns all flows for this game.  Client should not modify
	   * the returned array or lists.
	   * @return
	   *   array of flows for this game
	   */
	  public Flow[] getAllFlows() {
		  
		  return gameFlows;
	  }
	  
	  /**
	   * Returns the number of occupied cells in all flows (including endpoints).
	   * @return
	   *   occupied cells in this game
	   */
	  public int getCount() {
		  int occupiedCount = 0;
		  
		  for(int i = 0; i < gameHeight; i++) {
			  for(int j = 0; j < gameWidth; j++) {
				  if(gameDescriptor[i].charAt(j) == 'R' || gameDescriptor[i].charAt(j) == 'G' || gameDescriptor[i].charAt(j) == 'B' || gameDescriptor[i].charAt(j) == 'C' || 
						  gameDescriptor[i].charAt(j) == 'Y' || gameDescriptor[i].charAt(j) == 'M' || gameDescriptor[i].charAt(j) == 'O' || gameDescriptor[i].charAt(j) == 'P' || 
						  gameDescriptor[i].charAt(j) == 'S' || gameDescriptor[i].charAt(j) == 'V' || gameDescriptor[i].charAt(j) == 'F') {
					  occupiedCount++;
				  }
			  }
		  }
		  return occupiedCount;
	  }
	  
	  /**
	   * Returns true if all flows are complete and all cells are occupied.
	   * @return
	   *   true if all flows are complete and all cells are occupied
	   */
	  public boolean isComplete() {
		  // TODO
		  return false;
	  }
	  
	  /**
	   * Attempts to set the "current" cell to be an existing cell at the given
	   * row and column.  When using a GUI, this method is typically 
	   * invoked when the mouse is pressed.  
	   * <ul>
	   *   <li>Any endpoint can be selected as the current cell.  Selecting an 
	   *   endpoint clears the flow associated with that endpoint.
	   *   <li>A non-endpoint cell can be selected as the current cell only if 
	   *   it is the last cell in a flow. 
	   * </ul>
	   * If neither of the above conditions is met, this method does nothing.
	   * 
	   * @param row
	   *   given row
	   * @param col
	   *   given column
	   */
	  public void startFlow(int row, int col) {
		  // TODO
	  }
	  
	  /**
	   * Clears the "current" cell. That is, directly after invoking this method,
	   * <code>getCurrent</code> returns null. When using a GUI, this method is 
	   * typically invoked when the mouse is released.
	   */
	  public void endFlow() {
		  // TODO
	  }
	  
	  /**
	   * Attempts to add a new cell to the flow containing the current cell.  
	   * When using a GUI, this method is typically invoked when the mouse is 
	   * dragged.  In order to add a cell, the following conditions must be satisfied:
	   * <ol>
	   *   <li>The current cell is non-null
	   *   <li>The given position is horizontally or vertically adjacent to the 
	   *   current cell
	   *   <li>The given position either is not occupied OR it is occupied by 
	   *   an endpoint for the flow that is not already in the flow
	   * </ul>
	   * If the three conditions are met, a new cell with the given row/column 
	   * and correct color is added to the current flow, and the current cell 
	   * is updated to be the new cell.
	   * 
	   * @param row
	   *   given row for the new cell
	   * @param col
	   *   given column for the new cell
	   */
	  public void addCell(int row, int col) {
		  // TODO
	  }
	  
	  /**
	   * Returns true if the given position is occupied by a cell in a flow in
	   * this game (possibly an endpoint).
	   * @param row
	   *   given row
	   * @param col
	   *   given column
	   * @return
	   *   true if any cell in this game has the given row and column, false otherwise
	   */
	  public boolean isOccupied(int row, int col) {
		  int givenRow = row;
		  int givenCol = col;
		  
		  
		  return false;
	  }

}
