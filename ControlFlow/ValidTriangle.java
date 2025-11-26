package ControlFlow;

import java.util.Scanner;

public class ValidTriangle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1:");
        int side1 = sc.nextInt();

        System.out.println("Enter side 2:");
        int side2 = sc.nextInt();

        System.out.println("Enter side 3:");
        int side3 = sc.nextInt();

        if(side1 > 0 && side2 > 0 && side3 > 0 && (side1 + side2 + side3 == 180))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
