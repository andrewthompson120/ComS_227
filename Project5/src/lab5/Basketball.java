package lab5;

public class Basketball {
	
	private boolean inflatedStatus;
	private double diameter;
	
  public Basketball(double givenDiameter) {
	  inflatedStatus = false;
	  diameter = givenDiameter;
  }

  public boolean isDribbleable() {
	  return inflatedStatus;
  }

  public double getDiameter() {
	  return diameter;
  }

  public double getCircumference() {
	  return 0;
  }

  public void inflate() {
	   inflatedStatus = true;
  }
  
}

