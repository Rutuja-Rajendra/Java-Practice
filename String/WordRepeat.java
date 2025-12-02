package String;

public class WordRepeat {
    public static void main(String[] args) {
        
        String sentence = "You know what, you are the best!";

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split("\\s+");

        String target = "you";
        int count = 0;

        for(String str : words)
        {
            if(str.equals(target))
            {
                count++;
            }
        }

        System.out.println(target+" : "+count);
    }
}
