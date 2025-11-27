package String;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        
        String word = "Worki";

        char ch[] = word.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'||
                ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'
            )
            {
                ch[i] = '*';
            }
        }

        System.out.println(Arrays.toString(ch));
    }
}
