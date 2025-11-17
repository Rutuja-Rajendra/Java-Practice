package Loop;

public class CountDigits {
    
    public static void main(String[] args) {
        
        int number = 200004;

        int count = 0;

        while (number != 0)
        {
            number/=10;
            count++;    
        }

        System.out.println(count);
    }
}
