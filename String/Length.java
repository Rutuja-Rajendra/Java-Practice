package String;

public class Length {
    
    public static void main(String[] args) {
        
        //Find length of a string without using .length()

        String word = "Java";
        char[] ch = word.toCharArray();

        int count = 0;

        int i = 0;

        while (i < ch.length) 
        {
            count++;
            i++;
        }   
        

        System.out.println("Length: "+count);
    }
}
