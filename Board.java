import java.util.*;
import java.lang.*;

	/*
	 * Target: create a 4*4 board
	 * and fill it with 16 chars randomly chosen.
	 */

public class Board {

	//CAMPI
	//private Vector<String> lettere;
	private final int size = 16;
	private Random r = new Random();

	private char[][] chars;


	//COSTRUTTORE
	public Board() {
		//lettere = new Vector<String>();
		chars = new char[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				char c = (char)(r.nextInt(26) + 'a');
			//String s = Character.toString(c);
			//lettere.addElement(s.toUpperCase());
				chars[i][j] = c;
			}
		}
	}

	//METODI
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+---+---+---+---+\n");
		sb.append("| "+chars[0][0]+" | "+chars[0][1]+" | "+chars[0][2]+" | "+chars[0][3]+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+chars[1][0]+" | "+chars[1][1]+" | "+chars[1][2]+" | "+chars[1][3]+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+chars[2][0]+" | "+chars[2][1]+" | "+chars[2][2]+" | "+chars[2][3]+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+chars[3][0]+" | "+chars[3][1]+" | "+chars[3][2]+" | "+chars[3][3]+" |\n");
		sb.append("+---+---+---+---+\n");
		/*sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(0)+" | "+lettere.elementAt(1)+" | "+lettere.elementAt(2)+" | "+lettere.elementAt(3)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(4)+" | "+lettere.elementAt(5)+" | "+lettere.elementAt(6)+" | "+lettere.elementAt(7)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(8)+" | "+lettere.elementAt(9)+" | "+lettere.elementAt(10)+" | "+lettere.elementAt(11)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(12)+" | "+lettere.elementAt(13)+" | "+lettere.elementAt(14)+" | "+lettere.elementAt(15)+" |\n");
		sb.append("+---+---+---+---+\n");*/
		return sb.toString();
	}

	public char[][] getChars() {
		return chars;
	}
}