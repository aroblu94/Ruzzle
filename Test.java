import java.lang.*;

/*
 * This is only a test class...
 */

public class Test {
	public static void main(String[] args) {

		Dictionary dic = new Dictionary();
		//Tables t = new Tables();
		Board b = new Board();
		Search s = new Search(b, dic);
		char[][] c = b.getChars();
		Letter[][] l = b.getLetters();
		s.searchPossibleWords(l);

		System.out.println(s.board());
		System.out.println();

		System.out.println("Numero parole nel dizionario: " + dic.get().size());
		System.out.println();

		System.out.println("Numero parole possibili: " + s.getPossibleWords().size());
		System.out.println();

		System.out.println("Parole possibili: \n" + s.possibleWords());
		System.out.println();
	}
}