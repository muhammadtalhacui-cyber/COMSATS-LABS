import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- PART (a): ASCII Code to Character ---
        System.out.println("--- Part A: ASCII to Character ---");
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        char character = (char)code;
        System.out.println("The character for ASCII code " + code + " is " + character);

        System.out.println(); 

        System.out.println("--- Part B: Character to Unicode ---");
        System.out.print("Enter a character: ");
        
        String s = input.next();
        char ch = s.charAt(0);

        int unicode = (int)ch;
        System.out.println("The Unicode for the character " + ch + " is " + unicode);
        
    }
}
