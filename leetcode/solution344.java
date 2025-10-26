import java.util.*;
public class solution344 {
    public static void reverseString(char[] s){

        int left=0,right=s.length-1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(s));
        
        // char []c=new char[s.length];
        // int n=s.length-1;
        // for(int i=0;i<s.length;i++){
        //     c[n--]=s[i];

        // }
        // System.out.println(Arrays.toString(c));
        
        
    }
    public static void main(String args[]){
        String s="hello";
        // StringBuilder sb[]=new StringBuilder("h","e","l","l","o");
        char[] c=s.toCharArray();
        System.out.println(Arrays.toString(c));
        reverseString(c);
    }
    
}
