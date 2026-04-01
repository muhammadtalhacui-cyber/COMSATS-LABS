public class task2 {
    public static void main(String[] args) {
        // Print the table header
        System.out.println("Kilograms   Pounds     |   Pounds      Kilograms");

        int p = 20; // 'p' is for the Pounds on the right side

        // k starts at 1, goes up to 199, jumps by 2
        for (int k = 1; k <= 199; k += 2) {
            if(k>3 && k<197 && p>25 && p<510){
                continue;
            }
            System.out.printf("%-11d %-10.1f |   %-11d %.2f\n", k, k * 2.2, p, p / 2.2);

            p += 5; // Increase the right-side pounds by 5
        }
    }
}
