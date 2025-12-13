package Loop;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        
        int number = (int)(Math.random()*100)+1;

        Scanner sc = new Scanner(System.in);

        int input = 0;

        while (input != number)
        {
            System.out.println("Enter your guess between 1 to 100: ");
            input = sc.nextInt();

            if(input < number)
            {
                System.out.println("Too low");
            }
            else if(input > number)
            {
                System.out.println("Too high");
            }
            else
            {
                System.out.println("Correct! You win!");
            }
        }

        sc.close();
    }
}
