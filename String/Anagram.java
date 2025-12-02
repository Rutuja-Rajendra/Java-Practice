package String;

import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
     
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        boolean flag = true;

        if(s1.length() == s2.length())
        {
            flag = false;
        }

        for(char ch : s1.toCharArray())
        {
            list1.add(ch);
        }

        for(char ch : s2.toCharArray())
        {
            list2.add(ch);
        }

        if(!list1.containsAll(list2))
        {
            flag = false;
        }
        else
        {
            flag = true;
        }

        if(flag)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

        
    }
}
