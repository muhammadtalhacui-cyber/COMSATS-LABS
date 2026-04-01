public class task6 {
    public static void main(String[] args) {
        
        int  dice1=0;
        int  dice2=0;
        int count =0;
      


        while ((dice1+dice2)!=2) {

             dice1 = (int)(Math.random() * 7);
             dice2 = (int)(Math.random() * 7);
             count++;
            
        }
        // output result

        System.out.println("The pair of dices roll :"+(count-1)+" times before the snake eyes.");




    }
}
