import java.util.*;
import java.lang.*;

	/*
	 * Target: create a 4*4 board
	 * and fill it with 16 chars randomly chosen.
	 */

public class Board {

	//CAMPI
	private final int size = 16;
	private Random r = new Random();

	private char[][] chars;


	//COSTRUTTORE
	public Board() {
		chars = new char[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				char c = (char)(r.nextInt(26) + 'a');
				chars[i][j] = c;
			}
		}
	}

	//METODI
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+---+---+---+---+\n");
		sb.append("| "+Character.toString(chars[0][0]).toUpperCase()+" | "+Character.toString(chars[0][1]).toUpperCase()+" | "+Character.toString(chars[0][2]).toUpperCase()+" | "+Character.toString(chars[0][3]).toUpperCase()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+Character.toString(chars[1][0]).toUpperCase()+" | "+Character.toString(chars[1][1]).toUpperCase()+" | "+Character.toString(chars[1][2]).toUpperCase()+" | "+Character.toString(chars[1][3]).toUpperCase()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+Character.toString(chars[2][0]).toUpperCase()+" | "+Character.toString(chars[2][1]).toUpperCase()+" | "+Character.toString(chars[2][2]).toUpperCase()+" | "+Character.toString(chars[2][3]).toUpperCase()+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+Character.toString(chars[3][0]).toUpperCase()+" | "+Character.toString(chars[3][1]).toUpperCase()+" | "+Character.toString(chars[3][2]).toUpperCase()+" | "+Character.toString(chars[3][3]).toUpperCase()+" |\n");
		sb.append("+---+---+---+---+\n");
		return sb.toString();
	}

	public char[][] getChars() {
		return chars;
	}
}