package postage3;

public class PostageUtil {
      /**
       * Returns the cost of postage for a letter of the given weight.
       * @param weight
       *   given weight in ounces
       * @return
       *   cost of postage for the weight
       */
	private static double cost;
	public static double computePostage(double weight) {
       
		cost = 0.47; // initial cost of .47
		
		if (weight > 1) { //if weight is over 1 adds \/ to the cost
			cost = cost + Math.ceil(weight - 1) * 0.21; 
		} 
		
		if (weight > 3.5) { // if weight is over 3.5, adds 0.47 to cost (again)
			cost = cost + 0.47;
		}
		
        return cost;
        
	}
}