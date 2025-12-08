package String;

public class ReverseEachWord {
    public static void main(String[] args) {
        
        String sentence = "Turn around look at what you see.";

        String[] words = sentence.split("//s+");

        String result = "";

        for(String s : words)
        {
            StringBuilder sb = new StringBuilder(s);
            result += sb.reverse().toString();
        }

        System.out.println(result);
    }
}
