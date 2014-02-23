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

	public Vector<String> searchPossibleWords(char[][] m) {
		if (m == null) {
            throw new NullPointerException("La matrice non può essere vuota ");
        }
        trovate = new Vector<String>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                solve(m, i, j, m[i][j] + "");
            }
        }
        return trovate;
    }


	public void solve(char[][] m, int i, int j, String prefix) {
        assert m != null;
        assert trovate != null;

        for (int i1 = Math.max(0, i - 1); i1 < Math.min(m.length, i + 2); i1++) {
            for (int j1 = Math.max(0, j - 1); j1 < Math.min(m[0].length, j + 2); j1++) {
                if (i1 != i || j1 != j) {
                    String word = prefix + m[i1][j1];

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

                    if (dizionario.get().subSet(word, word + Character.MAX_VALUE).size() > 0) {
                        solve(m, i1, j1, word);
                    }
                }
            }
        } 
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