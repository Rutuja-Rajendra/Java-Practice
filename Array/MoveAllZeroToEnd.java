package Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        
        int[] numbers = {1,0,3,0,0,2,4};

        int left = 0; 
        int right = numbers.length - 1;

        while (left < right) 
        {
            if(numbers[left] != 0)
            {
                left++;
            }
            else if(numbers[right] == 0)
            {
                right--;
            }
            else
            {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;

                left++;
                right--;
            }    
                
        }
        System.out.println(Arrays.toString(numbers));
    }
}
