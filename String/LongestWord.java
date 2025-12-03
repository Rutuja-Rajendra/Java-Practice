package String;

public class LongestWord {
    public static void main(String[] args) {
        
        String sentence = "I can buy myself flowers, write my name on sand, can sing a song for myself, i can love me better then,you can!";

        sentence = sentence.toLowerCase().replace("[^a-z ]", "");

        String[] words = sentence.split("\\s+");

        String longest = "";
        int maxLength = 0;

        for(String s : words)
        {
            if(s.length() > maxLength)
            {
                maxLength = s.length();
                longest = s;
            }
        }

        System.out.println("Longest Word: "+longest);
        System.out.println("Length: "+maxLength);

    }
}
