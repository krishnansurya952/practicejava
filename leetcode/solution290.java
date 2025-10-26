import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class solution290 {
    public static boolean wordPattern(String pattern, String s) {
        // Split the input string into words
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        
        // If the length of pattern and words array do not match, return false
        if (pattern.length() != words.length) {
            return false;
        }
        
        // Create two hash maps to track the mapping of characters to words and vice versa
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        
        // Iterate through the pattern and words to check the bijection
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // Check if the current character is already mapped to a word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // If the mapping doesn't match, return false
                }
            } else {
                charToWord.put(c, word); // Add the character-word mapping
            }
            
            // Check if the current word is already mapped to a character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // If the mapping doesn't match, return false
                }
            } else {
                wordToChar.put(word, c); // Add the word-character mapping
            }
        }
        
        return true; // If we reach here, the bijection is valid
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
    }
}