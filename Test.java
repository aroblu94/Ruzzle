import java.lang.*;

/*
 * This is only a test class...
 */

public class Test {
	public static void main(String[] args) {

		Board b = new Board();
		Search s = new Search(b);
		char[][] c = b.getChars();
		s.searchPossibleWords(c);

		System.out.println(s.board());
		System.out.println();

		System.out.println("Numero parole nel dizionario: " + s.getDictionary().size());
		System.out.println();

		System.out.println("Numero parole possibili: " + s.getPossibleWords().size());
		System.out.println();

		System.out.println("Parole possibili: \n" + s.possibleWords());
		System.out.println();
	}
}