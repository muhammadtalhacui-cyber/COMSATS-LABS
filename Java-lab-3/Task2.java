import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
        /*
        N students take K apples and distribute them among each other evenly. The remaining (the undivisible)
        part remains in the basket. How many apples will each single student get? How many apples will remain in the basket? 
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of students and number of apples and we distrebute this in students :");
        int N = input.nextInt();
        int k = input.nextInt();
        int distributeApples = k/N;
        int remaningApples = k%N;
        System.out.println("input"+"\t"+" Output");
        System.out.println(N+"  \t  "+distributeApples);
        System.out.println(k+"  \t  "+remaningApples);


        


    }
}
