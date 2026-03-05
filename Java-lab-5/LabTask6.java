import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1, maxIndex = 0, currentPos = 0;
        int n;

        while ((n = sc.nextInt()) != 0) {
            currentPos++;
            if (n > max) {
                max = n;
                maxIndex = currentPos;
            }
        }
        System.out.println(maxIndex);
    }
}
