package String;

public class SubstringFreq {
    public static void main(String[] args) {
        
        //Find how many times a substring appears in a string.

        String word = "popcornpop";

        String substring = "pop";

        int freq = 0;

        for(int i = 0; i <= word.length() - substring.length(); i++)
        {
            
            if(word.subSequence(i, i + substring.length()).equals(substring))
            {
                freq++;
            
            }    
        }

        System.out.println(freq);
    }
}
