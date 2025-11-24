package Array;

public class SearchAnElement {
    
    public static void main(String[] args) {
        
        int numbers[] = {1,2,3,4,5,6};

        int num = 6;
        boolean flag = false;

        for(int i : numbers)
        {
            if(i == num)
            {
                flag = true;
            }
        }

        if(flag)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
