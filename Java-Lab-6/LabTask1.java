import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Average Earth radius constant
        final double RADIUS = 6371.01;


        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String line1 = input.nextLine().replace(",", " ");
        Scanner s1 = new Scanner(line1);
        double x1 = Math.toRadians(s1.nextDouble()); // Latitude
        double y1 = Math.toRadians(s1.nextDouble()); // Longitude

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String line2 = input.nextLine().replace(",", " ");
        Scanner s2 = new Scanner(line2);
        double x2 = Math.toRadians(s2.nextDouble()); // Latitude
        double y2 = Math.toRadians(s2.nextDouble()); // Longitude

        double distance = RADIUS * Math.acos(
            Math.sin(x1) * Math.sin(x2) + 
            Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        // Display results
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
