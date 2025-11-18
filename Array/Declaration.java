package Array;
public class Declaration {
    
    public static void main(String[] args) {
        
        // Method 1: Declare and initialize an array in a single line
        int[] numbers = {10, 20, 30, 40, 50};

        // Method 2: Declare an array and then initialize it
        String[] fruits;
        fruits = new String[]{"Apple", "Banana", "Cherry"};

        // Method 3: Declare an array with a specific size and then assign values
        double[] prices = new double[3];
        prices[0] = 19.99;
        prices[1] = 29.99;
        prices[2] = 39.99;

        // Print the arrays
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nPrices:");
        for (double price : prices) {
            System.out.println(price);
        }
    }
}