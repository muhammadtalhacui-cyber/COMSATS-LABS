import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter length of rectangle 1: ");
        double length1 = sc.nextDouble();

        System.out.print("Enter width of rectangle 1: ");
        double width1 = sc.nextDouble();

       
        System.out.print("Enter length of rectangle 2: ");
        double length2 = sc.nextDouble();

        System.out.print("Enter width of rectangle 2: ");
        double width2 = sc.nextDouble();

       
        double area1 = length1 * width1;
        double area2 = length2 * width2;

       
        if (area1 > area2) {
            System.out.println("Rectangle 1 has greater area.");
        } 
        else if (area2 > area1) {
            System.out.println("Rectangle 2 has greater area.");
        } 
        else {
            System.out.println("Both rectangles have the same area.");
        }


    }
}