package ControlFlow;

public class Smallest {
    
    public static void main(String[] args) {
        
        int a = 12;
        int b = 10;
        int c = 2;

        if(a < b)
        {
            if(a < c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else if(b < c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
