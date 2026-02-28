import java.util.Scanner;

public class twoRectangles {
     public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.print("Enter r1 x, y, width, height: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), w1 = input.nextDouble(), h1 = input.nextDouble();

        System.out.print("Enter r2 x, y, width, height: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble(), w2 = input.nextDouble(), h2 = input.nextDouble();

        // Manual absolute value: if negative, flip the sign
        double xDiff = (x1 - x2 < 0) ? -(x1 - x2) : (x1 - x2);
        double yDiff = (y1 - y2 < 0) ? -(y1 - y2) : (y1 - y2);

        if ((xDiff + w2/2 <= w1/2) && (yDiff + h2/2 <= h1/2)) {
            System.out.println("r2 is inside r1");
        } 
        else if ((xDiff <= (w1 + w2)/2) && (yDiff <= (h1 + h2)/2)) {
            System.out.println("r2 overlaps r1");
        } 
        else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
