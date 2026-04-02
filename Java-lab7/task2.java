import java.util.Scanner;

public class task2 {

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}