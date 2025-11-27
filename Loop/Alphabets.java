package Loop;

public class Alphabets {
    public static void main(String[] args) {
        
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.print(ch+" ");
        }

        System.out.println();
        
        char ch = 'a';
        while (ch <= 'z') 
        {
            System.out.print(ch+" ");
            ch++;
        }
    }
}
