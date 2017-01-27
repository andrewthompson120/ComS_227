package lab2;

public class Atom {
	private int Protons;
	private int Neutrons;
	private int Electrons;
	
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons){
		 Protons = givenProtons;
		 Neutrons = givenNeutrons;
		 Electrons = givenElectrons;
	}
	
	/*
	 * Returns the atomic mass.
	 */
	public int getAtomicMass(){ 
		return Protons + Neutrons;
		
	}
	 
	/*
	 * Returns the difference between the number of protons and electrons
	 */
	public int getAtomicCharge(){
		
		return Protons - Electrons;
		
	}
	
	/*
	 * Decreases the number of protons and neutrons by 2
	 */
	public void decay(){
		Protons = Protons - 2;
		Neutrons = Neutrons - 2;
	}
}
