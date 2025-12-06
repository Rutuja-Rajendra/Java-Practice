package Loop;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int factorial = 1;

        while (number >= 1) 
        {
            factorial = factorial * number;
            number--;
        }

        System.out.println(factorial);
        
        sc.close();
    }
}
