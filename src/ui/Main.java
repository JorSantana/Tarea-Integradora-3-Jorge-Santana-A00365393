package ui;

import java.util.Scanner;

import model.*;

public class Main {

	//Attributtes
	
		private Scanner entrie1;
		private Scanner entrie2;
		private int a;
		private boolean market;
		
		//Relations
		
		private Club control;
		
		//

		public static void main(String[] args) {
			Main a = new Main();
			a.start();
		}
		
		/*
		 * This method is to start the program of Main
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the main
		 */
		
		public void start() {
			this.a = 1;
			this.market = false;
			entrie1 = new Scanner(System.in);
			entrie2 = new Scanner(System.in);
			control = new Club("Algoritmos F.C", "1254", "08/25/2000");
			control.initializeTeams();
			//Test cases
			
			Employee a = new Player("Robert", "1192", 500, 1, 10, 10, 8, 1);
			Employee a1 = new Player("Pedro", "1192", 500, 1, 15, 10, 8, 1);
			
			
			
			Employee a2 = new Coach("Robert", "1192", 500, 1, 10, 10, 8);
			Employee a3 = new Coach("Robert", "1192", 500, 1, 10, 10, 8);
			
			Employee a4 = new AssistantCoach("Robert", "1192", 500, 1, 10, true, 1);
			Employee a5 = new AssistantCoach("Robert", "1192", 500, 1, 10, true, 1);
			
			control.addEmployee(a);
			control.addEmployee(a1);
			control.addEmployee(a2);
			control.addEmployee(a3);
			control.addEmployee(a4);
			control.addEmployee(a5);
			
			menu();
		}
		
		/*
		 * This method is to start the menu
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the menu
		 */
		
		public void menu() {
			System.out.println("Welcome to the Club " + control.getName() + "\n");
			System.out.println("¿What operation would you like to do?");
			System.out.println("\t [1] Contract Employee");
			System.out.println("\t [2] Add place to club");
			System.out.println("\t [3] Show places");
			System.out.println("\t [4] Dissmiss Employee");
			System.out.println("\t [5] Add player to team");
			System.out.println("\t [6] Add coach to team");
			System.out.println("\t [7] Add assistant to team");
			System.out.println("\t [8] Show all information about club");
			System.out.println("\t [9] Show all information about team");
			System.out.println("\t [10] Show information about employee");
			System.out.println("\t [11] Add lineup to team");
			System.out.println("\t [12] Organize in DressingRoom");
			System.out.println("\t [13] Organize in Office");
			System.out.println("\t [14] Show DressingRoom");
			System.out.println("\t [15] Show Office");
			System.out.println("\t [16] Calculate market price and level as star");
			
			
			int option = entrie2.nextInt();
			
			option(option);
		}
		
		/*
		 * This method is to select the option
		 * @pre: Main != null;
		 * @param: A int option
		 * @return: void
		 * @post: option selected
		 */
		
		public void option(int option) {
			if(option == 1) {
				option1();
			}else if(option == 2) {
				option2();
			}else if(option == 3) {
				option3();
			}else if(option == 4) {
				option4();
			}else if(option == 5) {
				option5();
			}else if(option == 6) {
				option6();
			}else if(option == 7) {
				option7();
			}else if(option == 8) {
				option8();
			}else if(option == 9) {
				option9();
			}else if(option == 10) {
				option10();
			}else if(option == 11) {
				option11();
			}else if(option == 12) {
				option12();
			}else if(option == 13) {
				option13();
			}else if(option == 14) {
				option14();
			}else if(option == 15) {
				option15();
			}else if(option == 16) {
				option16();
			}else {
				System.out.println("Incorrect Entry");
				menu();
			}
		}
		
		/*
		 * This method is to start the option1
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option1
		 */
		
		public void option1() {
			System.out.println("What type of employee do you like contract: [1] Player [2] Coach, [3]AssistantCoach");
			int option = entrie2.nextInt();
			if(option == 1) {
				//new Employee(name, id, salary, state)
				System.out.println("What is the name of Employee");
				String name = entrie1.nextLine();
				System.out.println("What is the id of Employee");
				String id = entrie1.nextLine();
				System.out.println("What is the salary of the Employee");
				int salary = entrie2.nextInt();
				System.out.println("What is the state of the Employee: [0] INACTIVE [1]ACTIVE");
				int state = entrie2.nextInt();
				
			//, shirtNumber, goals, gradeAverage, position)
				
				System.out.println("What is the shirt number of player");
				int shirtN = entrie2.nextInt();
				System.out.println("What is the total goal of player");
				int goals = entrie2.nextInt();
				System.out.println("What is the grade average of player");
				int grade = entrie2.nextInt();
				System.out.println("What is the position of player: [0]GoalKeeper [1]Defender [2]Midfielder [3]Forward");
				int position = entrie2.nextInt();
				Employee temp = new Player(name, id, salary, state, shirtN, goals, grade, position);
				System.out.println(control.addEmployee(temp));
				menu();
				
			}else if(option == 2) {
				//new Coach(name, id, salary, state, yearExp, teamsNumber, championsChipW)
				System.out.println("What is the name of Employee");
				String name = entrie1.nextLine();
				System.out.println("What is the id of Employee");
				String id = entrie1.nextLine();
				System.out.println("What is the salary of the Employee");
				int salary = entrie2.nextInt();
				System.out.println("What is the state of the Employee: [0] INACTIVE [1]ACTIVE");
				int state = entrie2.nextInt();
				
				System.out.println("What is the experience in years of coach");
				int year = entrie2.nextInt();
				System.out.println("What is the number of teams");
				int teams = entrie2.nextInt();
				System.out.println("What is the number of championschip that won");
				int champ = entrie2.nextInt();
				
				Employee temp = new Coach(name, id, salary, state, year, teams,champ);
				System.out.println(control.addEmployee(temp));
				menu();
				
			}else if(option == 3) {
				System.out.println("What is the name of Employee");
				String name = entrie1.nextLine();
				System.out.println("What is the id of Employee");
				String id = entrie1.nextLine();
				System.out.println("What is the salary of the Employee");
				int salary = entrie2.nextInt();
				System.out.println("What is the state of the Employee: [0] INACTIVE [1]ACTIVE");
				int state = entrie2.nextInt();
				
				//new AssistantCoach(name, id, salary, state, yearExp, WasPlayer, expert)
				System.out.println("What is the experience in years of coach");
				int year = entrie2.nextInt();
				System.out.println("Was a player? [1] Yes [0] No");
				int was = entrie2.nextInt();
				boolean as = false;
				if(was == 1) {
					as = true;
				}else {
					as = false;
				}
				
				System.out.println("Is expert in: [0] Offensive [1] Deffensive [2]Posession [3]LABPLAY");
				int expert = entrie2.nextInt();
				
				Employee temp = new AssistantCoach(name, id, salary, state, year, as, expert);
				System.out.println(control.addEmployee(temp));
				menu();
				
			}else {
				System.out.println("Incorrect option");
				option1();
			}
		}
		
		/*
		 * This method is to start the option2
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option2
		 */
		
		public void option2() {
			System.out.println("What is the type of place do you like add: [0] DressingRoom [1]Office");
			int option = entrie2.nextInt();
			if(option == 0) {
				Place place = new DressingRoom(a);
				System.out.println(control.addPlace(place));
				a++;
				menu();
			}else if(option == 1) {
				Place place = new Office();
				System.out.println(control.addPlace(place));
				menu();
			}else {
				System.out.println("Incorrect option");
				option2();
			}
		}
		
		/*
		 * This method is to start the option3
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option3
		 */
		
		public void option3() {
			System.out.println(control.placesInfo());
			menu();
		}
		
		/*
		 * This method is to start the option4
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option4
		 */
		
		public void option4() {
			System.out.println("What employee do you like dismiss: [1] Player, [2] Coach, [3] Assistant");
			int option = entrie2.nextInt();
			if(option == 1) {
				System.out.println("What person do you like dismiss:");
				System.out.println(control.infoPlayer(market));
				int option2 = entrie2.nextInt();
				control.dismissPlayer(control.searchPlayer(option2));
				System.out.println("Succesfull");
				menu();
				
			}else if(option == 2) {
				System.out.println("What person do you like dismiss:");
				System.out.println(control.infoCoach(market));
				int option2 = entrie2.nextInt();
				control.dismissCoach(control.searchCoach(option2));
				System.out.println("Succesfull");
				menu();
				
			}else if(option == 3) {
				System.out.println("What person do you like dismiss:");
				System.out.println(control.infoacoachC());
				int option2 = entrie2.nextInt();
				control.dismissaCoach(control.searchaCoach(option2));
				System.out.println("Succesfull");
				menu();
			}else {
				System.out.println("Select correct option");
				option4();
			}
		}
		
		/*
		 * This method is to start the option5
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option5
		 */
		
		public void option5() {
			System.out.println("Select team that would you like to add a player: [1] TeamA [2]TeamB");
			int option = entrie2.nextInt();
			System.out.println("Select the player that do you like to add a team");
			System.out.println(control.infoPlayer(market));
			int option2 = entrie2.nextInt();
			
			Player temp = control.searchPlayer(option2);
			
			System.out.println(control.addPlayerToTeam(option, temp));
			menu();
		}
		
		/*
		 * This method is to start the option6
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option6
		 */
		
		public void option6() {
			System.out.println("Select team that would you like to add a coach: [1] TeamA [2]TeamB");
			int option = entrie2.nextInt();
			System.out.println("Select the coach that do you like to add a team");
			System.out.println(control.infoCoach(market));
			int option2 = entrie2.nextInt();
			
			Coach temp = control.searchCoach(option2);
			
			System.out.println(control.addCoachtoTeam(option, temp));
			menu();
		}
		
		/*
		 * This method is to start the option7
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option7
		 */
		
		public void option7() {
			System.out.println("Select team that would you like to add a assistant coach: [1] TeamA [2]TeamB");
			int option = entrie2.nextInt();
			System.out.println("Select the assistant coach that do you like to add a team");
			System.out.println(control.infoacoachC());
			int option2 = entrie2.nextInt();
			
			AssistantCoach temp = control.searchaCoach(option2);
			
			System.out.println(control.addAssistantCToTeam(option, temp));
			menu();
		}
		
		/*
		 * This method is to start the option8
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option8
		 */
		
		public void option8() {
			System.out.println(control.allInformation2(market));
			menu();
			
		}
		
		/*
		 * This method is to start the option9
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option9
		 */
		
		public void option9() {
			System.out.println("What team do you like know information: [1] TeamA [2] TeamB");
			int option = entrie2.nextInt();
			if(option == 1) {
				System.out.println(control.getTeamA().toString());
				menu();
			}else if(option == 2) {
				System.out.println(control.getTeamB().toString());
				menu();
			}else {
				System.out.println("Select a correct option");
			option9();
			}
		}
		
		/*
		 * This method is to start the option10
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option10
		 */
		
		public void option10() {
			System.out.println(control.allInformation(market));
			menu();
		}
		
		/*
		 * This method is to start the option11
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option11
		 */
		
		public void option11() {
			System.out.println("Select team that would you like to add a lineup: [1] TeamA [2]TeamB");
			int option = entrie2.nextInt();
			if(option == 1) {
				//new Lineup(date, tactique, lineup)
				System.out.print("What is the date?");
				String date = entrie1.nextLine();
				
				System.out.println("What is the tactique: [0]POSSESION [1]COUNTERATTACK [2]HIGH_PLEASSURE [3]DEFAULT");
				int tactique = entrie2.nextInt();
				
				System.out.println("Build your lineup");
				System.out.println("Put numbers 1 when you like a player, you only have 10 times");
				int[][] matrix = new int [10][7];
				System.out.println(matrixprint(matrix));
				for(int i = 0; i < 10; i++) {
					System.out.println(i+1 + " Player");
					System.out.println("Row: ");
					int fila = entrie2.nextInt();
					System.out.println("Column: ");
					int col = entrie2.nextInt();
					matrixfill1(matrix, fila, col);
				}
				System.out.println("This is your matrix");
				System.out.println(matrixprint(matrix));
				
				Lineup temp = new Lineup(date, tactique, matrix);
				
				System.out.println("Your lineup are: " + temp.readMatrix());
				
				control.addLineuptoTeam(option, temp);
				menu();
			}else if(option == 2) {
				System.out.print("What is the date?");
				String date = entrie1.nextLine();
				
				System.out.println("What is the tactique: [0]POSSESION [1]COUNTERATTACK [2]HIGH_PLEASSURE [3]DEFAULT");
				int tactique = entrie2.nextInt();
				
				System.out.println("Build your lineup");
				System.out.println("Put numbers 1 when you like a player, you only have 10 times");
				int[][] matrix = new int [10][7];
				System.out.println(matrixprint(matrix));
				for(int i = 0; i < 10; i++) {
					System.out.println(i+1 + " Player");
					System.out.println("Row: ");
					int fila = entrie2.nextInt();
					System.out.println("Column: ");
					int col = entrie2.nextInt();
					matrixfill1(matrix, fila, col);
				}
				System.out.println("This is your matrix");
				System.out.println(matrixprint(matrix));
				
				Lineup temp = new Lineup(date, tactique, matrix);
				
				System.out.println("Your lineup are: " + temp.readMatrix());
				
				control.addLineuptoTeam(option, temp);
				menu();
			}else {
				System.out.println("Select the correct option");
				option11();
			}
			
			
		}
		
		/*
		 * This method is to start the option12
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option12
		 */
		
		public void option12() {
			boolean a = false;
			for (int i = 0; i < control.getPlaces().size(); i++) {
				if(control.getPlaces().get(i) instanceof DressingRoom && a == false) {
					DressingRoom temp = (DressingRoom) control.getPlaces().get(i);
					temp.setOwner(control.getTeamA().getName());
					a = true;
					System.out.println(control.fillDRoom(temp, control.getTeamA()));
				}else if(control.getPlaces().get(i) instanceof DressingRoom && a == true) {
					DressingRoom temp = (DressingRoom) control.getPlaces().get(i);
					temp.setOwner(control.getTeamB().getName());
					System.out.println(control.fillDRoom(temp, control.getTeamB()));
				}
			}
			System.out.println("Succesfull");
			menu();
			
			
			
		}
		
		/*
		 * This method is to start the option13
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option13
		 */
		
		public void option13() {
			for (int i = 0; i < control.getPlaces().size(); i++) {
				if(control.getPlaces().get(i) instanceof Office) {
					Office temp = (Office) control.getPlaces().get(i);
					System.out.println(control.fillOffice(temp));
					}
			}
			System.out.println("Succesfull");
			menu();
			
		}
		
		/*
		 * This method is to start the option14
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option14
		 */
		public void option14() {
			String msg = "";
			for (int i = 0; i < control.getPlaces().size(); i++) {
				if(control.getPlaces().get(i) instanceof DressingRoom) {
					DressingRoom dr = (DressingRoom) control.getPlaces().get(i);
					msg += "DressingRoom " + "[7]" + "[" + dr.getLengtha() + "]" + "\n";
					msg += dr.toString();
				}
			}
			System.out.println(msg);
			menu();
		}
		
		/*
		 * This method is to start the option15
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option15
		 */
		
		public void option15() {
			String msg = "";
			for (int i = 0; i < control.getPlaces().size(); i++) {
				if(control.getPlaces().get(i) instanceof Office) {
					Office dr = (Office) control.getPlaces().get(i);
					msg += "Office " + "[6]" + "[6]" + "\n";
					msg += dr.toString();
				}
			}
			System.out.println(msg);
			menu();
		}
		
		/*
		 * This method is to start the option16
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: start the the option16
		 */
		
		public void option16() {
			System.out.println("Update all market price and level as star");
			this.market = true;
			menu();
		}
		
		/*
		 * This method is to print a matrix
		 * @pre: Main != null;
		 * @param: matrix int[][]
		 * @return: String
		 * @post: print the matrix
		 */
		
		public String matrixprint(int[][] matrix) {
			String msg = "";
			for (int i = 0; i < matrix.length; i++) {
				msg += "\n";
				for (int j = 0; j < matrix[i].length; j++) {
					msg += "[" + matrix[i][j] + "]";
				}
			}
			return msg;
		}
		
		/*
		 * This method is to fill the matrix with 1
		 * @pre: Main != null;
		 * @param: matrix int[][], int i, int j
		 * @return: void
		 * @post: fill the matrix with 1
		 */
		
		public void matrixfill1(int[][] matrix, int i, int j){
			if(matrix[i][j] == 0) {
				matrix[i][j] = 1;
			}
		}

}
