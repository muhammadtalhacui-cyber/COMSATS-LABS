import java.util.Scanner;

public class task8 {
    
public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // 1. Get input from the user
        System.out.print("Enter a month (numeric form): ");
        int month = keyboard.nextInt();

        System.out.print("Enter a day: ");
        int day = keyboard.nextInt();

        System.out.print("Enter a two-digit year: ");
        int year = keyboard.nextInt();

        // 2. Perform the magic date logic
        if (month * day == year) {
            System.out.println("The date is magic!");
        } else {
            System.out.println("The date is not magic.");
        }

    }
}
