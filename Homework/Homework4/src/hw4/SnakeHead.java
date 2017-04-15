package hw4;

import java.awt.Color;

import graph.Cell;
import state.Snake;
import state.State;

public class SnakeHead {
	
	/**
	 * Gets the length of the snake
	 * 
	 * @return
	 */
	@Override
	public int getLength() {
		//TODO
	}
	
	/**
	 * Updates the cell based off the state. 
	 * This method can update the cell's state,
	 * or potentially another cell's state depending on the implementation.
	 * @param cell
	 */
	@Override
	public void handle(Cell cell) {
		//TODO
	}
	
	/**
	 * Get the current color of the state (can be used for drawing).
	 * @return
	 */
	@Override
	public Color getColor() {
		//TODO
	}
	
	/**
	 * Get whether or not the cell is passable.
	 * Affects whether or not a state can move through another state via
	 * random movement or moving closer to the mouse.
	 * @return
	 */
	@Override
	public boolean isPassable() {
		//TODO
	}
	
	/**
	 * Get the character representation for this State.
	 * Used for loading map text files.
	 * @return
	 */
	@Override
	public char toChar() {
		//TODO
	}
	
}
