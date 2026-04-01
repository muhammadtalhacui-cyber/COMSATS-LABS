import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // intilize varibles

        int countPositive=0;
        int countNegative=0;
        int sum=0;
        double avg=0;

        // Loop for input from user
             System.out.println("Enter ten numbers :");
             for(int i=0; i<10; i++){

                 int num = sc.nextInt();
                 sum +=num;
                 if (num>0) {
                     countPositive++;
                 }
                 else if(num<0)
                     countNegative++;
             }

                 avg = (double)sum/(countPositive+countNegative);  // Calculate Average

        // OUtput results
        System.out.println("Positive Numbers = "+countPositive);
        System.out.println("Negative Numbers = "+countNegative);
        System.out.println("Average of number is = "+avg);
    }
}