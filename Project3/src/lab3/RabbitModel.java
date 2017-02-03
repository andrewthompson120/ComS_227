package lab3;

public class RabbitModel {
	
	private int rabbitPopulation; // Initial rabbit population
	private int rabbitsBorn; // Rabbit birth rate per year
	private int rabbitsDead; // Rabbits death rate per year
	
	public RabbitModel() {
		
	}
	
	public int getPopulation() {
		return rabbitPopulation;
	}
	/*
	 * Returns rabbit population
	 * 	@return
	 */
	 
	public void simulateYear() {
		rabbitPopulation = rabbitPopulation - rabbitsDead + rabbitsBorn;
	}
	/*
	 * Simulates the passage of a year. 
	 * Updates the number of rabbits alive at the end of the year
	 */
	public void reset() {
		
	}
	/*
	 * Resets the state of the model to the initial conditions
	 */
	
}
