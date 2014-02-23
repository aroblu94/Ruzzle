import java.util.*;
import java.lang.*;

public class Letter {

	//CAMPI
	private Random r = new Random();
	private char c;
	private Collection<Letter> neighbors = new ArrayList<Letter>();
	private boolean visited;

	//COSTRUTTORE
	public Letter() {
		c = (char)(r.nextInt(26) + 'a');
	}

	//METODI
	public String toStringU() {
		return Character.toString(c).toUpperCase();
	}

	public void visited(boolean b) {
		visited = b;
	}

	public boolean isVisited() {
		return visited;
	}

	public char get() {
		return c;
	}

	public String toString() {
		return Character.toString(c);
	}

	public Iterable<Letter> getNeighbors(){
	    return neighbors;
	}

	public void addNeighbor(Letter l) {
		neighbors.add(l);
	}

}