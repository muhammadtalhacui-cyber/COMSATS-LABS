import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String fullString = input.nextLine();
        
        int spaceIndex = fullString.indexOf(" ");
        
        String firstWord = fullString.substring(0, spaceIndex);
        
        String secondWord = fullString.substring(spaceIndex + 1);
        
        System.out.println("Correct Answer: " + secondWord + " " + firstWord);
        
    }
}
