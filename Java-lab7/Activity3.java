public class Activity3 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before swap: " + num1 + ", " + num2);

        swap(num1, num2);

        System.out.println("After swap: " + num1 + ", " + num2);
    }

    public static void swap(int a, int b) {
        System.out.println("Inside method before swap: " + a + ", " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside method after swap: " + a + ", " + b);
    }
}