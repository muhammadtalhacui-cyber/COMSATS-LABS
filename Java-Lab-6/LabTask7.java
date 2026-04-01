import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String s = input.next();
        
        int firstIndex = s.indexOf('f');
        int lastIndex = s.lastIndexOf('f');
        
        if (firstIndex != -1) {
            if (firstIndex == lastIndex) {
                System.out.println("Correct Answer: " + firstIndex);
            } 
            else {
                System.out.println("Correct Answer: " + firstIndex + " " + lastIndex);
            }
        }
        
    }
}
