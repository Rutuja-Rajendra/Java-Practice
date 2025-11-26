package ControlFlow;

import java.util.Scanner;

public class CenturyYear {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");

        int year = sc.nextInt();

        if(year % 100 == 0)
        {
            System.out.println("Century year");
        }
        else
        {
            System.out.println("Not");
        }

        sc.close();

    }
}
