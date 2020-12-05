package model;

public class Office extends Place{
	
	/** The class Office extends Place
	 * @author Jorge Santana
	 * @version 1.0
	 */

	
	//Attributes
	
	private Coach[][] officeCoach;
	
	//Relations
	
	//Constructor method
	
	/*
	 * This is a constructor method of Office
	 */
	
	public Office() {
		this.officeCoach = new Coach[6][6];
	}
	
	//Getters and setters
	
	/*
	 * This method is to dismiss employee
	 * @param: Coach a 
	 * @return: void
	 * @post: dismiss a employee
	 */
	
	public void dismiss(Coach a) {
		for (int i = 0; i < officeCoach.length; i++) {
			for (int j = 0; j < officeCoach.length; j++) {
				if(a.getId().equals(officeCoach[i][j].getId())) {
					officeCoach[i][j] = null;
				}
			}
		}
	}
	
	/*
	 * This method is to toString a array
	 * @param: empty
	 * @return: String
	 * @post: toString a array
	 */
	
	public String toString() {
		String msg = "";
		for(int i = 0; i < officeCoach.length; i++) {
			for(int j = 0; j < officeCoach[i].length; j++) {
				if(officeCoach[i][j] == null) {
					msg += "[" + "Empty" + "]" + " ";
				}else {
					msg += "[" + officeCoach[i][j].getName() + "]" + " ";
				}
				
			}
			msg += "\n";
		}
			return msg;
		}
	
	/*
	 * This method is to fill a array
	 * @param: Coach a 
	 * @return: String
	 * @post: fill a array
	 */
	
	public String fillO(Coach a) {
		String msg = "";
		boolean add = false;
		for(int i = 0; i<officeCoach.length; i++) {
			if(i%2 == 0) {
				if(add == false) {
					for(int j = 0; j < officeCoach[i].length; j++) {
						if(officeCoach[i][j] == null) {
							officeCoach[i][j] = a;
							add = true;
							msg = "The coach is add";
							break;	
						}
						msg = "The coach isn´t add and full";
						j = j + 1;
						
					}
				}else {
					break;
				}
				
			}else{
				if(add == false) {
					for(int j = 1; j < officeCoach[i].length; j++) {
						if(officeCoach[i][j] == null) {
							officeCoach[i][j] = a;
							add = true;
							msg = "The coach is add";
							break;
							
						}
						msg = "The coach isn´t add and full";
						j = j + 1;
					}
				}else {
					break;
				}
				
			}
		}
		
		return msg;
		
	}
	
	/*
	 * This method is to get OfficeCoach
	 * @param: empty
	 * @return: Coach[][]
	 * @post: get a office coach
	 */

	public Coach[][] getOfficeCoach() {
		return officeCoach;
	}
	
	/*
	 * This method is to set OfficeCoach
	 * @param: Coach[][]
	 * @return: void
	 * @post: set a office coach
	 */

	public void setOfficeCoach(Coach[][] officeCoach) {
		this.officeCoach = officeCoach;
	}
	
	

}
