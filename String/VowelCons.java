package String;

public class VowelCons {
    
    public static void main(String[] args) {
        
        String word = "Java";

        int vowelCount = 0;
        int consonantCount = 0;

        char[] ch = word.toCharArray();

        int i = 0;
        while (i < ch.length) 
        {
            if(ch[i] == 'a' || ch[i] == 'A' || 
               ch[i] == 'e' || ch[i] == 'E' ||
               ch[i] == 'i' || ch[i] == 'I' ||
               ch[i] == 'o' || ch[i] == 'O' ||
               ch[i] == 'u' || ch[i] == 'U')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
            i++;
        }

        System.out.println("Vowels Count : "+ vowelCount+" , Consonants count : "+ consonantCount);
    }
}
