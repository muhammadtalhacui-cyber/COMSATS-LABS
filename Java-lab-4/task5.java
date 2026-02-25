import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        

        // Equals numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = sc.nextInt(); 

            if (num1 == num2 && num2 == num3) {
            System.out.println(3);
         } else if ((num1==num2 && num1>num3) || (num1==num3 && num1>num2) || (num2==num3 && num2>num1)) {
                    System.out.println(2);
         } 
         else if ((num1==num2 && num1<num3) || (num1==num3 && num1<num2) || (num2==num3 && num2<num1))
               System.out.println(2);
         else {
                        System.out.println(0);
        }
    }
}

