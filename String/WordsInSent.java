package String;

public class WordsInSent {
    
    public static void main(String[] args) {
        
        String sentence = "I love J ava ";

        char[] ch = sentence.trim().toCharArray();

        int count = 1;

        int i = 0;
        while (i < ch.length) 
        {
            if(ch[i] == ' ')
            {
                count++;
            }
            i++;
        }

        System.out.println("Count : "+count);
    }
}
