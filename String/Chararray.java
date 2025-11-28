package String;

public class Chararray {
    public static void main(String[] args) {
        
        String word = "I love Java";

        char[] ch = word.toCharArray();

        for(char c : ch)
        {
            if(c == ' ')
            {
                continue;
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
