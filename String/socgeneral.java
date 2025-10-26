import java.util.Arrays;

public class socgeneral{
    public static boolean checkPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String a="A man, a plan, a canal: Panama";

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){

            char ch=a.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        String result=sb.toString();
        result=result.toLowerCase();
        String res=(checkPalindrome(result))? ("\n\t\t\tyes"): ("\n\t\t\tNo");
        System.out.print(a+"\n\t"+result);
        System.out.print(res+" palindrome");
            
        }
        
    }
    

