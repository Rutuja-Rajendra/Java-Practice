package Array;

public class LargestSmallest
{
    public static void main(String[] args)
    {
        int numbers[] = {1,23,54,76,9,90};

        int largestEle = numbers[0];
        int smallestEle = numbers[0];

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largestEle)
            {
                largestEle = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < smallestEle)
            {
                smallestEle = numbers[i];
            }
        }

        System.out.println("Largest Element: "+largestEle+" \nSmallest Element: "+smallestEle);

    }
}