package model;

public class Player extends Employee{
	
	/** The class Player extends Employee
	 * @author Jorge Santana
	 * @version 1.0
	 */
	
	//Attributes
	
	private int shirtNumber;
	private int goals;
	private int gradeAverage; 
	private int position;
	
	//Constants
	
	public final static int GOALKEEPER = 0;
	public final static int DEFENDER = 1;
	public final static int MIDFIELDER = 2;
	public final static int FORWARD = 3;
	
	//Relations
	
	//Constructor Method
	
	/*
	 * This is a constructor method of Player
	 */
	
	public Player (String name, String id, int salary, int state, int shirtNumber, int goals, int gradeAverage, int position) {
		super(name, id, salary, state);
		this.shirtNumber = shirtNumber;
		this.goals = goals;
		this.gradeAverage = gradeAverage;
		this.position = position;
	}
	
	//Getters and setters
	
	/*
	 * This method is to give a priceMarket
	 * @param: empty
	 * @return: int
	 * @post: give a priceMarket
	 */
	
	public int priceMarket() {
		int price = 0;
		if(position == GOALKEEPER) {
			price = (getSalary() * 12) + (gradeAverage * 150);
		}else if(position == DEFENDER) {
			price = (getSalary() * 13) + (gradeAverage * 125) + (goals * 100);
		}else if(position == MIDFIELDER) {
			price = (getSalary() * 14) + (gradeAverage * 130) + (goals * 125);
		}else if(position == FORWARD) {
			price = (getSalary() * 15) + (gradeAverage * 145) + (goals * 150);
		}else {
			
		}
		return price;
	}
	
	/*
	 * This method is to give a levelOfPlayer
	 * @param: empty
	 * @return: double
	 * @post: give a levelOfPlayer
	 */
	
	public double levelOfPlayer() {
		double levelPlayer = 0;
		if(position == GOALKEEPER) {
			levelPlayer = gradeAverage * 0.9;
		}else if(position == DEFENDER) {
			levelPlayer = (gradeAverage * 0.9) + (goals/100);
		}else if(position == MIDFIELDER) {
			levelPlayer = (gradeAverage * 0.9) + (goals/90);
		}else if(position == FORWARD) {
			levelPlayer = (gradeAverage * 0.9) + (goals/80);
		}else {
			
		}
		
		return levelPlayer;
	}
	
	/*
	 * This method is to get a shirt number
	 * @param: empty
	 * @return: int
	 * @post: get a shirt number
	 */

	public int getShirtNumber() {
		return shirtNumber;
	}
	
	/*
	 * This method is to set a shirt number
	 * @param: int shirtNumber
	 * @return: void
	 * @post: set a shirt number
	 */

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	
	/*
	 * This method is to get a goals
	 * @param: empty
	 * @return: int
	 * @post: get a goals
	 */

	public int getGoals() {
		return goals;
	}
	
	/*
	 * This method is to set a goals
	 * @param: int goals
	 * @return: void
	 * @post: set a goals
	 */

	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	/*
	 * This method is to get a gradeAverage
	 * @param: empty
	 * @return: int
	 * @post: get a gradeAverage
	 */

	public int getGradeAverage() {
		return gradeAverage;
	}
	
	/*
	 * This method is to set a gradeAverage
	 * @param: int gradeAverage
	 * @return: void
	 * @post: set a gradeAverage
	 */

	public void setGradeAverage(int gradeAverage) {
		this.gradeAverage = gradeAverage;
	}
	
	/*
	 * This method is to get a position
	 * @param: empty
	 * @return: int
	 * @post: get a position
	 */

	public int getPosition() {
		return position;
	}
	
	/*
	 * This method is to set a position
	 * @param: int position
	 * @return: void
	 * @post: set a position
	 */

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
