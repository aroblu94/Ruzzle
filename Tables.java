import java.util.*;
import java.lang.*;

public class Tables {

	//CAMPI
	private Letter a = new Letter('a');
	private Letter b = new Letter('b');
	private Letter c = new Letter('c');
	private Letter d = new Letter('d');
	private Letter e = new Letter('e');
	private Letter f = new Letter('f');
	private Letter g = new Letter('g');
	private Letter h = new Letter('h');
	private Letter i = new Letter('i');
	private Letter j = new Letter('j');
	private Letter k = new Letter('k');
	private Letter l = new Letter('l');
	private Letter m = new Letter('m');
	private Letter n = new Letter('n');
	private Letter o = new Letter('o');
	private Letter p = new Letter('p');
	private Letter q = new Letter('q');
	private Letter r = new Letter('r');
	private Letter s = new Letter('s');
	private Letter t = new Letter('t');
	private Letter u = new Letter('u');
	private Letter v = new Letter('v');
	private Letter w = new Letter('w');
	private Letter x = new Letter('x');
	private Letter y = new Letter('y');
	private Letter z = new Letter('z');
	private Letter[][] l1 = {{l, a, t, r,},
							{i, e, t, d,},
							{l, y, k, n,},
							{j, c, i, i,}};
	private Letter[][] l2 = {{r, i, e, j,},
							{u, r, a, d,},
							{e, k, e, e,},
							{r, c, a, a,}};
	private Letter[][] l3 = {{i, z, p, h,},
							{g, c, d, b,},
							{a, b, h, g,},
							{d, s, i, a,}};
	private Letter[][] l4 = {{m, u, n, k,},
							{p, n, o, a,},
							{i, s, t, s,},
							{k, i, b, h,}};
	private Letter[][] l5 = {{o, a, a, d,},
							{i, k, v, k,},
							{d, p, i, f,},
							{g, r, s, o,}};
	private Letter[][] l6 = {{t, l, i, s,},
							{t, s, a, s,},
							{k, t, v, i,},
							{j, e, y, e,}};
	private Board board;

	//COSTRUTTORE
	public Tables() {
		int n = (int)Math.round(Math.random()*5+1);
		switch(n) {
			case 1:
				board = new Board(l1);
				break;
			case 2:
				board = new Board(l2);
				break;
			case 3:
				board = new Board(l3);
				break;
			case 4:
				board = new Board(l4);
				break;
			case 5:
				board = new Board(l5);
				break;
			case 6:
				board = new Board(l6);
				break;
		}
	}

	//METODI
	public Board getBoard() {
		return board;
	}

	public Letter[][] getLetters() {
		return board.getLetters();
	}


}