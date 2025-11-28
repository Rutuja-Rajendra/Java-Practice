package String;

public class FrequencyofChar {

    public static void main(String[] args) {
        
        String word = "moon";
        
        int[] frequency = new int[256]; // ASCII size

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
        

        
    }
}