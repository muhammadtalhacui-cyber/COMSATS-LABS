import java.util.Scanner;

public class ticTacGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char again = 'y';

        while (again == 'y' || again == 'Y') {

            char b1='1', b2='2', b3='3';
            char b4='4', b5='5', b6='6';
            char b7='7', b8='8', b9='9';

            String p1, p2;

            System.out.println("Welcome to Tic Tac Toe");

            System.out.print("Enter Player1 name: ");
            p1 = sc.nextLine();

            System.out.print("Enter Player2 name: ");
            p2 = sc.nextLine();

            char turn = 'X';
            int moves = 0;
            boolean win = false;

            while (moves < 9 && !win) {

                System.out.println();
                System.out.println(b1+" | "+b2+" | "+b3);
                System.out.println("---------");
                System.out.println(b4+" | "+b5+" | "+b6);
                System.out.println("---------");
                System.out.println(b7+" | "+b8+" | "+b9);
                System.out.println();

                if(turn=='X')
                    System.out.print(p1 + " choose box: ");
                else
                    System.out.print(p2 + " choose box: ");

                int choice = sc.nextInt();

                if(choice==1 && b1=='1') b1=turn;
                else if(choice==2 && b2=='2') b2=turn;
                else if(choice==3 && b3=='3') b3=turn;
                else if(choice==4 && b4=='4') b4=turn;
                else if(choice==5 && b5=='5') b5=turn;
                else if(choice==6 && b6=='6') b6=turn;
                else if(choice==7 && b7=='7') b7=turn;
                else if(choice==8 && b8=='8') b8=turn;
                else if(choice==9 && b9=='9') b9=turn;
                else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }

                moves++;

                if((b1==b2 && b2==b3) ||
                   (b4==b5 && b5==b6) ||
                   (b7==b8 && b8==b9) ||
                   (b1==b4 && b4==b7) ||
                   (b2==b5 && b5==b8) ||
                   (b3==b6 && b6==b9) ||
                   (b1==b5 && b5==b9) ||
                   (b3==b5 && b5==b7))
                {
                    win = true;
                }

                if(turn=='X')
                    turn='O';
                else
                    turn='X';
            }

            System.out.println();
            System.out.println(b1+" | "+b2+" | "+b3);
            System.out.println("---------");
            System.out.println(b4+" | "+b5+" | "+b6);
            System.out.println("---------");
            System.out.println(b7+" | "+b8+" | "+b9);
            System.out.println();

            if(win) {
                if(turn=='O')
                    System.out.println(p1 + " wins!");
                else
                    System.out.println(p2 + " wins!");
            }
            else {
                System.out.println("Game Draw!");
            }

            System.out.print("Play again? (y/n): ");
            again = sc.next().charAt(0);
            sc.nextLine();
        }

        System.out.println("Thank you for playing!");
    }
}