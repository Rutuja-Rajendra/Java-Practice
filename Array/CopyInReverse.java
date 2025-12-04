package Array;

import java.util.Arrays;

public class CopyInReverse {
    public static void main(String[] args) {
        
        //Copy one array into another in reverse order.

        int[] arr1 = {0,1,2,3};
        int[] arr2 = {4,5,6};

        int temp = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        for(int i = arr2.length - 1; i >= 0; i--) //i=3 
        {
            arr3[temp++] = arr2[i];
        }

        temp = arr2.length;

        for(int i = arr1.length - 1; i >= 0; i--)
        {
            arr3[temp++] = arr1[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
