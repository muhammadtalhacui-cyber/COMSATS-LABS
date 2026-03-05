import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prev = sc.nextInt(); // Get the first number
        int count = 0;
        int current;

        // Loop until we hit 0
        while ((current = sc.nextInt()) != 0) {
            if (current > prev) {
                count++; // Increment if current is bigger than the previous
            }
            prev = current; // Move current to previous for the next check
        }

        System.out.println(count);
    }
}
