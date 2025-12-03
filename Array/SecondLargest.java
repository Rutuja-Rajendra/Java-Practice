package Array;

public class SecondLargest {
    public static void main(String[] args) {
        
        int[] numbers = {5,8,6,9,2,10};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > secondLargest && numbers[i] < largest)
            {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second Largest: "+secondLargest);
    }
}
