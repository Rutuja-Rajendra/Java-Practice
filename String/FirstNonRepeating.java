package String;

public class FirstNonRepeating {
    //Find the first non-repeating character in a string.

    public static void main(String[] args) {
        
        String word = "swiss";

        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            boolean isUnique = true;


            for(int j = 0; j < word.length(); j++)
            {
                char c = word.charAt(j);
                if(i != j && ch == c)
                {
                    isUnique = false;
                }
            }

            if(isUnique)
            {
                System.out.println(ch);
                break;
            }
        }

        

    }
}
