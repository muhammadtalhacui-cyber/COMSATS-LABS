public class Activity4 {
    public static void main(String[] args) {
        String s = "Welcome";
        
        System.out.println("s is: " + s);
        String s1 = " This is the time for the birthday party";
        System.out.println("s1 is: " + s1);
        System.out.print("The length of sentence is: ");
        System.out.println(s1.length());
        
        System.out.print("The character at index 10 in s1 is: ");
        System.out.println(s1.charAt(10));
        
        System.out.println("The index of first i in sentence is: " + s1.indexOf('i'));
        System.out.println("The index of first in in sentence is: " + s1.indexOf("in"));
        
        System.out.println("sentence.substring(0, 10) is " + s1.substring(0, 10));
        System.out.println("sentence.substring(10, 15) is " + s1.substring(10, 15));
        System.out.println("sentence.substring(10) is " + s1.substring(10));
        
        System.out.println("sentence.toLowerCase() is " + s1.toLowerCase());
        System.out.println("sentence.toUpperCase() is " + s1.toUpperCase());
        
        String s2 = "   Welcome   ";
        System.out.println("s2 is: " + s2);
        System.out.println("sentence.trim() in s2 is: " + s2.trim());
        
        System.out.println("sentence.replace('i', 'e') in s1 is: " + s1.replace('i', 'e'));
        System.out.println("sentence.replace(\"is\", \"was\") in s1 is: " + s1.replace("is", "was"));
    }
}
