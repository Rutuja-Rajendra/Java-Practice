package Array;

import java.util.Arrays;

public class CopyElements {
    
    public static void main(String[] args) {
        
        int numbers1[] = {1,2,3,4};
        int numbers2[] = {5,6,7,8};

        int numbers3[] = new int[numbers1.length+numbers2.length];

        for(int i = 0; i < numbers1.length; i++)
        {
            numbers3[i] = numbers1[i];
        }

        for(int i = numbers1.length; i < numbers3.length; i++)
        {
            numbers3[i] = numbers2[i - numbers1.length];
        }

        System.out.println(Arrays.toString(numbers3));
    }
}
