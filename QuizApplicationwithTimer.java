package Codsoft;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationwithTimer {
    private static int score = 0; //variable for score
    private static boolean quizRunning = false; // for current running QuizApplicationwithTimer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// import statement for user input

        System.out.println("Welcome to the Quiz Application!");

        // Set the timer for 30 seconds
        int timeLimitInSeconds = 30; // for limitation of time 
        Timer timer = new Timer(); // import statement for time 
        timer.schedule(new TimerTask() {
            public void run() { 
                endQuiz();
            }
        }, timeLimitInSeconds * 1000); 

        startQuiz(scanner); // this method is for start QuizApplicationwithTimer 

        
        scanner.close();// Close the scanner
    }

    private static void startQuiz(Scanner scanner) {
        quizRunning = true; // to run program continue i.e quizRunning = true 

        System.out.println("Choose a correct option of  the following questions :");

        // Question 1
        System.out.println("1. What company was originally called 'Cadabra'?");
        System.out.println("a) Amazon");
        System.out.println("b) Flipcart");
        System.out.println("c) Reliance");
        char answer1 = getUserAnswer(scanner); 
        if (answer1 == 'a') {
        	System.out.println("Correct !");
        	score++;
        }else {
        	System.out.println("Incorrect");
        }

        // Question 2
        System.out.println("2. Which planet is biggest Planet in our solar system?");
        System.out.println("a) Venus");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        char answer2 = getUserAnswer(scanner);
        if (answer2 == 'c') {
        	System.out.println("Correct !");
            score++;
         } else {
        	 System.out.println("Incorrect");
          }
        // Question 3
        System.out.println("3. Which planet is known as the Red Planet?");
        System.out.println("a) Neptune ");
        System.out.println("b) Mars");
        System.out.println("c) Earth");
        char answer3 = getUserAnswer(scanner);
        if (answer3 == 'b') {
        	System.out.println("Correct !");
            score++;
        }else {
        	System.out.println("Incorrect");
        }
        
        endQuiz(); // quizRunning = false / End the QuizApplicationwithTimer
        
    }

    private static char getUserAnswer(Scanner scanner) { 
        char answer;
        // do- while loop 
        do {
            System.out.print("Your answer: ");
            answer = scanner.next().charAt(0);
        } while (answer < 'a' || answer > 'c');
        return answer;
    }

    private static void endQuiz() {
        if (quizRunning) {
            quizRunning = false;
            System.out.println("\n Quiz ended !");
            System.out.println("\nYour final score : " + score + " Out of 3" );
            System.exit(0); 
        }
    }
}
