package String;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        String word = "Java";
        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<Character>();

        for(char ch : word.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
