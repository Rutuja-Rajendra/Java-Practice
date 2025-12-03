package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,5,6,7,3};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : numbers)
        {
            list.add(i);
        }

        System.out.println("Position: ");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();

        System.out.println("Element: ");
        int element = sc.nextInt();

        if(position < 0 || position > list.size())
        {
            System.out.println("Invalid position");
        }
        else
        {

            list.add(position, element);
            System.out.println(list);
        }
        
        sc.close();
    }
}
