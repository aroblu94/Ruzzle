    /*
     * Target: create a 3 mins timer
     * and print it into the terminal
     * (maybe doing a flush of the buffered line).
     * Actually I don't know how to do it,
     * so I started developing the other classes.
     *
     */

public class Time {
	public static void main(String[] args)throws Exception {
	System.out.println("");
	System.out.print("03:00");
	System.out.print("\r");
	for(int i=2; i>=0; i--)
		for(int j=59; j>=0; j--){
			Thread.sleep(1000);
			if(j>9)
			System.out.print("0"+i+":"+j);
			else
			System.out.print("0"+i+":0"+j);
			System.out.print("\r");
		}	
	}
}
