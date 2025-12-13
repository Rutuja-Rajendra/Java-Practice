package Loop;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        
        String word = "ohh    my      god   !  ";

        word = word.trim().replaceAll("\\s+"," ");
        System.out.println(word);
    }
}
