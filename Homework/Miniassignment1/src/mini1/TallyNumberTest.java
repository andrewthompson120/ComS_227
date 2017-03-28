package mini1;


public class TallyNumberTest {
	public static void main(String[] argc) {
		
		TallyNumber tn = new TallyNumber(1);
		System.out.println("Expect '|' Actual:" + tn.getStringValue()); // Should be "|||"
		System.out.println("Expect '1' Actual:" + tn.getIntValue());
		//TallyNumber tn2 = new TallyNumber("");
		//System.out.println("Expect '' Actual:" +tn2.getStringValue()); // Should be ""
		//System.out.println("Expect '0' Actual:" +tn2.getIntValue()); // Should be 0
		//TallyNumber tn1 = new TallyNumber(365);
		//System.out.println("Expect '365' Actual:" +tn1.getIntValue()); // Should be 365
		//System.out.println("Expect '||| *| *' Actual:" +tn1.getStringValue()); // Should be "||| *| |||"
		//TallyNumber tn9 = new TallyNumber("|||");
		//System.out.println("Expect '365' Actual:");// + tn3.getIntValue()); // Should be 365
		//TallyNumber t2 = new TallyNumber("|| *"); 
		//System.out.println(t2.getIntValue()); // Should be 25
		//tn.add(t2);
		//System.out.println(tn.getStringValue());
		//TallyNumber tn3 = new TallyNumber("||| 0 0"); //35
		//System.out.println(tn3.getIntValue());
		
	}
}
