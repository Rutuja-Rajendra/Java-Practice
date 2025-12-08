package String;

public class RemoveVowels {
    public static void main(String[] args) {
        
        String word = "Program";

        String result = word.replaceAll("[AEIOUaeiou]", "");

        System.out.println(result);
    }
}
