package Array;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,3,4,5,5,6};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : numbers)
        {
            if(!list.contains(i))
            {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
