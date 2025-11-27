package java_Begin;
import java.util.Scanner;

public class BankingProject {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double balance = 1000;
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("**************************");
			System.out.println("Welcome to Banking Project");
			System.out.println("**************************");
			System.out.println("Select any 1 option (1-4):");
			System.out.println("1.Show Balance");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.deposit");
			System.out.println("4.Exit");
			System.out.println("**************************");
			int input = scan.nextInt();
			switch (input) {
			case 1 -> showBalance(balance);
			case 2 -> balance -= withdrawAmount(balance);
			case 3 -> balance += deposit(balance);
			case 4 ->isRunning=false;
			default -> System.out.println("Invalid option!");
			}
		}
		System.out.println("Thank you! Please Visit Again..");
		scan.close();
	}
	static void showBalance(double balance) {
		System.out.printf("$%.2f\n",balance);
	}
	static double withdrawAmount(double balance) {
		double amount ;
		System.out.println("Enter the Amount:");
		amount = scan.nextDouble();
		if (amount<=0) {
			System.out.println("Amount should be above 0");
		}else if (amount>balance) {
			System.out.println("INSUFFICIENT FUNDS");
		}else {
			System.out.println("Amount Withdrawn Successfull");
		}
		return amount;
	}
	static double deposit(double balance) {
		double amount;
		System.out.println("Enter Amount to be deposited:");
		amount = scan.nextDouble();
		if (amount<=0) {
			System.out.println("Amount should be above 0");
		}else {
			System.out.println("Amount Deposited Successfull");
		}
		return amount;
	}
}