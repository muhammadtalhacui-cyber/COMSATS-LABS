import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        

        // a) minimum of 2 numbers
        int a = 5;
        int b = 3;
        int min = (a < b) ? a : b;
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);  
        
        // sign function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();
        int sign = (x > 0) ? 1 : (x < 0) ? -1 : 0;
        System.out.println("Sign of " + x + " is: " + sign);
        
        // b) maximum of 3 numbers
        int c = 7;
        int minOfThree = (a < b && a < c) ? a : (b < c) ? b : c;
        System.out.println("minimum of three number = " + a + ", " + b + ", and " + c + " is: " + minOfThree);








        

    }
}