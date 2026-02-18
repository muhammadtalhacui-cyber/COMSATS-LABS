import java.util.*;
;public class Task1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount as a decimal number such as 11.56");
        double dollars = sc.nextDouble();
        long cents = Math.round(dollars * 100);
        double dollar = cents/100;
        int  remainder = (int)cents%100;
        double quarter = remainder/25;
        remainder = remainder%25;
        int dimes = remainder/10;
        remainder = remainder%10;
        int nickels = remainder/5;
        remainder = remainder%5;
        int  pennies = remainder;
        System.out.println(" dollars = "+dollar+"\n quarter = "+quarter+ "\n dimes  = "+dimes+"\n nickels = "+nickels+"\n pennies = "+pennies);
        


    }
    
}
