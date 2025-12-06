package Basic;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        boolean flag = false;

        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0 && i * i == number)
            {
                flag = true;
            }
        }

        if(flag)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not");
        }

        sc.close();
    }
}
