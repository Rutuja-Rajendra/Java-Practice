package String;

import java.util.TreeSet;

public class Duplicate {
    public static void main(String[] args) {

        //remove duplicate and sort
        
        String word = "Codding";

        TreeSet<Character> set = new TreeSet<>();

        for(int i = 0; i < word.length(); i++)
        {
            set.add(word.charAt(i));
        }

        StringBuilder  sb = new StringBuilder();
        
        for(char c : set)
        {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
