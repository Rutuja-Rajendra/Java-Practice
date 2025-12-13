package Loop;

public class RotationsOfEachOther {
    public static void main(String[] args) {
        //Check if two strings are rotations of each other (“ABCD”, “BCDA”).

        String word1 = "ABCD";
        String word2 = "BCDA";

        if(word1.length() == word2.length() && (word1+ word1).contains(word2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
