package Loop;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int number = 2002;
        int temp = number;

        int reverse = 0;

        while (temp != 0) {
            
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if(number == reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
