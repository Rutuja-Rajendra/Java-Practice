package Loop;

public class EvenOddCount {
    
    public static void main(String[] args) {
        
        int number = 12345;
        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) 
        {
            int rem = number % 10;
            
            if(rem % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            number = number / 10;
        }

        System.out.println("Even Count: "+evenCount+"\nOdd Count: "+oddCount);
    }
}
