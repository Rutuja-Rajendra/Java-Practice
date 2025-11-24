package Array;

public class FindFrequency {
    
    public static void main(String[] args) {
        
        int numbers[] = {1,2,2,3,4,5,5,5,6};
        int frequency = 1;

        for(int i = 0; i < numbers.length - 1; i++)
        {
            if(numbers[i] == numbers[i+1])
            {
                frequency++;
                
            }
            else
            { 
                System.out.println(numbers[i] + " "+frequency);
                frequency = 1;
            }
            
        }

        System.out.println(numbers[numbers.length - 1] + " " + frequency);
    }
}
