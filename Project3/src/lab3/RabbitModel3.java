package lab3;

public class RabbitModel3 {
	
	private int rabbitPopulation; // Initial rabbit population
	//private int rabbitsBorn; // Rabbit birth rate per year
	//private int rabbitsDead; // Rabbits death rate per year
	
	public RabbitModel3() {
		rabbitPopulation = 500;
		//rabbitsBorn = 0;
		//rabbitsDead = 0;
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
		//rabbitPopulation = rabbitPopulation - rabbitsDead + rabbitsBorn;
		rabbitPopulation = rabbitPopulation / 2;
	}
	/*
	 * Simulates the passage of a year. 
	 * Updates the number of rabbits alive at the end of the year
	 */
	
	public void reset() {
		rabbitPopulation = 500;
		//rabbitsBorn = 0;
		//rabbitsDead = 0;
	}
	/*
	 * Resets the state of the model to the initial conditions
	 */
	
}
