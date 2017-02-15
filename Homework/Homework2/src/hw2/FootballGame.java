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
  
  //My private variables
  private int teamAScore; // Holds score for team 0
  private int teamBScore; // Holds score for team 1
  private int offenseTeam; // False: team 0; True: team 1;
  private int downNumber; // Holds the number for the down
  private int yardsToFirstDown; // Yards until 1st down
  private int yardsToGoalLine; // Yards to the end zone
  
  
  /**
   * Constructs a new game.
   */
  public FootballGame() {
	  teamAScore = 0;
	  teamBScore = 0;
	  offenseTeam = 0;
	  downNumber = 1;
	  yardsToFirstDown = YARDS_FOR_FIRST_DOWN;
	  yardsToGoalLine = STARTING_POSITION;
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
  
  /**
   * Returns the points for the indicated team.
   * @param whichTeam
   * @return teamAScore/teamBScore
   */
  public int getScore(int whichTeam) {
	  if (whichTeam == 0) {
		  return teamAScore;
	  }
	  else {
		  return teamBScore;
	  }
  }
  
  /**
   * Returns the number of yards the offense must advance the ball to get a first down.
   * @return yardsToFirst
   */
  public int getYardsToFirstDown() {
	  return yardsToFirstDown;
  }
  
  /**
   * Returns the location of the ball as the number of yards to the opposing team's goal line.
   * @return yardsToGoalLine
   */
  public int getYardsToGoalLine() {
	  return yardsToGoalLine;
  }
  
  
  /**
   * Records the result of an extra point attempt, 
   * adding EXTRA_POINTS points if the attempt was successful.
   * @param success
   */
  public void extraPoint(boolean success) {
	  if(success) {
		  
		  if (offenseTeam == 0) {
			  teamAScore = teamAScore + EXTRA_POINTS;
		  }
		  else {
			  teamBScore = teamBScore + EXTRA_POINTS;
		  }
		  
	  }
  }
  
  /**
   * Records the result of a field goal attempt, 
   * adding FIELD_GOAL_POINTS points if the field goal was successful.
   * @param success
   */
  public void fieldGoal(boolean success) {
	  if(success) {
		  
		  if(offenseTeam == 0) {
			  teamAScore = teamAScore + FIELD_GOAL_POINTS;
		  }
		  else {
			  teamBScore = teamBScore + FIELD_GOAL_POINTS;
		  }
		  
	  }
  }
  
  /**
   * Records the result of a punt.
   * @param yards
   */
  public void punt(int yards) {
	  if(offenseTeam == 0) {
		  
		  offenseTeam = 1;
		  downNumber = 1;
		  yardsToFirstDown = YARDS_FOR_FIRST_DOWN;
		  
		  if((yardsToGoalLine + yards) > FIELD_LENGTH) {
			  yardsToGoalLine = FIELD_LENGTH;
		  }
		  else {
			  yardsToGoalLine = yardsToGoalLine + yards;
		  }
		  
	  }
  }
  
  /**
   * Records the result of advancing the ball the given number of yards, 
   * possibly resulting in a first down, a touchdown, or a turnover.
   * @param yards
   */
  public void runOrPass(int yards) {
	  // Made touchdown 
	  if ((yardsToGoalLine - yards) <= 0) {		 
		  if(offenseTeam == 0) {
			  teamAScore = teamAScore + TOUCHDOWN_POINTS;
		  }
		  else {
			  teamBScore = teamBScore + TOUCHDOWN_POINTS;
		  }
		  downNumber = 1;		  
	  }
	  
	  // Made first down
	  else if((yardsToFirstDown - yards) <= 0) { 
		  yardsToFirstDown = YARDS_FOR_FIRST_DOWN;
		  yardsToGoalLine = yardsToGoalLine - yards;
		  downNumber = 1;
	  }
	  
	  // Failed 4th Down
	  else if(((downNumber + 1) > 4) && (yardsToFirstDown - yards > 0)) {
		  yardsToFirstDown = YARDS_FOR_FIRST_DOWN;
		  downNumber = 1;
		  yardsToGoalLine = yardsToGoalLine - yards;
		  yardsToGoalLine = FIELD_LENGTH - yardsToGoalLine;
		  
		  if (offenseTeam == 0) {
			  offenseTeam = 1;
		  }
		  else {
			  offenseTeam = 0;
		  }
		  
	  }
	  
	  //Normal run/pass
	  else {
		  downNumber = downNumber + 1;
		  yardsToGoalLine = yardsToGoalLine - yards;
		  yardsToFirstDown = yardsToFirstDown - yards;
	  }
	  
  }
  

}
