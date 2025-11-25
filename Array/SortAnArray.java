package Array;
import java.util.Arrays;

public class SortAnArray {
    
    public static void main(String[] args) {
        
        int numbers[] = {1,5,3,7,2};
        int temp = 0;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = 0; j < numbers.length - 1 - i; j++)
            {
                if(numbers[j] > numbers[j + 1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
