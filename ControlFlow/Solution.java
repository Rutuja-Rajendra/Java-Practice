package ControlFlow;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit: ");
        int digit = sc.nextInt();

        if(digit == 1)
        {
            System.out.println("Hello");
        }
        else if(digit == 2)
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Bye");
        }
        sc.close();
    }
}
