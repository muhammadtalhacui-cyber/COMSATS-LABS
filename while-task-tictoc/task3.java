import java.util.Scanner;

public class task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students :");
        int students = sc.nextInt();

            int maxScore = 0;
            String winer = null;
        for(int i=0;i<students;i++){
            System.out.println("Enter name & score respectivly:");
            String name = sc.next();
            int score = sc.nextInt();
            if (score>maxScore) {
                maxScore  = score;
                winer =name;


            }
        }
            System.out.println(winer+ " has highest Score : "+maxScore);





    }



}