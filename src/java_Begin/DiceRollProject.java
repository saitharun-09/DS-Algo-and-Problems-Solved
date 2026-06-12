package java_Begin;
import java.util.Random;
import java.util.Scanner;

public class DiceRollProject {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		Random random = new Random();
		int dice;
		int totalDice=0;
		System.out.println("Dice Rolling Game");
		System.out.println("Enter the No of Dice to Roll");
		dice = scan.nextInt();
		if (dice>0) {
			for(int i = 0;i<dice;i++) {
				int roll = random.nextInt(1,7);
				ascii(roll);
				System.out.println("You rolled "+roll);
				totalDice += roll;
			}
		
		System.out.println("Sum of Total Dice = "+totalDice);
		}else {
			System.out.println("Please enter a positive Number!");
		}
	}
	static void ascii(int roll) {
		String die1 = """
 -------
|       |
|       |
|   ֎   |
|       |
|       |
 -------
				""";
		String die2 = """
 -------
|       |
| ֎     |
|       |
|     ֎ |
|       |
 -------
				""";
		String die3 = """
 -------
| ֎     |
|       |
|   ֎   |
|       |
|     ֎ |
 -------
				""";
		String die4 = """
 -------
|       |
| ֎   ֎ |
|       |
| ֎   ֎ |
|       |
 -------
				""";
		String die5 = """
 -------
| ֎   ֎ |
|       |
|   ֎   |
|       |
| ֎   ֎ |
 -------
				""";
		String die6 = """
 -------
| ֎   ֎ |
|       |
| ֎   ֎ |
|       |
| ֎   ֎ |
 -------
				""";
		switch(roll){
		case 1->    System.out.println(die1);
		case 2->	System.out.println(die2);
		case 3->	System.out.println(die3);
		case 4->	System.out.println(die4);
		case 5->	System.out.println(die5);
		case 6->	System.out.println(die6);
		}
	}
}
