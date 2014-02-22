import java.lang.*;
import java.io.*;
import java.util.*;


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


	public Vector<String> trovate() {
		for(String s : dizionario.get()) {
			for(String t : allPossibleWords) {
				if(s.equals(t))
					trovate.addElement(t);
			}
		}
		return trovate;
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