import java.util.Arrays;

public class AnagramChecker {

    public static int areAnagrams(String A, String B) {
        // Check if lengths are different, return 0 if true
        if (A.length() != B.length()) {
            return 0;
        }

        // Convert strings to char arrays and sort them
        char[] charArrayA = A.toCharArray();
        char[] charArrayB = B.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        // Compare the sorted char arrays
        if (Arrays.equals(charArrayA, charArrayB)) {
            return 1; // Strings are anagrams
        } else {
            return 0; // Strings are not anagrams
        }
    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "listen";
        String str2 = "silent";
        
        int result = areAnagrams(str1, str2);
        
        if (result == 1) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}