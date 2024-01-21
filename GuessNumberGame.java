package Codsoft;
import java.util.Scanner; // "Scanner"  for user input
import java.util.Random; 	// "Random" for generating random number

public class GuessNumberGame { // Defined Class Name here 

	public static void main(String[] args) { // here main method is used to execution of the program 
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// Sets the range for the guessing number (Between 1 to 100)
		int lowrange = 1;
		int highrange = 100;
		
		// Generates a random number within range (between 1 to 100) 
		 int randomNumber = random.nextInt(highrange - lowrange + 1 + lowrange);
		 	int UserGuess; // variable for user input
		 	int Attempts = 0 ; // variable for  count attempts
	
	
		 	System.out.println("Wlecome to Guess the Number Game ! ");// Display message for start Game
	
		 	System.out.println("Guess the Number between" +  lowrange  + "And" + highrange); //guess the number in given range
    
    
		 	// main loop start  i.e. do while 
    do {
    	System.out.println("Enter your Guess Number : ");
    	UserGuess = sc.nextInt();
    	
    	 Attempts ++ ; // increment number of attempt
    	
    // Check if the guess is correct or low or high 
    	 if (UserGuess == randomNumber) {
    		System.out.println("Congralutions ! You Guessed the Correct Number in" + Attempts + " Attempts.");
    	}
    	else if (UserGuess < randomNumber ) { 
    		System.out.println(" Too Low ! Try Again ");
    	} else {
    		   	System.out.println(" Too High ! Try Again ");
    	}
    }
    
    while (UserGuess != randomNumber ); // loop exit 
		  	
    sc.close(); // close scanner
    	}
    }
