import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = n; // Start by assuming the first number is the biggest

        while (n != 0) {
            if (n > max) {
                max = n; // Update max if a bigger number is found
            }
            n = sc.nextInt();
        }

        System.out.println(max);
    }
}
