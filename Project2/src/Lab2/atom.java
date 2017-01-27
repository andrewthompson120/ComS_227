package Lab2;

public class atom {
	public atom(int givenProtons, int givenNeutrons, int givenElectrons){
		 
	}
	
	/*
	 * Returns the atomic mass.
	 */
	 int getAtomicMass(int givenProtons, int givenNeutrons){ 
		return givenProtons + givenNeutrons;
		
	}
	 
	/*
	 * Returns the difference between the number of protons and electrons
	 */
	public int getAtomicCharge(int givenProtons, int givenElectrons){
		
		return givenProtons - givenElectrons;
		
	}
	
	/*
	 * Decreases the number of protons and neutrons by 2
	 */
	void decay(int givenProtons, int givenNeutrons){
		givenProtons = givenProtons - 2;
		givenNeutrons = givenNeutrons - 2;
	}
}
