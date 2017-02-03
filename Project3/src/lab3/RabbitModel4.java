package lab3;
import java.util.Random;
public class RabbitModel4 {
	
	private int rabbitPopulation; // Initial rabbit population
	private int rabbitsBorn; // Rabbit birth rate per year
	private int rabbitsDead; // Rabbits death rate per year
	Random rand = new Random( );
	
	public RabbitModel4() {
		rabbitPopulation = 0;
		rabbitsBorn = rand.nextInt(11);
		rabbitsDead = 0;
	}
	/*
	 * Constructs the model and validates the variables
	 */
	
	public int getPopulation() {
		return rabbitPopulation;
	}
	/*
	 * Returns rabbit population
	 * 	@return
	 */
	 
	public void simulateYear() {
		rabbitPopulation = rabbitPopulation - rabbitsDead + rabbitsBorn;
		rabbitsBorn = rand.nextInt(11);
	}
	/*
	 * Simulates the passage of a year. 
	 * Updates the number of rabbits alive at the end of the year
	 */
	
	public void reset() {
		rabbitPopulation = 0;
		rabbitsBorn = rand.nextInt(11);
		rabbitsDead = 0;
	}
	/*
	 * Resets the state of the model to the initial conditions
	 */
	
}
