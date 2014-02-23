import java.util.*;
import java.lang.*;

public class Letter {

	//CAMPI
	private Random r = new Random();
	private char c;
	private boolean visited;

	//COSTRUTTORE
	/*public Letter(char c) {
		this.c = c; //(char)(r.nextInt(26) + 'a');
		visited = false;
	}*/

	public Letter() {
		c = (char)(r.nextInt(26) + 'a');
		visited = false;
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

}