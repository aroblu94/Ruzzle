import java.lang.*;
import java.io.*;
import java.util.*;

	/*
	 * It could be possible to read existing words from
	 * the dictionary file on the current pc
	 * changing the File f to "/usr/share/dict/words".
	 *
	 */

public class Dictionary {

	//CAMPI
	private File f;
	private Scanner in;
	private NavigableSet<String> dizionario;

	//COSTRUTTORE
	public Dictionary() {
		dizionario = new TreeSet<String>();
		File f = new File("/usr/share/dict/italian");	
		try {
			in = new Scanner(f);
			while (in.hasNextLine()) {
				String word = in.nextLine();
                dizionario.add(word);	//creating dictionary...
			}	
		}
		catch(FileNotFoundException e) {
			System.out.println("File dizionario.txt non trovato, arresto. ");
		}
	}

	//METODI
	public NavigableSet<String> get() {
		return dizionario;
	}


}
