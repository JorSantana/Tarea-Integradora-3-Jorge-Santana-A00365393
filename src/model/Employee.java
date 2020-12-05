package model;

public class Employee {
	
	/** The class Employee.
	 * @author Jorge Santana
	 * @version 1.0
	 */
	
	//Attributes
	
	private String name;
	private String id;
	private int salary;
	private int state;
	
	//Constants
	
	public final int ACTIVE = 1;
	public final int INACTIVE = 0;
	
	//Relations
	
	//Constructor method 
	
	/*
	 * This is a constructor method of Employee
	 */
	
	public Employee(String name, String id, int salary, int state) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.state = state;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a name
	 * @param: empty
	 * @return: String
	 * @post: get a name
	 */

	public String getName() {
		return name;
	}
	
	/*
	 * This method is to set a name
	 * @param: String name
	 * @return: void
	 * @post: set a name
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This method is to get a id
	 * @param: empty
	 * @return: String
	 * @post: get a id
	 */

	public String getId() {
		return id;
	}
	
	/*
	 * This method is to set a id
	 * @param: String id
	 * @return: void
	 * @post: set a id
	 */

	public void setId(String id) {
		this.id = id;
	}
	
	/*
	 * This method is to get a salary
	 * @param: empty
	 * @return: int
	 * @post: get a salary
	 */

	public int getSalary() {
		return salary;
	}
	
	/*
	 * This method is to set a salary
	 * @param: int salary
	 * @return: void
	 * @post: set a salary
	 */
	
	

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/*
	 * This method is to get a state
	 * @param: empty
	 * @return: int
	 * @post: get a state
	 */

	public int getState() {
		return state;
	}
	
	/*
	 * This method is to set a state
	 * @param: int state
	 * @return: void
	 * @post: set a state
	 */

	public void setState(int state) {
		this.state = state;
	}
	
	

}
