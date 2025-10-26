import java.util.*;

public class primeSum {
    public static boolean isPrime(int num){
        boolean flag=true;

        if(num==0||num==1){
            flag=false;
        }
        
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=false;
                }

        }
        return flag;
    }
    public static void main(String args[]){
        int arr[]={4,5,7,1,11,3,8};
        int n=10;
        int sum=0,count=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.print("isPrime: "+arr[i]+" ");
                sum+=arr[i];
                count++;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);





    }
    
}
