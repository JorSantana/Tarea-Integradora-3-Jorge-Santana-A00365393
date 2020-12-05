package model;

public class AssistantCoach extends Employee{
	
	/** The class AssistantCoach extends Employee
	 * @author Jorge Santana
	 * @version 1.0
	 */
	
	//Attributes
	
	private int yearExp;
	private boolean WasPlayer;
	private int expert;
	
	//Constants
	
	public final static int OFFESNIVE = 0;
	public final static int DEFENSIVE = 1;
	public final static int POSESSION = 2;
	public final static int LABPLAY = 3;
	
	//Relations
	
	//Constructor method
	
	/*
	 * This is a constructor method of AssistantCoach
	 */
	
	public AssistantCoach(String name, String id, int salary, int state, int yearExp, boolean WasPlayer, int expert) {
		super(name,id,salary,state);
		this.yearExp = yearExp;
		this.WasPlayer = WasPlayer;
		this.expert = expert;
	}
	
	//Getters and setter

	/*
	 * This method is to get Yearexp
	 * @param: empty
	 * @return: int
	 * @post: get Yearexp
	 */
	
	public int getYearExp() {
		return yearExp;
	}
	
	/*
	 * This method is to set Yearexp
	 * @param: int yearExp
	 * @return: void
	 * @post: set a Yearexp
	 */

	public void setYearExp(int yearExp) {
		this.yearExp = yearExp;
	}
	
	/*
	 * This method is to get was a player
	 * @param: empty
	 * @return: boolean
	 * @post: get a was a player
	 */

	public boolean isWasPlayer() {
		return WasPlayer;
	}
	
	/*
	 * This method is to set was a player
	 * @param: boolean wasPlayer
	 * @return: void
	 * @post: set a was a player
	 */

	public void setWasPlayer(boolean wasPlayer) {
		WasPlayer = wasPlayer;
	}
	
	/*
	 * This method is to get expert
	 * @param: empty
	 * @return: int
	 * @post: get a was a expert
	 */

	public int getExpert() {
		return expert;
	}
	
	/*
	 * This method is to set expert
	 * @param: int expert
	 * @return: void
	 * @post: set a was a expert
	 */

	public void setExpert(int expert) {
		this.expert = expert;
	}
	
	
}
