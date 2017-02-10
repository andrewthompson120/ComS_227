package postage1;

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
       
		if (weight <= 1) {
			cost = 0.47;
		}
		/*
		 * Sets the cost to .47 if weight is 1oz or under
		 */
		
		else {
			if ((weight > 1) && (weight <= 3.5)) {
				cost = 0.47 + Math.ceil(weight - 1) * 0.21;
			}
			/*
			 * Sets the cost based on package weight between 1 < w <= 3.5
			 */
			else {
				cost = 0.94 + Math.ceil(weight -1) * 0.21;
			}
			/*
			 * sets cost for packages over 3.5oz
			 */
		}
		
        return cost;
        
	}
}