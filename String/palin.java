public class palin {
    public static boolean isPalindrome(String s){
        String reverse="";

        for(int i=s.length()-1;i>=0;i-- ){
            reverse=reverse+s.charAt(i);
        }
        if(reverse.equals(s)){
            return true;

        }else
        return false;
    }
    public static void main(String args[]){
        String res=(isPalindrome("madam"))? "palindrome":"not a palindrome";
        System.out.println(res);
    }
    
}
