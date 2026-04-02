import java.util.Scanner;

public class Activity6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter index: ");
        int n = input.nextInt();

        System.out.println("Fibonacci: " + fib(n));
    }

    public static long fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}