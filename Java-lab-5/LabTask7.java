import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n;

        // Read numbers until the user enters 0
        while ((n = sc.nextInt()) != 0) {
            if (n % 2 == 0) {
                count++; // Increment if the number is even
            }
        }
        
        System.out.println(count);
    }
}
