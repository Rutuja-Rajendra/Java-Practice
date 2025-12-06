package Loop;

public class SmallestDigitinNumber {
    public static void main(String[] args) {
        
        int number = 93217;

        int smallest = number;

        while (number != 0) 
        {
            int rem = number % 10;
            
            if(smallest > rem)
            {
                smallest = rem;
            }

            number /= 10;
        }

        System.out.println(smallest);
    }
}
