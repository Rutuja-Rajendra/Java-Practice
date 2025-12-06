package String;

public class CountSpecialChar {
    public static void main(String[] args) {
        
        String word = "ansj.l45[5jj,";

        int count = 0;

        for(char ch : word.toCharArray())
        {
            if(!Character.isLetterOrDigit(ch) && ch != ' ')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
