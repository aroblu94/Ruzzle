import java.util.*;
import java.lang.*;

	/*
	 * Target: create a 4*4 board
	 * and fill it with 16 chars randomly chosen.
	 */

public class Board {

	//CAMPI
	private Letter[][] letters;
	private char[][] chars;
	private int nome;


	//COSTRUTTORE
	public Board() {
		letters = new Letter[4][4];
		chars = new char[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				Letter l = new Letter();
				letters[i][j] = l;
				chars[i][j] = l.get();
			}
		}
	}

	/*public Board(Letter[][] lettere) {
		letters = lettere;
		chars = new char[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				chars[i][j] = lettere[i][j].get();
			}
		}
	}*/

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

	public char[][] getChars() {
		return chars;
	}

	public Letter[][] getLetters() {
		return letters;
	}
}