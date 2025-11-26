package ControlFlow;

import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage: ");
        float percentage = sc.nextFloat();

        if(percentage >= 95)
        {
            System.out.println("A+");
        }
        else if(percentage >= 90 && percentage < 95)
        {
            System.out.println("A");
        }
        else if(percentage >= 80 && percentage < 90)
        {
            System.out.println("B");
        }
        else if(percentage >= 70 && percentage < 80)
        {
            System.out.println("C");
        }
        else if(percentage >= 60 && percentage < 70)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Fail");
        }

        sc.close();
    }
}
