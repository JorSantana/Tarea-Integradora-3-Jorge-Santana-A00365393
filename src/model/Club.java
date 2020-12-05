package model;

import java.util.ArrayList;

public class Club {
	
	/** The class Club.
	 * @author Jorge Santana
	 * @version 1.0
	 */

	//Attributes
	
	private String name;
	private String nit;
	private String dateFundation;
	private int contaD;
	private int contaO;
	
	//Relation
	private Team teamA;
	private Team teamB;
	private ArrayList<Player> playersC;
	private ArrayList<Coach> coachC;
	private ArrayList<AssistantCoach> acoachC;
	private ArrayList<Place> places;
	
	
	//Constructor Method
	
	/*
	 * This is a constructor method of Club
	 */
	
	public Club(String name, String nit, String dateFundation) {
		this.name = name;
		this.nit = nit;
		this.dateFundation= dateFundation;
		playersC = new ArrayList<Player>();
		coachC = new ArrayList<Coach>();
		acoachC = new ArrayList<AssistantCoach>();
		places = new ArrayList<Place>();
		contaD = 0;
		contaO = 0;
	}
	
	//Requiriments
	
	/*
	 * This method is to addEmployee
	 * @pre: Club != null;
	 * @param: Employee employee
	 * @return: String
	 * @post: Employee added
	 */
	
	public String addEmployee(Employee employee){
		String msg = "";
		if(employee instanceof Player) {
			Player temp = (Player) employee;
			playersC.add(temp);
			msg = "Added in playersC succesfull";
		}else if(employee instanceof Coach) {
			Coach temp = (Coach) employee;
			coachC.add(temp);
			msg = "Added in coachC succesfull";
		}else if(employee instanceof AssistantCoach) {
			AssistantCoach temp = (AssistantCoach) employee;
			acoachC.add(temp);
			msg = "Added in acoachC succesfull";
		}else {
			msg = "The employee cant add";
		}
		return msg;
	}
	
	/*
	 * This method is to addPlace
	 * @pre: Club != null;
	 * @param: Place place
	 * @return: String
	 * @post: Place added
	 */
	
	public String addPlace(Place place) {
		String msg = "";
		if(places.size() < 3) {
			if(place instanceof DressingRoom) {
				if(contaD < 2) {
					places.add(place);
					contaD++;
					msg = "The place is added succesful like DressingRoom" + contaD;
				}else {
					msg = "The place is not added because already have two DressingRoom";
				}
			}else if(place instanceof Office) {
				if(contaO < 1) {
					places.add(place);
					contaO++;
					msg = "The places is added succesful like a Office";
				}else {
					msg = "The place is not added because already have 1 office";
				}
			}
			
		}else {
			msg = "Already have three places to this club";
		}
		return msg;
	}
	
	/*
	 * This method is to searchPlayer
	 * @pre: players != null;
	 * @param: int a
	 * @return: Player
	 * @post: Player found
	 */
	public Player searchPlayer(int a) {
		Player temp = null;
		for(int i = 0; i < playersC.size(); i++) {
			if(a == i) {
				temp = playersC.get(i);
			}
		}
		return temp;
	}
	
	/*
	 * This method is to searchCoach
	 * @pre: coach != null;
	 * @param: int a
	 * @return: Coach
	 * @post: Coach found
	 */
	
	public Coach searchCoach(int a) {
		Coach temp = null;
		for(int i = 0; i < coachC.size(); i++) {
			if(i == a) {
				temp = coachC.get(i);
			}
		}
		return temp;
	}
	
	/*
	 * This method is to searchaCoach
	 * @pre: acoach != null;
	 * @param: int a
	 * @return: aCoach
	 * @post: aCoach found
	 */
	
	public AssistantCoach searchaCoach(int a) {
		AssistantCoach temp = null;
		for(int i = 0; i < acoachC.size(); i++) {
			if(i == a) {
				temp = acoachC.get(i);
			}
		}
		return temp;
	}
	
	/*
	 * This method is to give all info of player
	 * @pre: player != null;
	 * @param: boolean a 
	 * @return: String
	 * @post: Info of players
	 */
	
	public String infoPlayer(boolean a) {
		String msg = "";
		if(a == false) {
			for(int i = 0; i < playersC.size(); i++) {
				msg += i + "- " + playersC.get(i).getName() + " " + playersC.get(i).getId()+ "\n";
			}
		}else {
			for(int i = 0; i < playersC.size(); i++) {
				msg += i + "- " + playersC.get(i).getName() + " " + playersC.get(i).getId()+ " PM: " + playersC.get(i).priceMarket()
						+ " LS: " + playersC.get(i).levelOfPlayer() + "\n";
			}
		}
		return msg;
	}
	
	/*
	 * This method is to give all info of coach
	 * @pre: coach != null;
	 * @param: boolean a 
	 * @return: String
	 * @post: Info of coach
	 */
	
	public String infoCoach(boolean a) {
		String msg = "";
		if(a == false) {
		for(int i = 0; i < coachC.size(); i++) {
			msg += i + "- " + coachC.get(i).getName() + " " + coachC.get(i).getId() + "\n";
		}
		}else {
			for(int i = 0; i < coachC.size(); i++) {
				msg += i + "- " + coachC.get(i).getName() + " " + coachC.get(i).getId() + " PM: " + coachC.get(i).priceMarket()
						+ " LS: " + coachC.get(i).levelOfPlayer() + "\n";
			}
		}
		return msg;
	}
	
	/*
	 * This method is to give all info of acoach
	 * @pre: acoachC != null;
	 * @param: boolean a 
	 * @return: String
	 * @post: Info of acoachC
	 */
	
	public String infoacoachC() {
		String msg = "";
		for(int i = 0; i < acoachC.size(); i++) {
			msg += i + "- " + acoachC.get(i).getName() + " " + acoachC.get(i).getId()+ "\n";
		}
		return msg;
	}
	
	/*
	 * This method is to add all information in one
	 * @pre: Club != null;
	 * @param: boolean a 
	 * @return: String
	 * @post: All info
	 */
	
	public String allInformation(boolean a) {
		String msg = "Information of Employees" + "\n"
					 + "PLAYERS" + "\n" 
					 + infoPlayer(a) + "\n"
					+ "COACH OF CLUB" + "\n" 
					 + infoCoach(a) + "\n"
					 + "AssistantCoach of Club" + "\n"
					 + infoacoachC();
					 
		return msg;
	}
	
	/*
	 * This method is to add all information in one about club
	 * @pre: Club != null;
	 * @param: boolean a 
	 * @return: String
	 * @post: All info of club
	 */
	
	public String allInformation2(boolean a) {
		String msg = "All information of Club" + "\n"
					 + "PLAYERS OF CLUB" + "\n" 
					 + infoPlayer(a) + "\n"
					+ "COACH OF CLUB" + "\n" 
					 + infoCoach(a) + "\n"
					 + "AssistantCoach of Club" + "\n"
					 + infoacoachC() + "\n"
					 + "PLACES: " + "\n"
					 + placesInfo() + "\n"
					 + "TEAMS: " + "\n" 
					 + teamA.toString() + "\n"
					 + teamB.toString();
					 
		return msg;
	}
	
	/*
	 * This method is to initialize a team
	 * @pre: Club != null;
	 * @param: empty
	 * @return: void
	 * @post: Teams a and b initialize
	 */
	
	public void initializeTeams() {
		teamA = new Team("TeamA");
		teamB = new Team("TeamB");
	}
	
	/*
	 * This method is to add Player to team
	 * @pre: Club != null; playersC != null; 
	 * @param: int option, Player temp 
	 * @return: String
	 * @post: The player is added to team;
	 */
	
	public String addPlayerToTeam(int option, Player temp) {
		String msg = "";
		if(option == 1) {
			if(teamA.getPlayers().size() < 25) {
				System.out.println(temp.getName());
				teamA.getPlayers().add(temp);
				msg = "The player was add to teamA succesfull";
			}else {
				msg = "The player cant add because the teamA have all players";
			}
		}else if(option == 2) {
			if(teamB.getPlayers().size() < 25) {
				teamB.getPlayers().add(temp);
				msg = "The player was add to teamB succesfull";
			}else {
				msg = "The player cant add because the teamB have all players";
			}
		}else {
			msg = "The option isn´t correct";
		}
		
		return msg;
	}
	
	/*
	 * This method is to add AssistantCoach to team
	 * @pre: Club != null; acoachC != null; 
	 * @param: int option, AssistantCoach temp 
	 * @return: String
	 * @post: The AssistantCoach is added to team;
	 */
	public String addAssistantCToTeam(int option, AssistantCoach temp) {
		String msg = "";
		if(option == 1) {
			if(teamA.getAssistantC().size() < 3) {
				teamA.getAssistantC().add(temp);
				msg = "The Assistant coach was add succesfull to teamA";
			}else {
				msg = "The Assistant coach cant add because the teamA is full";
			}
		}else if(option == 2) {
			if(teamB.getAssistantC().size() < 3) {
				teamB.getAssistantC().add(temp);
				msg = "The Assistant coach was add succesfull to teamB";
			}else {
				msg = "The Assistant coach cant add because the teamB is full";
			}
		}else {
			msg = "The option isn´t correct";
		}
		
		return msg;
	}
	
	/*
	 * This method is to add Coach to team
	 * @pre: Club != null; coachC != null; 
	 * @param: int option, coach temp 
	 * @return: String
	 * @post: The Coach is added to team;
	 */
	
	public String addCoachtoTeam(int option, Coach temp) {
		
		String msg = "";
		if(option == 1) {
			if(teamA.getCoach() == null) {
				teamA.setCoach(temp);
				msg = "The coach was added succesfull in teamA";
			}else {
				msg = "The coach cant added because already have one in teamA";
			}
		}else if(option ==2) {
			if(teamB.getCoach() == null) {
				teamB.setCoach(temp);
				msg = "The coach was added succesfull in teamB";
			}else {
				msg = "The coach cant added because already have one in teamB";
			}
			
		}else {
			msg = "The option isn´t correct";
		}
		
		return msg;
	}
	
	/*
	 * This method is to add lineup to team
	 * @pre: Club != null; lineup != null; 
	 * @param: int option, lineup temp 
	 * @return: String
	 * @post: The lineup is added to team;
	 */
	
	public String addLineuptoTeam(int option, Lineup temp) {
		
		String msg = "";
		if(option == 1) {
				teamA.addLineup(temp);
				msg = "The lineup was add succesfull to teamA";
		}else if(option == 2) {
				teamB.addLineup(temp);
				msg = "The lineup was add succesfull to teamB";
		}else {
			msg = "The option isn´t correct";
		}
		
		return msg;
	}
	/*
	 * This method is to search
	 * @pre: Club != null; places != null; 
	 * @param: int a
	 * @return: Place
	 * @post: A place found
	 */
	public Place search(int a) {
		Place temp = null;
		for(int i = 0; i < places.size(); i++) {
			if(a == i) {
				temp = places.get(i);
			}
		}
		return temp;
		
	}
	
	/*
	 * This method is to have the places info
	 * @param: empty
	 * @return: String
	 * @post: All info of places
	 */
	
	public String placesInfo(){
		String msg = "";
		for (int i = 0; i < places.size(); i++) {
			if(places.get(i) instanceof DressingRoom) {
				DressingRoom dr = (DressingRoom) places.get(i);
				msg += i + "- DressingRoom " + "[7]" + "[" + dr.getLengtha() + "]" + "\n";
			}else {
				msg += i + "- Office" + "\n";
			}
		}
		return msg;
	}
	
	/*
	 * This method is to organize players in dressingRoom
	 * @param: DressingRoom a, Team b
	 * @return: String
	 * @post: Players organize in dressingRoom
	 */
	
	public String fillDRoom(DressingRoom a, Team b) {
		String msg = "";
			if(a.getOwner().equals(b.getName())) {
				Player[][] dr;
				if(a.getLengtha() == 6) {
					dr = new Player[7][6];
					a.setPlayersA(dr);
					for(int i = 0; i < b.getPlayers().size(); i++) {
						Player temp = b.getPlayers().get(i);
						msg = a.fillDr(temp);
					}
					
				}else {
					dr = new Player[7][7];
					a.setPlayersA(dr);
					for(int i = 0; i < b.getPlayers().size(); i++) {
						Player temp = b.getPlayers().get(i);
						msg = a.fillDr(temp);
					}
				}
				
			}else {
				msg = "The DressingRoom isn´t propierty of team";
			}
		return msg;
	}
	
	/*
	 * This method is to organize coach in office
	 * @param: Office a
	 * @return: String
	 * @post: Coach organize in office
	 */
	
	public String fillOffice(Office a) {
		String msg = "";
		Coach[][] of = new Coach[6][6];
		a.setOfficeCoach(of);
 		for (int i = 0; i < coachC.size(); i++) {
			msg = a.fillO(coachC.get(i));
		}
		return msg;
	}
	
	/*
	 * This method is to dismiss player
	 * @param: Player a
	 * @return: void
	 * @post: Player dismiss
	 */
	
	public void dismissPlayer(Player a) {
		playersC.remove(a);
		teamA.askIsHere(a);
		teamB.askIsHere(a);
		for (int i = 0; i < places.size(); i++) {
			if(places.get(i) instanceof DressingRoom) {
				DressingRoom dr = (DressingRoom) places.get(i);
				dr.dismiss(a);
			}
		}
	}
	
	/*
	 * This method is to dismiss Coach
	 * @param: Coach a
	 * @return: void
	 * @post: Coach dismiss
	 */
	
	public void dismissCoach(Coach a) {
		coachC.remove(a);
		if(teamA.getCoach().getName().equals(a.getName())) {
			teamA.setCoach(null);
		}else if(teamB.getCoach().getName().equals(a.getName())) {
			teamB.setCoach(null);
		}
		
		for(int i = 0; i < places.size(); i++) {
			if(places.get(i) instanceof Office) {
				Office of = (Office) places.get(i);
				of.dismiss(a);
				
			}
		}
	}
	
	/*
	 * This method is to dismiss aCoach
	 * @param: aCoach a
	 * @return: void
	 * @post: aCoach dismiss
	 */
	
	public void dismissaCoach(AssistantCoach a) {
		acoachC.remove(a);
		if(teamA.getCoach().getName().equals(a.getName())) {
			teamA.askIsHere2(a);;
		}else if(teamB.getCoach().getName().equals(a.getName())) {
			teamB.askIsHere2(a);;
		}
		
	}
	
	
	
	
	//Getters and setters
	
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
	 * This method is to get a nit
	 * @param: empty
	 * @return: String
	 * @post: get a nit
	 */

	public String getNit() {
		return nit;
	}
	
	/*
	 * This method is to set a nit
	 * @param: String nit
	 * @return: void
	 * @post: set a nit
	 */

	public void setNit(String nit) {
		this.nit = nit;
	}
	
	/*
	 * This method is to get a date fundation
	 * @param: empty
	 * @return: String
	 * @post: get a date fundation
	 */

	public String getDateFundation() {
		return dateFundation;
	}
	
	/*
	 * This method is to set a date fundation
	 * @param: String dateFundation
	 * @return: void
	 * @post: set a date fundation
	 */

	public void setDateFundation(String dateFundation) {
		this.dateFundation = dateFundation;
	}
	
	/*
	 * This method is to get a teamA
	 * @param: empty
	 * @return: Team
	 * @post: get a teamA
	 */
	
	public Team getTeamA() {
		return teamA;
	}
	
	/*
	 * This method is to set a teamA
	 * @param: Team teamA
	 * @return: void
	 * @post: set a teamA
	 */

	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}
	
	/*
	 * This method is to get a teamB
	 * @param: empty
	 * @return: Team
	 * @post: get a teamB
	 */

	public Team getTeamB() {
		return teamB;
	}
	
	/*
	 * This method is to set a teamB
	 * @param: Team teamB
	 * @return: void
	 * @post: set a teamB
	 */


	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}
	
	/*
	 * This method is to get a places
	 * @param: empty
	 * @return: ArrayList<Place>
	 * @post: get a places
	 */


	public ArrayList<Place> getPlaces() {
		return places;
	}
	
	/*
	 * This method is to set a places
	 * @param: ArrayList<Place> places
	 * @return: void
	 * @post: set a places
	 */

	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}
	
	/*
	 * This method is to get a players
	 * @param: empty
	 * @return: ArrayList<Player>
	 * @post: get a players
	 */

	public ArrayList<Player> getPlayersC() {
		return playersC;
	}
	
	/*
	 * This method is to set a players
	 * @param: ArrayList<Player> playersC
	 * @return: void
	 * @post: set a players
	 */

	public void setPlayersC(ArrayList<Player> playersC) {
		this.playersC = playersC;
	}
	
	/*
	 * This method is to get a CoachC
	 * @param: empty
	 * @return: ArrayList<Coach>
	 * @post: get a coach
	 */

	public ArrayList<Coach> getCoachC() {
		return coachC;
	}
	
	/*
	 * This method is to set a coach
	 * @param: ArrayList<Coach>
	 * @return: void
	 * @post: set a coach
	 */

	public void setCoachC(ArrayList<Coach> coachC) {
		this.coachC = coachC;
	}
	
	/*
	 * This method is to get a acoach
	 * @param: empty
	 * @return: ArrayList<aCoach>
	 * @post: get a acoach
	 */

	public ArrayList<AssistantCoach> getAcoachC() {
		return acoachC;
	}
	
	/*
	 * This method is to set a acoach
	 * @param: ArrayList<AssistantCoach> acoachC
	 * @return: ArrayList<aCoach>
	 * @post: set a acoachC
	 */

	public void setAcoachC(ArrayList<AssistantCoach> acoachC) {
		this.acoachC = acoachC;
	}
	
	
	
	
	
	

	
	
}
