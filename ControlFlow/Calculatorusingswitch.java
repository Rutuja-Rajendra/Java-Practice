package ControlFlow;

import java.util.Scanner;

public class Calculatorusingswitch {
    
    public static void main(String[] args) {
        
        System.out.println("Calculator!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Choose the operator:");

        System.out.println("------------------------------");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");
        System.out.println("------------------------------");

        String choice = scanner.next();

        switch (choice) {
            case "+":
                System.out.println(num1 + num2);
                break;
        
            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                System.out.println(num1 / num2);
                break;

            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Wrong operator");
                break;
        }

        scanner.close();
    }
}
