import javax.swing.Timer;
import java.awt.event.*;

    /*
     * Target: create a 3 mins timer
     * and print it into the terminal
     * (maybe doing a flush of the buffered line).
     * Actually I don't know how to do it,
     * so I started developing the other classes.
     *
     */
    
public class Time {

	//CAMPI
	private Timer timer;
    private int gameDuration = 60; // in seconds

    //COSTRUTTORE
    public Time(ActionListener a) {
    	timer = new Timer(1000,a);
    }

    //METODI
    public void run() {
    	for(int i = 1; i<=gameDuration; i++) {
    		System.out.println(timer);
    	}
    }

}