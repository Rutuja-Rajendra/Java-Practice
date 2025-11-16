package Basic;
public class Swap {
    
    public static void main(String[] args) {
        
        int a = 10; 
        int b = 20;

        System.out.println("Before swapping: " + "A : "+ a +"  B : "+b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping: "+"A : "+ a +"  B : "+b);
    }
}
