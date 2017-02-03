package lab3;

public class RabbitModelTest {
	public static void main(String[] argc) {
		RabbitModel model = new RabbitModel();
	
		System.out.println(model.getPopulation()); // should be 2?
		model.simulateYear();
		System.out.println(model.getPopulation()); // Expect 3
		
		model.reset();
		System.out.println(model.getPopulation()); // Expect 2
	
	}
}
