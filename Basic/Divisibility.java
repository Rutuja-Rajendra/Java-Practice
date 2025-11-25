package Basic;

public class Divisibility {
    
    public static void main(String[] args) {
        
        int number = 121;

        if(number % 5 == 0 && number % 11 == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
