package Loop;

public class LargestDigitinNumber {
    public static void main(String[] args) {
        
        int number = 78325;

        int largest = 0;

        while (number != 0) 
        {
            int rem = number % 10;
            
            if(largest < rem)
            {
                largest = rem;
            }

            number /= 10;
        }

        System.out.println(largest);
    }
}
