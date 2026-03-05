import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Read how many numbers are coming
        int count = 0;        // To store the number of zeros

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) {
                count++;      // Add 1 to count if the number is exactly 0
            }
        }

        System.out.println(count);
    }
}
