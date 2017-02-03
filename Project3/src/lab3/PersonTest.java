package lab3;

public class PersonTest {
	public static void main(String[] argc) {
		
		Person n = new Person("Andrew", 16);
		
		System.out.println(n.getNameLength());
		System.out.println(n.getName());
		System.out.println(n.getAge());
		
	}
}
