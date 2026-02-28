    import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Read the three edges from the user
        System.out.print("Enter three edges for a triangle: ");
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();

        // 2. Check if the input is valid using the Triangle Inequality Theorem
        boolean isValid = (e1 + e2 > e3) && (e1 + e3 > e2) && (e2 + e3 > e1);

        // 3. Display result or error message
        if ((e1 + e2 > e3) && (e1 + e3 > e2) && (e2 + e3 > e1)) {
            double perimeter = e1 + e2 + e3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("The input is invalid (the sides do not form a triangle).");
        }

    }
}

