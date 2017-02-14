package hw2;

/**
 * This class encapsulates the logic and state for a simplified
 * game of American football.  
 * 
 * @author Andrew Thompson
 */
public class FootballGame {
	
  /**
   * Number of points awarded for a touchdown.
   */  
  public static final int TOUCHDOWN_POINTS = 6;
  
  /**
   * Number of points awarded for a successful extra point attempt
   * after a touchdown.
   */ 
  public static final int EXTRA_POINTS = 1;
  
  /**
   * Number of points awarded for a field goal.
   */
  public static final int FIELD_GOAL_POINTS = 3;
  
  /**
   * Total length of the field from goal line to goal line, in yards.
   */
  public static final int FIELD_LENGTH = 100;
  
  /**
   * Initial position of the offensive team after receiving a kickoff.
   */ 
  public static final int STARTING_POSITION = 70;
  
  /**
   * Yards required to get a first down.
   */
  public static final int YARDS_FOR_FIRST_DOWN = 10;
  
  //My private 
  private int teamAScore; // Holds score for team 0
  private int teamBScore; // Holds score for team 1
  private int offenseTeam; // False: team 0; True: team 1;
  private int downNumber; // Holds the number for the down
  
  
  /**
   * Constructs a new game.
   */
  public FootballGame() {
	  teamAScore = 0;
	  teamBScore = 0;
	  offenseTeam = 0;
	  downNumber = 1;
	  
  }
  
  /**
   * Returns the current down.
   * @return downNumber
   */
  public int getDown() {
	   return downNumber;
  }
  
  /**
   * Returns the index for the team currently playing offense.
   * @return offenseTeam 
   */
  public int getOffense() {
	  return offenseTeam;
  }
  

}
