import java.lang.*;

/*
 * This is only a test class...
 */

public class Test {
	public static void main(String[] args) {

		Search s = new Search();

		System.out.println(s.board());
		System.out.println();

		System.out.println("Numero parole nel dizionario: " + s.getDictionary().size());
		System.out.println();

		System.out.println("Numero parole possibili: " + s.getPossibleWords().size());
		System.out.println();

		System.out.println("Parone possibili: \n" + s.possibleWords());
		System.out.println();
	}
}