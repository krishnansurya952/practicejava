import java.util.HashSet;

public class solution3{
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, remove characters from the start
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(end));
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}
