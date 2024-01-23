package Codsoft; // used to organize related class and interface  
import java.util.Scanner; // for user input

public class GradeCalculator  { // define public class name

	public static void main(String[] args) { // starting of program
		Scanner sc = new Scanner(System.in); // for take input from user

		        // Input marks for each subject
		        System.out.print("Enter marks for First Subject  (out of 100): ");
		        double subject1 = sc.nextDouble(); // data type (double) declare variables

		        System.out.print("Enter marks for Secound Subject  (out of 100): ");
		        double subject2 = sc.nextDouble();

		        System.out.print("Enter marks for Third Subject  (out of 100): ");
		        double subject3 = sc.nextDouble();
		        
		        System.out.print("Enter marks for Fourth Subject  (out of 100): ");
		        double subject4 = sc.nextDouble();

		        // Calculate total marks
		        double totalMarks = subject1 + subject2 + subject3 + subject4; // Adding marks of all subject

		        // Calculate average percentage
		        double averagePercentage = totalMarks / 4; // Assuming 4 subjects

		        // data type (char) to store character
		        char grade = calculateGrade(averagePercentage);// Calls function for average percentage;assign grade based on average percentage


		        // Display results
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);

		        sc.close();
		    }

		    // Function to calculate grade based on percentage
		    private static char calculateGrade(double percentage) {
		        if (percentage >= 90) {
		            return 'A';
		        } else if (percentage >= 70) {
		            return 'B';
		        } else if (percentage >= 40) {
		            return 'C';
		        } else {
		            return 'F';
		        }
		    }
	}


