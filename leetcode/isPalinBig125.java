import java.util.*;
public class isPalinBig125 {

    public static boolean isPalindrome(String s) {
        boolean flag=false;
        // s=s.toLowerCase().replaceAll("[^a-z]","");
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev="";
        int length=s.length()-1;
        while(length>=0){
            rev=rev+s.charAt(length);
            length--;
            
        }
        System.out.println(s);
        System.out.println(rev);
        if(s.equals(rev)){
            flag=true;
        }

        return flag;
    }
    public static void main(String args[]){
        String a="A man, a plan, a canal: Panama";
        String b="race a car";

        boolean res=isPalindrome("0P");
        System.out.println(res);
    }


















        // boolean flag=false;
        // s=s.toLowerCase().replaceAll("[^a-z]","");
        // String rev=s;
        // System.out.println(rev);
        // System.out.println(s);
        // for(int i=0,m=s.length()-1;i<s.length();i++){
        //     if(s.charAt(i) == (rev.charAt(m--))){
        //         System.out.println(s.charAt(i)+" "+rev.charAt(m+1));
        //         flag=true;
        //     }  else {
        //         flag=false;
        //         break;
        //     }    
            
            
        // }
            
            
        // return flag;
    // }
    
   
        // public static boolean isPalindrome(String s) {
        //     s = s.toLowerCase();
        //     System.out.println(s);
        //     s=s.replaceAll("[^a-z]", "");
        //     System.out.println(s);
        //     int i=0, j=s.length()-1;
        //     while(i <= j){
        //         if(s.charAt(i) != s.charAt(j)) return false;
        //         i++;
        //         j--;
        //     }
        //     return true;
        // }
    
    
    
}
