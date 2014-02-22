import java.util.*;
import java.lang.*;

	/*
	 * Target: create a 4*4 board
	 * and fill it with 16 chars randomly chosen.
	 */

public class Board {

	//CAMPI
	private Letter[][] letters;
	private Vector<Letter> items;


	//COSTRUTTORE
	public Board() {
		items = new Vector<Letter>();

		letters = new Letter[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				Letter l = new Letter();
				letters[i][j] = l;
				items.addElement(l);
			}
		}

		for (int i = 0; i < letters.length; i++) {
	      	for (int j = 0; j < letters[i].length; j++) {
	        	if (i > 0)
	        		letters[i][j].addNeighbor(letters[i-1][j]);
	        	if (i < letters.length-1)
	          		letters[i][j].addNeighbor(letters[i+1][j]);
	    	    if (j > 0)
	        		letters[i][j].addNeighbor(letters[i][j-1]);
	        	if (j < letters[i].length-1)
	        		letters[i][j].addNeighbor(letters[i][j+1]);
	      	}
	    }
	}

	//METODI
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+---+---+---+---+\n");
		sb.append("| "+letters[0][0].toStringU()+" | "+letters[0][1].toStringU()+" | "+letters[0][2].toStringU()+" | "+letters[0][3].toStringU()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+letters[1][0].toStringU()+" | "+letters[1][1].toStringU()+" | "+letters[1][2].toStringU()+" | "+letters[1][3].toStringU()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+letters[2][0].toStringU()+" | "+letters[2][1].toStringU()+" | "+letters[2][2].toStringU()+" | "+letters[2][3].toStringU()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+letters[3][0].toStringU()+" | "+letters[3][1].toStringU()+" | "+letters[3][2].toStringU()+" | "+letters[3][3].toStringU()+" |\n");
		sb.append("+---+---+---+---+\n");
		return sb.toString();
	}

	public Vector<Letter> getLetters() {
		return items;
	}

}