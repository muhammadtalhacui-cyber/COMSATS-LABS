import java.util.Scanner;

public class LabTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String s = input.nextLine();

        int firstH = s.indexOf('h');
        int lastH = s.lastIndexOf('h');

        if (firstH != -1 && lastH != -1 && firstH != lastH) {
            String start = s.substring(0, firstH + 1);
            
            String middle = s.substring(firstH + 1, lastH);
            String replacedMiddle = middle.replace("h", "H");
            
            String end = s.substring(lastH);

            System.out.println("Correct Answer: " + start + replacedMiddle + end);
        } else {
            System.out.println("Correct Answer: " + s);
        }
        
    }
}
