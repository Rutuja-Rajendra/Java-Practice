package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : numbers)
        {
            list.add(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Element: ");
        int element = sc.nextInt();

        list.remove(Integer.valueOf(element));

        System.out.println(list);
        sc.close();
    }
}
