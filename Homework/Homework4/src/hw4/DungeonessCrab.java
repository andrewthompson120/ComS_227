package hw4;

import graph.Cell;
import state.State;

public class DungeonessCrab {
	
	/**
	 * Updates the cell based off the state. 
	 * This method can update the cell's state,
	 * or potentially another cell's state depending on implementation.
	 * 
	 * @Secified by: handle in interface state
	 * 
	 * @Overrides handle in class Food
	 * 
	 * @param cell - The cell that this state belongs to
	 */
	@Override
	public void handle(Cell cell) {
		
	}
	
	/**
	 * Get the character representation for this State.
	 * Used for loading map text files.
	 * 
	 * @Overrides toChar in class food
	 * 
	 * @return character representation for this state
	 */
	@Override
	public char toChar() {
		//TODO
	}
}
