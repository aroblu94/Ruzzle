import java.util.*;
import java.lang.*;

	/*
	 * Target: create a 4*4 board
	 * and fill it with 16 chars randomly chosen.
	 */

public class Board {

	//CAMPI
	private Vector<String> lettere;
	private final int size = 16;
	private Random r = new Random();

	//COSTRUTTORE
	public Board() {
		lettere = new Vector<String>();
		for(int i = 0; i<size; i++) {
			char c = (char)(r.nextInt(26) + 'a');
			String s = Character.toString(c);
			lettere.addElement(s.toUpperCase());
		}
	}

	//METODI
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(0)+" | "+lettere.elementAt(1)+" | "+lettere.elementAt(2)+" | "+lettere.elementAt(3)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(4)+" | "+lettere.elementAt(5)+" | "+lettere.elementAt(6)+" | "+lettere.elementAt(7)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(8)+" | "+lettere.elementAt(9)+" | "+lettere.elementAt(10)+" | "+lettere.elementAt(11)+" |\n");
		sb.append("+---+---+---+---+\n");
		sb.append("| "+lettere.elementAt(12)+" | "+lettere.elementAt(13)+" | "+lettere.elementAt(14)+" | "+lettere.elementAt(15)+" |\n");
		sb.append("+---+---+---+---+\n");
		return sb.toString();
	}

	public Vector<String> getVector() {
		return lettere;
	}
}