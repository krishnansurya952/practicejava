import java.util.*;

public class solution66 {


    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0 ;i--){

            if(digits[i]+1!=10){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }

        int [] newDigits=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }




    // public static int[] solve(int a[]){
        // int arr[]=new int[a.length];
        // System.out.println(Arrays.toString(a));
        // int sum=0;
        // for(int i=0;i<a.length;i++){
        //     sum=sum*10+a[i];
        // }
        // sum=sum+1;
        // System.out.println(sum);
        // int temp=sum;
        // int n=0;
        // int i=a.length-1;
        // while(temp>0){
        //     n=temp%10;
        //     System.out.println(n);
        //     arr[i--]=n;
        //     temp=temp/10;
            
        // }
        // System.out.println(Arrays.toString(arr));
        

        // return arr;
    // }
    public static void main(String args[]){
        int []arr={1,2,3};
        plusOne(arr);
    }
    
}
