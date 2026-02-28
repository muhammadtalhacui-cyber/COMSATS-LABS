import java.util.Scanner;

public class costOfShipping {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // 1. Prompt user for weight
        System.out.print("Enter package weight in pounds: ");
        double weight = input.nextDouble();

        // 2. Calculate cost based on weight brackets
        double cost = 0;

        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
            
        } else if (weight > 0 && weight <= 1) {
            cost = 3.5;
        } else if (weight <= 3) {
            cost = 5.5;
        } else if (weight <= 10) {
            cost = 8.5;
        } else if (weight <= 20) {
            cost = 10.5;
        }

        // 3. Display the result
        if (weight > 0) {
            System.out.printf("The shipping cost is $%.2f%n", cost);
        } else {
            System.out.println("Invalid weight.");
        }
    }
}