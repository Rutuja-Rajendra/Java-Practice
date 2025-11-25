package Basic;

public class SquareCube {
    
    public static void main(String[] args) {
        
        int number = 5;
    
        int square = 1;
        int cube = 1;

        for(int i = 1; i <= 2; i++)
        {
            int temp = number;
            square = square * temp;            
        }

        for(int i = 1; i <= 3; i++)
        {
            int temp = number;
            cube = cube * temp;
        }

        System.out.println("Square: "+ square+" \nCube: "+cube);
    }
}
