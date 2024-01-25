package Codsoft;
import java.util.Scanner;

	class UserAccount { // class for represent a user's bank account
		private double balance;
	
		public UserAccount(double Balance) { // using Constructor 
			this.balance = Balance; // balance with the given initial balance
		}
		public double getBalance() {// this method returns current balance of account
			return balance;
		}
		public void deposit (double amount) { // this method accepts user input for Deposit Amount of the user account
			
			if (amount > 0) {
				balance += amount;
				
				//Prints a success message with the new balance or an error message
				System.out.println("Deposit Successful. New Balance is : " +balance);
			} else {
				System.out.println("Invalid amount.");
			}
		}
		
		public void Withdraw (double amount) { // this method accepts user input for Withdrawal Amount of the user account
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				
				//Prints a success message with the new balance or an error message
				System.out.println("Withdraw Successful. New Balance is : " +balance);
			} else {
				System.out.println("Invalid amount.");
			}
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	class ATM {
		private UserAccount account;
		private Scanner scanner;
		
		public ATM(UserAccount account) { // using Constructor ATM with a UserAccount and scanner for input
			this.account = account;
			this.scanner = new Scanner(System.in);
		}
		public void Display() { // Prints the menu option 
			
			System.out.println("1.Check Balance : ");
			System.out.println("2.Deposit : ");
			System.out.println("3.Withdraw : ");
			System.out.println("4.Exit. ");
		}
		
		public void run() { 
			// run method prints menu, take input from user and performs actions from given options until user chooses to exit option
			
			int option;// to store the user's option in menu option
			
			// do-while loop
			do {
				Display();
				System.out.println("Enter your Option : ");
				option = scanner.nextInt();
				switch (option) { // switch statement 
				case 1 : 
					checkBalance();
					break;
				case 2 : 
					deposit();
					break;
				case 3 : 
					withdraw();
					break;
				case 4: 
					System.out.println("Thank you");
					break;
					default:
					System.out.println("Invalid Option. Choese Correct Option. ");
				}
			} while (option != 4); //this condition checks if the user's choice is not equal to 4,then loop will exit. 
								  
		}
		private void checkBalance() {
			System.out.println("Current Balance : "+account.getBalance());
		}
		private void deposit() {
			System.out.println("Enter Deposit amount : ");
			double amount = scanner.nextDouble();
			account.deposit(amount);
		}
		private void withdraw() {
			System.out.println("Enter Withdraw amount : ");
			double amount = scanner.nextDouble();
			account.Withdraw(amount);
		}
			
	}
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		


public class InterfaceAtm { // main class to run the ATM interface simulation

	public static void main(String[] args) {
		System.out.println("Welcome to the ATM ! "); // print a welcome message 
		Scanner sc = new Scanner (System.in);
				 
		 UserAccount BankAccount = new UserAccount(1000.0); // Initial Balance
		 ATM atm = new ATM(BankAccount);
		 atm.run(); // it is method of the ATM class to start the ATM simulation
		 sc.close(); 
	}

}
