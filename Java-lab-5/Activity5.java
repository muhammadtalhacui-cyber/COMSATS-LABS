import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        int number, sum = 0, count;
        
        for (count = 0; count < 5; count++) {
            number = new Scanner(System.in).nextInt();
            sum += number;
        }
        
        System.out.println("sum is " + sum);
    }
}
