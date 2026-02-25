import java.util.Scanner;

import javax.swing.plaf.DesktopIconUI;

public class Task3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter numbers of students in three classes seperatly");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int all = a+b+c;
    int DiskRequired = all/2;
    System.out.println("input"+"\t"+"Output");
    System.out.println(a+"\t"+DiskRequired);
    System.out.println(b+"\n"+c);


}        
    }
    

