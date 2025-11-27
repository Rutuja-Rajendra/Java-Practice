package Loop;

public class SumofEvenOdd {
    public static void main(String[] args) {
        
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                evenSum += i;
            }
            else
            {
                oddSum += i;
            }
        }

        System.out.println("Even Sum: "+evenSum+"\nOdd Sum: "+oddSum);
    }
}
