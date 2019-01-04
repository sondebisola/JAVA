package practise;

//The unlabeled form skips to the end of the innermost l
//oop's body and evaluates the boolean expression that controls the loop. 
public class ContinueSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  String searchMe = "peter piper picked a " + "peck of pickled peppers";
	   int max = searchMe.length();
		  int numPs = 0;

		        for (int i = 0; i < max; i++) {
		            // interested only in p's
		            if (searchMe.charAt(i) != 'p')
		                continue;

		            // process p's
		            numPs++;
		        }
		        System.out.println("Found " + numPs + " p's in the string.");
	
	//A labeled continue statement skips the current 
//iteration of an outer loop marked with the given label. 
	}

}
