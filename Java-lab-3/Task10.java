public class Task10 {
    public static void main(String[] args) {
        

        // display header

        System.out.printf("%-12s    %-12s   %-12s   %-12s   %-12s %n"
            ,"Degrees","radiand","sin","cos","tan"    );

         int degrees = 30;
         double radians = Math.toRadians(degrees);
         double sin = Math.sin(radians);
         double cos = Math.cos(radians);
         double tan = Math.tan(radians);

        //  display second first line
         System.out.printf("%-12.6s    %-12.6s   %-12.6s   %-12.6s   %-12.6s %n",degrees,radians,sin,cos,tan);


         degrees = 60;
         radians = Math.toRadians(degrees);
         sin = Math.sin(radians);
         cos = Math.cos(radians);
         tan = Math.tan(radians);

        //  display second line
        System.out.printf("%-12.6s    %-12.6s   %-12.6s   %-12.6s   %-12.6s %n",degrees,radians,sin,cos,tan);



    }
}
