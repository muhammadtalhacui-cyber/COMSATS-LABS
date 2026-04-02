public class Activity1 {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;

        int result = max(i, j);

        System.out.println("Maximum of " + i + " and " + j + " is: " + result);
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}