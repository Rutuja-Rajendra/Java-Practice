package String;

public class UppercaseLowercase {

    public static void main(String[] args) {
        
        String word = "AlphaBeT";

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        char ch[] = word.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >='a' && ch[i] <= 'z')
            {
                lowercaseCount++;
            }
            else
            {
                uppercaseCount++;
            }
        }

        System.out.println("Lowercase Count: "+lowercaseCount+"\nUppercase Count: "+uppercaseCount);
    }
}
