import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {

		ActionListener a = null;
		Board b = new Board();
		Search s = new Search(b);
		char[][] c = b.getChars();
		s.searchPossibleWords(c);
		Time t = new Time(a);

		System.out.println(b);
		System.out.println();
		System.out.println("Tempo rimanente: " + t);

		System.out.println();
		System.out.println(System.currentTimeMillis());
	}
}