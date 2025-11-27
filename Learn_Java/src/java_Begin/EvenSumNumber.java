package java_Begin;
import java.util.*;

public class EvenSumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        String[] numbers = input.split(" ");
        for (String num : numbers) {
            if (!num.isEmpty()) { 
                int number = Integer.parseInt(num); 
                if (number % 2 == 0) {  
                    sum += number; 
                }
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}