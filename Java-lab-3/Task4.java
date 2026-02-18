import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes :");
        int minutes = sc.nextInt();
        int hours = minutes/60;
        int minuts = minutes%60;
        System.out.println(hours+ ":"+minuts);
    }
    
}
