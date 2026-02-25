import java.util.Scanner;

public class task9 {
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Constants for coin values in cents
        final int PENNY_VALUE = 1;
        final int NICKEL_VALUE = 5;
        final int DIME_VALUE = 10;
        final int QUARTER_VALUE = 25;
        final int DOLLAR_GOAL = 100;

        System.out.println("--- The Change-Counting Game ---");
        System.out.println("Enter the correct number of coins to make exactly $1.00!");

        // 1. Get input 

        System.out.print("Enter number of pennies: ");
        int pennies = keyboard.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = keyboard.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = keyboard.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = keyboard.nextInt();

        int totalCents = (pennies * PENNY_VALUE) + 
                         (nickels * NICKEL_VALUE) + 
                         (dimes * DIME_VALUE) + 
                         (quarters * QUARTER_VALUE);

        // 3. Determine the output
        if (totalCents == DOLLAR_GOAL) {
            System.out.println("\nCongratulations! That's exactly $1.00. You win!");
        } else if (totalCents > DOLLAR_GOAL) {
            int overBy = totalCents - DOLLAR_GOAL;
            System.out.println("\nToo much! You were over by " + overBy + " cents.");
        } else {
            int underBy = DOLLAR_GOAL - totalCents;
            System.out.println("\nToo little! You were under by " + underBy + " cents.");
        }
}
}
