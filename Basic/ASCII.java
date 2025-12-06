package Basic;

public class ASCII {
    public static void main(String[] args) {
        //Print ASCII value of all characters in a string.

        String word = "Java";

        for(char ch : word.toCharArray())
        {
            System.out.println((int) ch);
        }
    }
}
