package String;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2));
    }

        public static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            int[] charCount = new int[256]; // Assuming ASCII character set

            for (int i = 0; i < str1.length(); i++) {
                charCount[str1.charAt(i)]++;
                charCount[str2.charAt(i)]--;
            }

            for (int count : charCount) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        
    }
}
