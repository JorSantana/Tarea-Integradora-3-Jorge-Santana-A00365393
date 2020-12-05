package model;

import java.util.ArrayList;

/** The class Team 
 * @author Jorge Santana
 * @version 1.0
 */

public class Team {
	
	//Attributes
	
	private String name;
	
	//Relations
	
	private Coach coach;
	private ArrayList<AssistantCoach> assistantC;
	private ArrayList<Lineup> lineup;
	private ArrayList<Player> players;
	
	//Constructor method
	
	/*
	 * This is a constructor method of Team
	 */
	

	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<Player>();
		this.assistantC = new ArrayList<AssistantCoach>();
		this.lineup = new ArrayList<Lineup>();
		this.coach = null;
	}
	
	/*
	 * This method is to add lineup
	 * @param: Lineup a
	 * @return: void
	 * @post: add a lineup
	 */
	
	public void addLineup(Lineup a) {
		lineup.add(a);
	}
	
	/*
	 * This method is to toString all information
	 * @param: empty
	 * @return: String
	 * @post: toString all information
	 */
	
	public String toString() {
		String msg = "";
		msg = name + "\n" 
			+ "Coach: " + infoCoach() + "\n"
			+ "AssistantCoach: " + "\n" + infoAssistant()
			+ "Players: " + "\n" + infoPlayers()
			+ "Lineup: " + "\n" + infoLineup();
		
		return msg;
		
	}
	
	/*
	 * This method is to get info of coach
	 * @param: empty
	 * @return: String
	 * @post: info of coach
	 */
	
	public String infoCoach() {
		String msg = "";
		if(coach == null) {
			msg = "EMPTY";
		}else {
			msg = coach.getName() + " " + coach.getId();
		}
		
		return msg;
	}
	
	/*
	 * This method is to get info of lineup
	 * @param: empty
	 * @return: String
	 * @post: info of lineup
	 */
	
	public String infoLineup() {
		String msg = "";
		
		for (int i = 0; i < lineup.size(); i++) {
			msg += i + "- " + lineup.get(i).getLineup() + "\n";
		}
		return msg;
	}
	
	/*
	 * This method is to get info of assistant coach
	 * @param: empty
	 * @return: String
	 * @post: info of assistant coach
	 */
	
	public String infoAssistant() {
		String msg = "";
		
		for (int i = 0; i < assistantC.size(); i++) {
			msg += i + "- " + assistantC.get(i).getName() + " " + assistantC.get(i).getId() + "\n";
		}
		return msg;
	}
	
	/*
	 * This method is to get info of player
	 * @param: empty
	 * @return: String
	 * @post: info of player
	 */
	
	public String infoPlayers() {
		String msg = "";
		
		for (int i = 0; i < players.size(); i++) {
			msg += i + "- " + players.get(i).getName() + " " + players.get(i).getId() + "\n";
		}
		return msg;
	}
	
	/*
	 * This method is to aks if the player are here
	 * @param: Player a 
	 * @return: boolean
	 * @post: ask player are here
	 */
	
	public boolean askIsHere(Player a) {
		boolean ask = false;
		for (int i = 0; i < players.size(); i++) {
			if(a.getName().equals(players.get(i).getName())) {
				players.remove(a);
				ask = true;
			}else {
				
			}
		}
		return ask;
	}
	
	/*
	 * This method is to aks if the assistanCoach are here
	 * @param: AssistanCoach a 
	 * @return: void
	 * @post: ask assistanCoach are here
	 */
	
	public void askIsHere2(AssistantCoach a) {
		boolean ask = false;
		for(int i = 0; i < assistantC.size(); i++) {
			if(a.getName().equals(assistantC.get(i))) {
				assistantC.remove(a);
			}
		}
	}
	//Getters and setters
	
	/*
	 * This method is to getName
	 * @param: empty
	 * @return: String
	 * @post: get a name
	 */

	public String getName() {
		return name;
	}
	
	/*
	 * This method is to set Name
	 * @param: String name
	 * @return: void
	 * @post: set a name
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This method is to get a coach
	 * @param: empty
	 * @return: Coach
	 * @post: get a coach
	 */
	
	public Coach getCoach() {
		return coach;
	}
	
	/*
	 * This method is to set a coach
	 * @param: Coach coach
	 * @return: void
	 * @post: set a coach
	 */

	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	
	/*
	 * This method is to get a lineup
	 * @param: empty
	 * @return: ArrayList<Lineup>
	 * @post: get a lineup
	 */

	public ArrayList<Lineup> getLineup() {
		return lineup;
	}
	
	/*
	 * This method is to set a lineup
	 * @param: ArrayList<Lineup>
	 * @return: void
	 * @post: set a lineup
	 */

	public void setLineup(ArrayList<Lineup> lineup) {
		this.lineup = lineup;
	}
	
	/*
	 * This method is to get a AssistantC
	 * @param: empty
	 * @return: ArrayList<AssistantCoach>
	 * @post: get a AssistantC
	 */
	
	

	public ArrayList<AssistantCoach> getAssistantC() {
		return assistantC;
	}
	
	/*
	 * This method is to set a AssistantC
	 * @param: ArrayList<AssistantCoach>
	 * @return: void
	 * @post: set a AssistantC
	 */

	public void setAssistantC(ArrayList<AssistantCoach> assistantC) {
		this.assistantC = assistantC;
	}
	
	/*
	 * This method is to get a players
	 * @param: empty
	 * @return: ArrayList<Player>
	 * @post: get a players
	 */

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	/*
	 * This method is to set a players
	 * @param: ArrayList<Player>
	 * @return: void
	 * @post: set a players
	 */

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	
	
	
	
	
	
	
}
