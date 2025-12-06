package Basic;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        //Convert a lowercase string to uppercase manually (without using .toUpperCase()).

        String word = "RutuJa";
        String result = "";
        for(char ch : word.toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println(result);
    }
}
