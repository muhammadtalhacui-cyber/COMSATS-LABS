public class RandomCordinatOfRec {

    public static void main(String[] args) {
        
        // 1. Calculate random X coordinate
        int x = (int)((Math.random() * 100) - 50);

        // 2. Calculate random Y coordinate
        int y = (int)((Math.random() * 200) - 100);

        // 3. Display the result
    System.out.println("Random coordinate in the rectangle: " + x+ " " + y);
    }
}

  