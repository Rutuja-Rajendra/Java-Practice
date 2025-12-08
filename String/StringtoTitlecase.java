package String;

public class StringtoTitlecase {
    public static void main(String[] args) {
        //Convert a string to title case (e.g., "hello world" → "Hello World").

        String word = "hello world";

        String words[] = word.split(" ");

        String result = "";

        for(String s : words)
        {
            if(s.length() > 0)
            {
                result += Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase()+" ";

            }
        }

        System.out.println(result);
    }
}
