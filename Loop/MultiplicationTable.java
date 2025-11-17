package Loop;

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Table of "+number+" : ");
        int i = 1;

        while (i <= 10) {
            System.out.println(number * i);
            i++;
        }

        scanner.close();
    }
}
