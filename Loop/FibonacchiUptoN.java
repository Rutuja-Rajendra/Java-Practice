package Loop;

public class FibonacchiUptoN {
    
    public static void main(String[] args) {
        
        int n = 10;

        int first = 0;
        int second = 1;

        System.out.print(first+" , "+second);

        int i = 2;
        while (i < n) 
        {
            int next = first + second;
            
            System.out.print(" , "+next);
            first = second;
            second = next;

            i++;
        }
    }
}
