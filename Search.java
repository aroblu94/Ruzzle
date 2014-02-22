import java.lang.*;
import java.io.*;
import java.util.*;

	/*
	 * Target: - create a NavigableSet<String> dizionario
	 * 			 and fill it with words read from a source file
	 *		   - create an engine that finds all the possible
	 *			 words can be created using the 16 chars from the board
	 *			 comparing them with the ones saved in "dizionario"
	 *			 and save them in a vector (trovate)
	 */

public class Search {

	//CAMPI
	private ArrayList<String> allPossibleWords;
	private Board board;
	private Vector<String> trovate;
	private Dictionary dizionario;

	//COSTRUTTORE
	public Search(Board b, Dictionary d) {
		board = b;
		dizionario = d;
		trovate = new Vector<String>();
	}

	//METODI

	/*public Vector<String> searchPossibleWords(Letter[][] m) {
		if (m == null) {
            throw new NullPointerException("La matrice non può essere vuota ");
        }
        trovate = new Vector<String>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                //solve(m, i, j, m[i][j].get() + "");
                dfs(board.getLetters()[i][j], "");
            }
        }
        return trovate;
    }

    private void dfs(Letter l, String currentWord) {
	    String currentLetter = l.toString();
	    String word = "";
	    word = word + currentLetter;
	    if (dizionario.get().contains(word)) {
            boolean presente = false;
        	   	for (String p : trovate) {
            		if(p.equals(word)) {
                    	presente = true;
                   		break;
             		}
            		else
           				presente = false;
                    if(!presente)
                    	trovate.addElement(word);
                }
        }
	    l.visited = true;
	    Iterable<Letter> neighbors = l.getNeighbors();
	    for (Letter x : neighbors) {
	 	    if (x.isVisited() != true){
	    	    dfs(x, currentWord);
	    	}     
	    }
	    l.visited = false;
	}

	/*public void solve(Letter[][] m, int i, int j, String s) {
		// Iterate through the neighbours of the tile (i, j)
        for (int i1 = Math.max(0, i - 1); i1 < Math.min(m.length, i + 2); i1++) {
            for (int j1 = Math.max(0, j - 1); j1 < Math.min(m[0].length, j + 2); j1++) {
                if (i1 != i || j1 != j) {
                    String word = s + m[i1][j1].get();

                    if (dizionario.get().contains(word)) {
                    	boolean presente = false;
                    	for (String p : trovate) {
                    		if(p.equals(word)) {
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
    }*/


    public ArrayList<String> searchAllPossibleWords() {	
    	allPossibleWords = new ArrayList<String>();
		for (Letter l : board.getLetters()) {       
		    dfs(l, "");
		}
		return allPossibleWords;
	}
	

	private void dfs(Letter l, String currentWord) {
	    String currentLetter = l.toString();
	    currentWord = currentWord + currentLetter;
	    allPossibleWords.add(currentWord);
	    l.visited = true;
	    Iterable<Letter> letters = l.getNeighbors();
	    for (Letter x : letters) {
	        if (x.isVisited() != true) {
	        	dfs(x,currentWord);
	        }     
	    }
	    l.visited = false;
	}
	
	/*public void printWords(){
		for (String word : allWords){
			System.out.println(word);
		}
			
	}*/

	public Vector<String> trovate() {
		for(String s : dizionario.get()) {
			for(String t : allPossibleWords) {
				if(s.equals(t))
					trovate.addElement(t);
			}
		}
		return trovate;
	}

	/*public boolean founded(String in) {
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
	}*/

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