package Array;
public class Basic {
    
    public static void main(String[] args) {
        
        // Declare and initialize an array of integers
        int[] scores = {85, 90, 78, 92, 88};

        // Access and print each element in the array
        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }
    }
}