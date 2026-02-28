import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for head and 0 for tail :");
        int guess = sc.nextInt();
        
        //  random method

         int coin =(int) (Math.random()*2);
        
        //   final result 
        
         String result = (guess==coin)?"win":"lose";        
         System.out.println(result);




    }
}
