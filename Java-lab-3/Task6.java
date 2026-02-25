import java.util.*;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input hours worked per week & pay-rate per hour

        System.out.println("Enter number of hours you worked in week" );
        double hours = sc.nextDouble();
        System.out.println("Enter pay rate  per-hour "); 
        double pay_rate = sc.nextDouble();


        double Total_Income = hours*pay_rate*5;
        double Net_income = Total_Income *.86;
        double School_clothes = Net_income*.1;
        double School_supplies = Net_income *.01;
        double Saving_bonds = (Net_income-School_clothes-School_supplies)*.25;
        double additional_bonds = Saving_bonds*0.50;

       // Output results
        System.out.println("your income before taxes :"+Total_Income );
        System.out.println("your income after taxes :"+Net_income);
        System.out.println("money spend on School supplies :"+School_supplies);
        System.out.println("the money you spend on bonds :"+Saving_bonds);
        System.out.println("the money your parents spend on additional bonds :"+additional_bonds);
        System.out.println("your total income before taxes :"+Total_Income);

    }

    
}
