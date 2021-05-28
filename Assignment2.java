import java.util.Random; 
import java.util.Scanner;  // Import the Scanner class


public class Assignment1 {
	
	public static boolean inBounds(int upward_bound, int lower_bound, int guess) {
		
		if (guess > 100 || guess < 0) { //checks if guess is within range of 0-100 
			throw new ArithmeticException("Input not within range");
		}else {
			if(guess < upward_bound && guess > lower_bound) {    //checks if guess is within range of answer bounds 
				return true;
			}else {
				System.out.println("Keep Guessing");
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//User is asked to guess a number 1-100. (Program chooses randomly.)
		int answer = (int) Math.round(Math.random()*100);
		int upward_bound = answer + 10; //tracks bounds of a win +/- 10
		int lower_bound = answer - 10;	    
	    int attempts = 0;   //tracks the number of guesses in the game 
	    boolean win = false; 
	    while (attempts < 3) {
	    	System.out.println("Enter a number between 1-100");
		    int guess = Integer.parseInt(scanner.nextLine());  // Reads user input
		    
		    if(inBounds(upward_bound, lower_bound, guess)) {  //if guess is in bounds, inBounds() returns true 
		    	System.out.println("You Win!");
		    	win = true;
		    	break;
		    }
		    attempts += 1;
	    }
		if(win == false) {System.out.print("Sorry, ");} //will print if answer is not guessed, other wise will just print answer 
		System.out.println("Answer is: "+ answer);
		scanner.close();  // closes scanner 
	  }
	

}
