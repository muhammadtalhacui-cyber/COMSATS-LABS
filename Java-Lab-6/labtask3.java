import java.util.Scanner;

public class labtask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Part (a): Decimal to Hex ---
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalVal = input.nextInt();

        if (decimalVal >= 0 && decimalVal <= 9) {
            System.out.println("The hex value is " + decimalVal);
        } else if (decimalVal >= 10 && decimalVal <= 15) {
            // Convert 10-15 to A-F (ASCII 65 is 'A')
            char hex = (char)('A' + (decimalVal - 10));
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(decimalVal + " is an invalid input");
        }

        System.out.println(); // Spacing between parts

        // --- Part (b): Hex Digit to Binary ---
        System.out.print("Enter a hex digit: ");
        String hexInput = input.next().toUpperCase();
        
        if (hexInput.length() != 1) {
            System.out.println("Invalid input: Please enter a single hex digit.");
        } else {
            char ch = hexInput.charAt(0);
            
            // Check if input is a valid hex digit (0-9 or A-F)
            if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')) {
                int value;
                if (ch <= '9') {
                    value = ch - '0';
                } else {
                    value = ch - 'A' + 10;
                }

                // Convert to 4-bit binary representation
                String binary = "";
                int temp = value;
                for (int i = 0; i < 4; i++) {
                    binary = (temp % 2) + binary;
                    temp /= 2;
                }
                System.out.println("The binary value is " + binary);
            } else {
                System.out.println(ch + " is an invalid input");
            }
        }
        
        input.close();
    }
}
