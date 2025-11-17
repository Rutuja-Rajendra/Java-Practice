package String;

public class PalindromeString {
    
    public static void main(String[] args) {
        
        String word = "madam";

        char[] ch = word.toCharArray();

        boolean flag = true;
        int left = 0;
        int right = ch.length - 1;

        while (left < right) 
        {
            if(ch[left] != ch[right])
            {
                flag = false;
                break;
            }    
            
            left++;
            right--;
        }

        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
