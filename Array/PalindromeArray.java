package Array;

public class PalindromeArray {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,0,1,2,1};

        int left = 0;
        int right = numbers.length -1;

        boolean flag = true;

        while (left < right) 
        {
            if(numbers[left] != numbers[right])
            {
                flag = false;
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
            System.out.println("No");
        }
    }
}
