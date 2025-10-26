import java.util.*;
//not soluted
public class solution202 {
    public static boolean isHappy(int n){
        boolean flag=false;
        int ans=0;
        int sum=0;
        while(n>0){
            ans=n%10;
            sum+=ans*ans;
            n=n/10;
            System.out.println("sum: "+sum);
            n=sum;


        }


        return flag;

    }
    public static void main(String args[]){
        int n=19;
        boolean res=isHappy(n);
        System.out.println(res);

    }
    
}
