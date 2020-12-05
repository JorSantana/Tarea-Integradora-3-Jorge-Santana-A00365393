package model;

public class Coach extends Employee{
	
	/** The class Coach extends Employee
	 * @author Jorge Santana
	 * @version 1.0
	 */

	//Attributes
	
	private int yearExp;
	private int teamsNumber;
	private int championsChipW;
	
	//Relations
	
	//Constructor method
	
	/*
	 * This is a constructor method of Coach
	 */
	
	public Coach(String name, String id, int salary, int state, int yearExp, int teamsNumber, int championsChipW) {
		super(name, id, salary, state);
		this.yearExp = yearExp;
		this.teamsNumber = teamsNumber;
		this.championsChipW = championsChipW;
	}
	
	//Getters and setter
	
	/*
	 * This method is to give a levelOfPlayer
	 * @param: empty
	 * @return: double
	 * @post: give a levelOfPlayer
	 */
	
	public double levelOfPlayer() {
		double levelPlayer = 0;
		
		levelPlayer = 5 + (championsChipW/10);
		
		return levelPlayer;
	}
	
	/*
	 * This method is to give a priceMarket
	 * @param: empty
	 * @return: int
	 * @post: give a priceMarket
	 */
	
	public int priceMarket() {
		int price = 0;
		price = (getSalary() * 10) + (yearExp * 100) + (championsChipW * 50); 
		return price;
	}
	
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
	 * This method is to get teams number
	 * @param: empty
	 * @return: int
	 * @post: get a team number
	 */

	public int getTeamsNumber() {
		return teamsNumber;
	}
	
	/*
	 * This method is to set teams number
	 * @param: int teamsNumber
	 * @return: void
	 * @post: set a team number
	 */

	public void setTeamsNumber(int teamsNumber) {
		this.teamsNumber = teamsNumber;
	}
	
	/*
	 * This method is to get championsChip
	 * @param: empty
	 * @return: int
	 * @post: get a championsChip
	 */

	public int getChampionsChipW() {
		return championsChipW;
	}
	
	/*
	 * This method is to set championsChip
	 * @param: int championsChipW
	 * @return: void
	 * @post: set a championsChip
	 */

	public void setChampionsChipW(int championsChipW) {
		this.championsChipW = championsChipW;
	}
	
	
	
	

}
