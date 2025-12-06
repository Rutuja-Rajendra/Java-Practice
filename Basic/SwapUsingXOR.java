package Basic;
public class SwapUsingXOR {
    public static void main(String[] args) {
        
        int number = 5;
        int anotherNumber = 10;
        System.out.println("Before Swap: ");
        System.out.println("number: " + number);
        System.out.println("anotherNumber: " + anotherNumber);
        
        number = number ^ anotherNumber; // number now holds the XOR of both numbers
        anotherNumber = number ^ anotherNumber; // anotherNumber is now original number
        number = number ^ anotherNumber; // number is now original anotherNumber    
        System.out.println("After Swap: ");
        System.out.println("number: " + number);
        System.out.println("anotherNumber: " + anotherNumber);
    
    }
}
