import java.util.*;
public class StrongNumber {
    public static void main(String argsp[]){
        int n=115;
        int temp=n;
        int a;
        int sum=0;
        while(temp>0){
            a=temp%10;
            sum=sum+fact(a);
            System.out.println("sum: "+fact(a));
            temp=temp/10;
            
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("No its not a Strong number");
        }

    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
