import java.lang.*;
import java.io.*;
import java.util.*;

	/*
	 * Target: - create a Vector<String> dizionario
	 * 			 and fill it with words read from a source file
	 *		   - create an engine that finds all the possible
	 *			 words can be created using the 16 chars from the board
	 *			 comparing them with the ones saved in "dizionario"
	 *			 and save them in a vector (trovate)
	 *
	 * Actually it add elements to dizionario and dunno why...
	 *
	 */

public class Search {

	//CAMPI
	private File source;
	private Scanner in;
	private Scanner line;
	private Board board;
	private Vector<String> dizionario;
	private Vector<String> trovate;

	//COSTRUTTORE
	public Search() {
		board = new Board();
		try {
			source = new File("dizionario.txt");
			in = new Scanner(source);
			line = new Scanner(source);
			dizionario = new Vector<String>();
			trovate = new Vector<String>();
		}
		catch(FileNotFoundException e) {
			System.out.println("File dizionario.txt non trovato, arresto. ");
		}

	}

	//METODI
	public void createDictionary() {
		while(line.hasNextLine()) {
			String word = in.next();
			dizionario.addElement(word);
		}
	}

	public void searchPossibleWords() {
		String found = "";
		for(String s : dizionario) {
			int length = s.length();
			for(int i = 0; i<length; i++) {
				for (int j = 0; j<16; j++) {
					if(Character.toString(s.charAt(i))==board.getVector().elementAt(j))
						found = found + Character.toString(s.charAt(i));
				}
			}
		}
		trovate.addElement(found);
	}

	public boolean founded(String in) {
		boolean found = false;
		for(String s : trovate) {
			if(s.equals(in.toUpperCase())) {
				found = true;
				break;
			}
			else
				found = false;
		}
		return found;
	}

	public Vector<String> getDictionary() {
		return dizionario;
	}

	public Vector<String> getPossibleWords() {
		return trovate;
	}

	public Board board() {
		return board;
	}

	public String possibleWords() {
		StringBuilder sb = new StringBuilder();
		for(String s : trovate) {
			sb.append(s);
		}
		return sb.toString();
	}
}