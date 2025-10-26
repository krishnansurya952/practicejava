package method_function;

public class palindrome {
    public static boolean isPalindrome(int number){
        int res=0;
        int temp=number;
        while(number>0){
            res=res*10+number%10;
            number/=10;            
        }
        if(res==temp){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int n=989;
        if(isPalindrome(n)){
            System.out.println("Yes, It is Palindrome");
        }else{
            System.out.println("No, It is Not a Palindrome");
        }

    }
    
}
