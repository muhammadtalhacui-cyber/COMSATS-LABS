public class LabTask4 {
    public static void main(String[] args) {


        char randomLetter = (char)('A' + Math.random() * ('Z' - 'A' + 1));

        // Display the result
        System.out.println("The random uppercase letter is: " + randomLetter);
    }
}
