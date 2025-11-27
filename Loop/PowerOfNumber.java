package Loop;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Enter power: ");
        int power = sc.nextInt();

        System.out.println("Answer: "+(int)Math.pow(number,power));

        sc.close();
    }
}
