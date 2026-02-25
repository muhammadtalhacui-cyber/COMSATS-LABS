import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int points;

        // 1. Get the number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        int booksPurchased = keyboard.nextInt();

        // 2. Determine points based on the bracket
        if (booksPurchased <= 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;
        } else if (booksPurchased == 3) {
            points = 30;
        } else { // This covers 4 or more books
            points = 60;
        }

        // 3. Display the result
        System.out.println("You earned " + points + " points this month!");   

}
}
