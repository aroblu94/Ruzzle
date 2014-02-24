import java.lang.*;
import java.io.*;
import java.util.*;

	/*
	 * Target:  create an engine that finds all the possible
	 *			words can be created using the 16 chars from the board
	 *			comparing them with the ones saved in "dizionario"
	 *			and save them in a vector (trovate)
	 *
	 * BUG:		engine doesn't keep track of the used letters
	 *			when building a word.	
	 *
	 */

public class Search {

	//CAMPI
	private Scanner in;
	private Board board;
	private Dictionary dizionario;
	private Vector<String> trovate;

	//COSTRUTTORE
	public Search(Board b, Dictionary d) {
		board = b;
		dizionario = d;
		trovate = new Vector<String>();
	}

	//METODI

	public Vector<String> searchPossibleWords(Letter[][] m) {
		trovate = new Vector<String>();
		//chosing the starting letter ...
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				m[i][j].visited(true); //once used becames "visited"
				solve(m, i, j, Character.toString(m[i][j].get()));
				for(int x = 0; x < 4; x++) { //once "solve" finishes all comes back to "unvisited"
					for(int y = 0; y < 4; y++) {
						m[x][y].visited(false); 
					}
				}
			}
		}
		return trovate;
	}


	public void solve(Letter[][] m, int i, int j, String prefix) {

		for (int i1 = Math.max(0, i - 1); i1 < Math.min(4, i + 2); i1++) {
			for (int j1 = Math.max(0, j - 1); j1 < Math.min(4, j + 2); j1++) {
				if ((i1 != i || j1 != j) && !(m[i1][j1].isVisited())) {
					String word = prefix + m[i1][j1].get();
					m[i1][j1].visited(true); //once used becames "visited"
					if (dizionario.get().contains(word)) {
						boolean presente = false;
						for (String s : trovate) {
							if(s.equals(word)) {
								presente = true;
								break;
							}
							else
								presente = false;
						}
						if(!presente)
							trovate.addElement(word);
					}

					if (dizionario.get().subSet(word, word + Character.MAX_VALUE).size() > 0)
						solve(m, i1, j1, word);
				}
			}
		} 
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
			sb.append(s + " ");
		}
		return sb.toString();
	}
}
