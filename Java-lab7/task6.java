import java.util.Scanner;

public class task6 {

    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        for (String w : words) {
            System.out.print(capitalize(w) + " ");
        }
    }
}