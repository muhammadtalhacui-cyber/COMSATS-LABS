import java.util.*;
public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ticket of each class that sold :");
        System.out.println("Enter class-A ticket:");
        double classA = sc.nextDouble();
        double classAIncome = classA*20;

        System.out.println("Enter class-B ticket:");
        double classB = sc.nextDouble();
        double classBIncome = classB*15;

        
        System.out.println("Enter class-C ticket:");
        double classC= sc.nextDouble();
        double classCIncome = classC*10;

        
        System.out.println("Enter class-D ticket:");
        double classD = sc.nextDouble();
        double classDIncome = classD*5;


        double Total_Income = classAIncome+classBIncome+classCIncome+classDIncome;

        // Output results

        System.out.println("Total income is : "+Total_Income);
        System.out.println("Class A income is : "+classAIncome);
        System.out.println("Class B income is : "+classBIncome);
        System.out.println("Class C income is : "+classCIncome);
        System.out.println("Class D income is : "+classDIncome);


        



    }
}