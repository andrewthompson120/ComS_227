package hw4;

import java.awt.Color;
import java.util.Random;

import color.ColorGenerator;
import main.Config;
/**
 * 
 * @author Andrew Thompson
 *
 */
public class RainbowColorGenerator implements ColorGenerator{
	
	
	// CONSTANTS
	/**
	 * Contains 6 different colors: {blue, green, yellow, orange, red, very_dark_magenta}
	 */
	public static final Color[] COLORS = new Color[6]; {
		COLORS[0] = new Color(0.25f,0.000f,0.00f); // Red
		COLORS[1] = new Color(0.25f,0.125f,0.00f); // Orange
		COLORS[2] = new Color(0.25f,0.250f,0.00f); // Yellow
		COLORS[3] = new Color(0.00f,0.250f,0.00f); // Green
		COLORS[4] = new Color(0.00f,0.000f,0.25f); // Blue
		COLORS[5] = new Color(0.25f,0.000f,0.25f); // Purple
	}
	
	
	// PRIVATE METHODS
	/**
	 * The number generator for creating colors.
	 */
	private Random r = Config.RANDOM;	
	
	
	// PUBLIC METHODS
	/**
	 * Makes a new color. For style, 
	 * subclasses should create multiple colors.
	 * 
	 * @return A Color
	 */
	@Override
	public Color createColor() {
		int next = r.nextInt(6);
		switch(next) {
			case 0:
				return COLORS[0];
			case 1:
				return COLORS[1];
			case 2: 
				return COLORS[2];
			case 3:
				return COLORS[3];
			case 4:
				return COLORS[4];
			default:
				return COLORS[5];
		}
	}

}
