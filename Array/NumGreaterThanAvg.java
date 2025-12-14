package Array;

public class NumGreaterThanAvg {
    public static void main(String[] args) {
        
        //Count how many numbers are greater than the average.

        int[] numbers = {1,2,3,4,5};

        int average = 0;
        int sum = 0;

        for(int i: numbers)
        {
            sum+=i;
        }

        average = sum / numbers.length;

        System.out.println("Average: "+average);

        for(int i : numbers)
        {
            if(i > average)
            {
                System.out.print(i+" ");
            }
        }
    }
}
