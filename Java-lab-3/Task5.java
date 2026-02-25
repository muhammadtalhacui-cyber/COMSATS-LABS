import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total amount of milk produced in the morning in liters");
        double amountOfMilk = sc.nextDouble();

        // Rounded to nearest integer number of corton only
        
        int corton = (int)(amountOfMilk/3.78);
        double cost = amountOfMilk*0.38;
        double profit = corton*0.27;
        
        // Output Results

        System.out.println("Number of corton needed for milk is : "+corton);
        System.out.printf("cost of producing milk is :$%.2f%n",cost);
        System.out.printf( "profit of producing milk is :$%.2f%n",profit);

    }

}
