package Loop;

public class Armstrong {
    
    //153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 -> 153

    public static void main(String[] args) 
    {

        int number = 158;
        int temp = number;
        int power = 3;
        int sum = 0;
        while(temp != 0)
        {
            int rem = temp % 10;
            sum = sum + (int)Math.pow(rem, power);
            temp = temp / 10;
        }

        if(sum == number)
        {
            System.out.println("Armstong Number");
        }
        else
        {
            System.out.println("Not");
        }
    }
}
