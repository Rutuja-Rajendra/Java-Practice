package String;

public class TotalADS {
    public static void main(String[] args) {
        
        String password = "Rutuja4@#01";

        char ch[] = password.toCharArray();

        int alphabetsCount = 0;
        int digitsCount = 0;
        int specialcharCount = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z'  || ch[i] >= 'A' && ch[i] <= 'Z')
            {
                alphabetsCount++;
            }
            else if(ch[i] >= '0' && ch[i] <= '9')
            {
                digitsCount++;
            }
            else
            {
                specialcharCount++;
            }
        }

        System.out.println("Alphabet Count: "+alphabetsCount+"\nDigit Count: "+digitsCount+"\nSpecical Character Count: "+specialcharCount);
    }
}
