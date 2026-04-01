import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String s = input.nextLine();

        int firstH = s.indexOf('h');
        int lastH = s.lastIndexOf('h');

        String result = s.substring(0, firstH) + s.substring(lastH + 1);

        System.out.println("Correct Answer: " + result);
        
    }
}
