package String;

public class CharRepeat {
    public static void main(String[] args) {
        
        String str = "Programming";

        char targetchar = 'g';
        int count = 0;

        for(char ch : str.toCharArray())
        {
            if(ch == targetchar)
            {
                count++;
            }
        }

        System.out.println(targetchar+" : "+count);

    }
}
    
