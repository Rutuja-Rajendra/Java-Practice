package String;

public class CharRepeat {
    public static void main(String[] args) {
        String str = "programming";
        char targetChar = 'g';
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == targetChar) {
                count++;
            }
        }

        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string \"" + str + "\".");
    }
}
    
