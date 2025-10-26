
    import java.util.*;

    public class solution383 {
//     public static boolean canConstruct(String ransomNote, String magazine) {
//         // Create a HashMap to store the frequency of characters in the magazine
//         HashMap<Character, Integer> magazineMap = new HashMap<>();
        
//         // Count the frequency of each character in the magazine
//         for (char ch : magazine.toCharArray()) {
//             magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
//         }

//         // Check if we can construct the ransomNote from the magazine
//         for (char ch : ransomNote.toCharArray()) {
//             // If the character is not in the magazine or if there are not enough characters
//             if (!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0) {
//                 return false;
//             }
//             // Decrease the count of the character in the magazine
//             magazineMap.put(ch, magazineMap.get(ch) - 1);
//         }

//         // If we can successfully construct the ransomNote, return true
//         return true;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         System.out.println(canConstruct("a", "b")); // false
//         System.out.println(canConstruct("aa", "ab")); // false
//         System.out.println(canConstruct("aa", "aab")); // true
//     }
// }
    public static void main(String args[]){
        String ransomNote = "aab", magazine = "baa";
        // String [] a=magazine.split(ransomNote);
        // System.out.println(Arrays.toString(a));

        boolean res=canConstruct(ransomNote,magazine);
        System.out.println(res);

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char []c=ransomNote.toCharArray();
        char []d=magazine.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        String a=new String(c);
        String b=new String(d);

        if(b.contains(a)){
            return true;
        }
        else{
            return false;
        }

    }
    
}
