/*ARMSTRONG 
 * 153=1^3+5^3+3^3
 * 1634=1^4+6^4+3^4+4^4
*/


import java.util.*;
public class Armstrong {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int temp=n,count=0,sum=0;
        while(n>0){
            n=n/10;
            count++;
        }
        n=temp;
        while(n>0){
            int last=n%10,pro=1;
            for(int i=1;i<=count;i++){
                pro=pro*last;
            }
            sum=sum+pro;
            System.out.println(sum+" "+count);
            n/=10;
        }
        if(sum==temp){
            System.out.println("ArmStrong Number");

        }else
        System.out.println("not a armstrong number");
    }
    
}
