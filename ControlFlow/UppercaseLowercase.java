package ControlFlow;

public class UppercaseLowercase {
    
    public static void main(String[] args) {
        
        char ch = 'A';

        if(ch >= 'a' && ch <='z')
        {
            System.out.println("Lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("Not an alphabet");
        }
    }
}
