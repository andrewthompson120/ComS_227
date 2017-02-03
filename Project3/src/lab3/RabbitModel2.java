package lab3;

public class RabbitModel2 {
	
	private int rabbitPopulation; // Initial rabbit population
	private int rabbitsBorn; // Rabbit birth rate per year
	private int rabbitsDead; // Rabbits death rate per year
	private int year; // Year of calculation
	
	public RabbitModel2() {
		rabbitPopulation = 2;
		rabbitsBorn = 1;
		rabbitsDead = 0;
		year = 0;
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
		year = year + 1;
		if (year % 5 == 0) {
			reset();
		}
		
	}
	/*
	 * Simulates the passage of a year. 
	 * Updates the number of rabbits alive at the end of the year
	 */
	
	public void reset() {
		rabbitPopulation = 2;
		rabbitsBorn = 1;
		rabbitsDead = 0;
		year = 0;
	}
	/*
	 * Resets the state of the model to the initial conditions
	 */
	
}
