import java.lang.*;
import java.util.*;

/*
 * This is only a test class...
 */

public class Test {
	public static void main(String[] args) {

		Board board = new Board();
		Dictionary dic = new Dictionary();
		Search search = new Search(board, dic);

		search.searchAllPossibleWords();

		System.out.println(board);
		System.out.println();

		System.out.println("Numero parole nel dizionario: " + dic.get().size());
		System.out.println();

		System.out.println("Numero di tutte le parole possibili: " + search.searchAllPossibleWords().size());
		System.out.println();

		//System.out.println("Tutte le parole possibili: " + search.searchAllPossibleWords());
		//System.out.println();

		System.out.println("Numero parole possibili: " + search.getPossibleWords().size());
		System.out.println();

		System.out.println("Parole possibili: \n" + search.possibleWords());
		System.out.println();
	}
}