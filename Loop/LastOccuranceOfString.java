package Loop;

public class LastOccuranceOfString {
    public static void main(String[] args) {

        //Find last occurrence of a character without using lastIndexOf().
        
        String word = "Rutujau";

        char target = 't';
        
        int index = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == target)
            {
                index = i;
            }
        }

        System.out.println(index);

    }
}
