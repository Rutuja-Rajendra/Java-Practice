package Array;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] numbers = new int[n];
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for(int i: numbers)
        {
            if(i == 0)
            {
                zeroCount++;
            }
            else if(i > 0)
            {
                positiveCount++;
            }
            else
            {
                negativeCount++;
            }
        }

        System.out.println("Zero Count: "+zeroCount+"\nPositive Count: "+positiveCount+"\nNegative Count: "+negativeCount);
        sc.close();
    }
}
