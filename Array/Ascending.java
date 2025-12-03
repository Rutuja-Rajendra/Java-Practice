package Array;


public class Ascending {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,3};
        boolean flag = true;

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length - 1; j++)
            {
                if(numbers[j] >  numbers[j + 1])
                {
                    flag = false;
                }
            }
        }

        if(flag)
        {
            System.out.println("In Ascendig order");
        }
        else
        {
            System.out.println("Not in Ascendig order");
        }

        
    }
}
