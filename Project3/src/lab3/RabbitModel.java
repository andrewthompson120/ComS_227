package lab3;

public class RabbitModel {
	
	private int rabbitPopulation; // Initial rabbit population
	private int years; // Years to simulate
	private int rabbitsBorn; // Rabbit birth rate per year
	private int rabbitsDead; // Rabbits death rate per year
	
	public RabbitModel() {
	}
	
	public int getPopulation() {
		rabbitPopulation = rabbitPopulation - rabbitsDead * years + rabbitsBorn * years;
		return rabbitPopulation;
	}
	/*
	 * Returns rabbit population at the end of the year and adjusts the population based on birth/death rates
	 */
	
	
}
