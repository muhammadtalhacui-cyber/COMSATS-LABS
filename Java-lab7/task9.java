import java.util.Scanner;

public class task9 {

    public static double power(double a, int n) {
        if (n == 0)
            return 1;
        else
            return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double a = input.nextDouble();

        System.out.print("Enter exponent: ");
        int n = input.nextInt();

        System.out.println("Result: " + power(a, n));
    }
}