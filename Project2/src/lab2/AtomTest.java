package lab2;

public class AtomTest {
	static public void main(String[] argc) {
		Atom a;
		a = new Atom(92,146,92);
		
		System.out.println(a.getAtomicMass());
		System.out.println(a.getAtomicCharge());
		a.decay();
		System.out.println(a.getAtomicMass());
	}
}
