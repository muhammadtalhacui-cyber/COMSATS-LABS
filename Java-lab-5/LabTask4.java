import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // Keep reading numbers until the user enters 0
        while (sc.nextInt() != 0) {
            count++;
        }

        System.out.println(count);
    }
}
