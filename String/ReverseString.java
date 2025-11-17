package String;

public class ReverseString {
    
    public static void main(String[] args) {
        
        String word = "Coding";

        StringBuilder sb = new StringBuilder(word).reverse();

        System.out.println(sb.toString());
    }
}
