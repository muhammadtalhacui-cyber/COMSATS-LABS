public class Activity4 {

    public static void main(String[] args) {
        System.out.println(max(3, 4));
        System.out.println(max(3.0, 5.4));
        System.out.println(max(3.0, 5.4, 10.14));
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }
}