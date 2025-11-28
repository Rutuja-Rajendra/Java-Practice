package String;

public class ConcatStrings {
    public static void main(String[] args) {
        //without using +

        String word1 = "Hello ";
        String word2 = "World";

        StringBuilder sb = new StringBuilder(word1);
        sb.append(word2);

        System.out.println(sb.toString());
    }
}
