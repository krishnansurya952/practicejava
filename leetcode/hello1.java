import java.util.Arrays;

public class hello1 {
     static boolean isAnagram(String a, String b) {
      a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Create an array to count character frequencies (26 letters in the English alphabet)
        int[] charCount = new int[26];
        
        // Count characters in the first string
        for (char c : a.toCharArray()) {
            charCount[c - 'a']++;
        }
        System.out.println(Arrays.toString(charCount));
        
        // Subtract counts based on the second string
        for (char c : b.toCharArray()) {
            charCount[c - 'a']--;
        }
        System.out.println(Arrays.toString(charCount));

        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    
























      //   // Complete the function
      //   boolean flag=false;
      //   char [] c=a.toCharArray();
      //   char[] d=b.toCharArray();
        
      //   Arrays.sort(c);
      //   Arrays.sort(d);
      //   System.out.println(Arrays.toString(c));
      //   System.out.println(Arrays.toString(d));
      //   String s=new String(d);
      //   String n=new String(c);
      //   System.out.println(s);
      //   System.out.println(n);
      //   if(s.equals(n)){
      //    // System.out.println("Anagrams");
      //    flag=true;
      //   }else{
      //    // System.out.println("Not Anagrams");
      //    flag=false;
      //   }
        
    
        
        
        
        
        
      //   return flag;
    }
    public static void main(String args[]){
      boolean n=isAnagram("anagram","margana");
      System.out.println(n?"Anagram":"notAnagram");



    }
























   //  //main method
   //  public static void main(String[] args){
    
   //     //Declare and initialize the array elements
   //     int[] nums = new int[]{1, 6, 5, 2, 4,5, 7, 9, 4, 6};
        
   //     //logic implementation for middle element
       
   //     //if even number of array elements are present
   //     if (nums.length %2 == 0){
   //        System.out.println("The middle elements are: ");
          
   //        // even-length array (two middle elements)
   //        int x = nums[(nums.length/2) - 1];
   //        System.out.println(x);
   //        int y = nums[nums.length/2];
   //        System.out.println(y);
   //     } 
       
   //     //if odd number of array elements are present
   //     else {
       
   //        // odd-length array (only one middle element)
   //        int z = nums[nums.length/2];
   //        System.out.println("The middle elements is: ");
   //        System.out.println(z);
   //     }
   //  }
 }