package lab3;

public class RabbitModel5 {
	
	private int rabbitPopulation; // Initial rabbit population
	private int rabbitsBorn; // Rabbit birth rate per year
	//private int rabbitsDead; // Rabbits death rate per year
	private int prevRabbitPopulation;
	
	public RabbitModel5() {
		rabbitPopulation = 0;
		rabbitsBorn = 1;
		//rabbitsDead = 0;
		prevRabbitPopulation = 0;
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
		rabbitPopulation = rabbitsBorn + prevRabbitPopulation;
		prevRabbitPopulation = rabbitsBorn;
		rabbitsBorn = rabbitPopulation;
		
	}
	/*
	 * Simulates the passage of a year. 
	 * Updates the number of rabbits alive at the end of the year
	 */
	
	public void reset() {
		rabbitPopulation = 2;
		rabbitsBorn = 1;
		//rabbitsDead = 0;
		prevRabbitPopulation = 0;
	}
	/*
	 * Resets the state of the model to the initial conditions
	 */
	
}
