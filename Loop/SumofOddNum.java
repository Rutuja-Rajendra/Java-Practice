package Loop;

import java.util.Scanner;

public class SumofOddNum {
    public static void main(String[] args) {
        //Find the sum of all odd numbers between two given numbers.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Odd Numbers: ");

        for(int i = start; i <= end; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i+" ");
            }
        }

        sc.close();
    }
}
