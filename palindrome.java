import java.util.*;
public class palindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int temp=number;
        int res=0;
        while(number>0){
            res=res*10+(number%10);
            number/=10;

        }if(res==temp){
            System.out.println("it is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }

    }
    
}
