package model;

public class Lineup {
	
	/** The class Lineup 
	 * @author Jorge Santana
	 * @version 1.0
	 */
	
	//Attributes
	
	private String date;
	private int tactique;
	private String lineup;
	private int[][] matrix;
	
	//Constants
	
	public final int POSESSION = 0;
	public final int COUNTERATTACK = 1;
	public final int HIGH_PLEASSURE = 2;
	public final int DEFAULT = 3;
	
	//Relation
	
	//Constructor method
	
	/*
	 * This is a constructor method of Lineup
	 */
	
	
	public Lineup(String date, int tactique, int[][] matrix) {
		this.date = date;
		this.tactique = tactique;
		this.matrix = matrix;

	}
	
	//Getters and setters
	
	/*
	 * This method is to get Date
	 * @param: empty
	 * @return: String
	 * @post: get a Date
	 */

	public String getDate() {
		return date;
	}
	
	/*
	 * This method is to set Date
	 * @param: String date
	 * @return: void
	 * @post: set a Date
	 */

	public void setDate(String date) {
		this.date = date;
	}
	
	/*
	 * This method is to get Tactique
	 * @param: empty
	 * @return: int
	 * @post: get a tactique
	 */

	public int getTactique() {
		return tactique;
	}
	
	/*
	 * This method is to set Tactique
	 * @param: int tactique
	 * @return: void
	 * @post: set a tactique
	 */

	public void setTactique(int tactique) {
		this.tactique = tactique;
	}
	
	/*
	 * This method is to get lineup
	 * @param: empty
	 * @return: String
	 * @post: get a lineup
	 */

	public String getLineup() {
		return lineup;
	}
	
	/*
	 * This method is to set lineup
	 * @param: String lineup
	 * @return: void
	 * @post: set a lineup
	 */

	public void setLineup(String lineup) {
		this.lineup = lineup;
	}
	
	/*
	 * This method is to get matrix
	 * @param: empty
	 * @return: int[][]
	 * @post: get a matrix
	 */

	public int[][] getMatrix() {
		return matrix;
	}
	
	/*
	 * This method is to set matrix
	 * @param: int[][]
	 * @return: void
	 * @post: set a matrix
	 */

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	/*
	 * This method is to print Matrix
	 * @param: empty
	 * @return: String
	 * @post: print a matrix
	 */
	
	public String matrixprint() {
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
	 * This method is to read matrix
	 * @param: empty
	 * @return: String
	 * @post: read a matrix
	 */
	
	public String readMatrix() {
		int def = 0;
		int mid = 0;
		int fow = 0;
		String lineup = "";
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == 0 || i == 1 || i == 2 || i == 3) {
					if(matrix[i][j] == 1) {
						fow = fow + 1;
					}else {
						
					}
				}else if(i == 4 || i == 5 || i == 6) {
					if(matrix[i][j] == 1) {
						mid = mid + 1;
					}else {
						
					}
				}else if(i == 7 || i == 8) {
					if(matrix[i][j] == 1) {
						def = def + 1;
					}else {
						
					}
				}
			}
		}
		lineup = def + "-" + mid + "-" + fow;
		setLineup(lineup);
		return lineup;
	}
}
