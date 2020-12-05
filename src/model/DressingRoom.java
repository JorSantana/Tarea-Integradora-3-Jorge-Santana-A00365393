package model;

public class DressingRoom extends Place{
	
	/** The class DressingRoom extends Place
	 * @author Jorge Santana
	 * @version 1.0
	 */
	
	//Attributes
	
	private Player[][] playersA;
	private String owner;
	private int lengtha;
	
	//Relations
	
	//Constructor method
	
	/*
	 * This is a constructor method of DressingRoom
	 */
	
	public DressingRoom(int option) {
		if(option == 1) {
			this.owner = "";
			this.playersA = new Player[7][6];
			this.lengtha = 6;
		}else {
			this.owner = "";
			this.playersA = new Player[7][7];
			this.lengtha = 7;
		}
		
		
	}
	
	/*
	 * This method is to fill a array
	 * @param: Player a 
	 * @return: String
	 * @post: fill a array
	 */
	
	public String fillDr(Player a) {
		String msg = "";
		boolean add = false;
		for(int i = 0; i<playersA.length; i++) {
			if(i%2 == 0) {
				if(add == false) {
					for(int j = 0; j < playersA[i].length; j++) {
						if(playersA[i][j] == null) {
							playersA[i][j] = a;
							add = true;
							msg = "The player is add";
							break;	
						}
						msg = "The player isn´t add full";
						j = j + 1;
						
					}
				}else {
					break;
				}
				
			}else{
				if(add == false) {
					for(int j = 1; j < playersA[i].length; j++) {
						if(playersA[i][j] == null) {
							playersA[i][j] = a;
							add = true;
							msg = "The player is add";
							break;
							
						}
						msg = "The player isn´t add and full";
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
	 * This method is to dismiss employee
	 * @param: Player a 
	 * @return: void
	 * @post: dismiss a employee
	 */
	
	public void dismiss(Player a) {
		for(int i = 0; i < playersA.length; i++) {
			for (int j = 0; j < playersA[i].length; j++) {
				if(a.getName().equals(playersA[i][j].getName())){
					playersA[i][j] = null;
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
	for(int i = 0; i < playersA.length; i++) {
		for(int j = 0; j < playersA[i].length; j++) {
			if(playersA[i][j] == null) {
				msg += "[" + "Empty" + "]" + " ";
			}else {
				msg += "[" + playersA[i][j].getName() + "]" + " ";
			}
			
		}
		msg += "\n";
	}
		return msg;
	}
	
	//Getters and setters
	
	/*
	 * This method is to get a Owner
	 * @param: empty
	 * @return: String
	 * @post: get a owner
	 */
	

	public String getOwner() {
		return owner;
	}
	
	/*
	 * This method is to get a Lengtha
	 * @param: empty
	 * @return: int
	 * @post: get a Lenghta
	 */

	public int getLengtha() {
		return lengtha;
	}
	
	/*
	 * This method is to set a Lengtha
	 * @param: int length
	 * @return: void
	 * @post: set a Lenghta
	 */
	
	
	public void setLengtha(int length) {
		this.lengtha = length;
	}
	
	/*
	 * This method is to set a Owner
	 * @param: int length
	 * @return: void
	 * @post: set a owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/*
	 * This method is to get a playersA
	 * @param: empty
	 * @return: Player[][]
	 * @post: get a playersA
	 */

	public Player[][] getPlayersA() {
		return playersA;
	}
	
	/*
	 * This method is to set a playersA
	 * @param: Player[][]
	 * @return: void
	 * @post: set a playersA
	 */

	public void setPlayersA(Player[][] playersA) {
		this.playersA = playersA;
	}
	
	
	
	

}
