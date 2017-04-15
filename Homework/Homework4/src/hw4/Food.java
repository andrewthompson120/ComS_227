package hw4;

import java.awt.Color;

import graph.Cell;
import state.State;

public class Food {
	
	/**
	 * Get the current color of the state (can be used for drawing)
	 * 
	 * @return the color of the state
	 * 
	 */
	@Override
	public Color getColor() {
		//TODO
	}
	
	/**
	 * Updates the cell based off the state.
	 * This method can update the cell's state,
	 * or potentially another cell depending on the implementation.
	 * @param cell - The cell that this state belongs to
	 */
	@Override
	public void handle(Cell cell) {
		//TODO
	}
	
	/**
	 * Get whether or not the cell is passable.
	 * Affects whether or not a state can move through another state
	 * via random movement or moving closer to the mouse
	 * 
	 * Returns true if the state is passable
	 * 
	 * @return 
	 */
	@Override
	public boolean isPassable() {
		//TODO
	}
	
	/**
	 * Get the character representation for this State.
	 * Used for loading map text files.
	 * @return - Character representation for this state
	 */
	@Override
	public char toChar() {
		//TODO
	}
	
}
