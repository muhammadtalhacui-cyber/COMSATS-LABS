import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1; // We use 'long' because factorials get very large

        for (int i = 1; i <= n; i++) {
            fact *= i; // Same as: fact = fact * i
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
