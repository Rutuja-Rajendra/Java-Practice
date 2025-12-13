package Loop;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        
        String sentence = "This is is a test test sentence";

        String words[] = sentence.split("\\s+");

        String result = "";

        for(int i = 0 ; i < words.length - 1; i++)
        {
            if(!words[i].equals(words[i + 1]))
            {
                result+=words[i]+" ";
            }
        }

        System.out.println(result);
    }
}
