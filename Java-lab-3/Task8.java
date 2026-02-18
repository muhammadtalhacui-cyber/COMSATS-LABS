import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000 :");
        int num = sc.nextInt();

        int sum = 0;

        // Logic used

        sum = num%10;
        num = num/10;
        sum += num%10;
        num = num/10;
        sum += num;

        // Output Results

        System.out.println("The sum of the digits is : "+sum);







}
}