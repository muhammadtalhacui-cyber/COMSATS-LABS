import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Generate computer's choice: 0, 1, or 2
        int computer = (int)(Math.random() * 3);

        // 2. Prompt user for their choice
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        // 4. Determine the winner
        if (computer == user) {
            System.out.println("It is a draw.");
        } else if ((user == 0 && computer == 2) || 
                   (user == 1 && computer == 0) || 
                   (user == 2 && computer == 1)) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }

    }
}
