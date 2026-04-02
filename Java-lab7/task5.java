import java.util.Scanner;

public class task5 {

    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = input.nextLine();

        System.out.println("Letters: " + countLetters(str));
    }
}