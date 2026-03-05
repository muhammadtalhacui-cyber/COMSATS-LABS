import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Tasks A & B: Printing Numbers (Ascending/Descending) ---
        System.out.print("Enter two numbers (A and B): ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) System.out.print(i + " ");
        } else {
            for (int i = a; i >= b; i--) System.out.print(i + " ");
        }

        // --- Task C: Sum of N numbers ---
        System.out.print("\n\nHow many numbers do you want to sum? ");
        int n = input.nextInt();
        int totalSum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            totalSum += input.nextInt();
        }
        System.out.println("The total sum is: " + totalSum);

        // --- Task D: Sum of Cubes (1³ + 2³ + ... + N³) ---
        System.out.print("\nEnter a number N to find the sum of cubes: ");
        int limit = input.nextInt();
        int cubeSum = 0;

        for (int i = 1; i <= limit; i++) {
            cubeSum += (i * i * i);
        }
        System.out.println("The sum of cubes is: " + cubeSum);
    }
}
