import java.util.Scanner;

public class Hangman {

    // function to show hangman based on mistakes
    public static void draw(int m) {
        System.out.println("  -------");
        System.out.println("  |/    |");

        if (m >= 1) System.out.println("  |    (_)");
        else System.out.println("  |");

        if (m == 2) System.out.println("  |     |");
        else if (m == 3) System.out.println("  |    \\|");
        else if (m >= 4) System.out.println("  |    \\|/");

        if (m >= 2) System.out.println("  |     |");
        else System.out.println("  |");

        if (m == 5) System.out.println("  |    /");
        else if (m >= 6) System.out.println("  |    / \\");
        else System.out.println("  |");

        System.out.println("  |");
        System.out.println("____|____");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Player 1 input (hidden)
            System.out.print("Player 1, enter secret word: ");
            String word = sc.nextLine().toLowerCase();

            // clear screen (simple trick)
            for (int i = 0; i < 30; i++) System.out.println();

            int len = word.length();
            System.out.println("Word has " + len + " letters.");

            String guessed = "";
            int mistakes = 0;

            // game loop
            while (mistakes < 6) {

                // show current progress
                String show = "";
                boolean complete = true;

                for (int i = 0; i < len; i++) {
                    char ch = word.charAt(i);

                    if (guessed.indexOf(ch) >= 0) {
                        show += ch;
                    } else {
                        show += "_";
                        complete = false;
                    }
                }

                System.out.println("\nWord: " + show);
                System.out.println("Guessed: " + guessed);
                System.out.println("Remaining guesses: " + (6 - mistakes));

                draw(mistakes);

                if (complete) {
                    System.out.println("\nYou Win!! 🎉");
                    break;
                }

                // user input
                System.out.print("Enter a letter: ");
                String input = sc.nextLine().toLowerCase();

                // validation
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Enter only ONE letter (a-z).");
                    continue;
                }

                char guess = input.charAt(0);

                // already guessed
                if (guessed.indexOf(guess) >= 0) {
                    System.out.println("You already guessed this letter!");
                    continue;
                }

                guessed += guess;

                // check correct or not
                if (word.indexOf(guess) < 0) {
                    mistakes++;
                    System.out.println("Wrong guess!");
                } else {
                    System.out.println("Correct guess!");
                }
            }

            if (mistakes == 6) {
                draw(mistakes);
                System.out.println("\nYou Lose! Word was: " + word);
            }

            // play again
            System.out.print("\nPlay again? (yes/no): ");
            String again = sc.nextLine().toLowerCase();

            if (!again.equals("yes")) {
                System.out.println("Game Ended.");
                break;
            }
        }

    }
}