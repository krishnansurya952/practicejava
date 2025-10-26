import java.util.*;
public class printDuplicate {

    
    public static String printDup(int arr[]){
        String ans="";
        int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=Integer.MAX_VALUE){
                    count++;
                    arr[j]=Integer.MAX_VALUE;
                }

            }
            if(count>1){
                flag=true;
                ans=ans+arr[i];
            }

        }
        if(flag==false){
            ans="no duplicate";
        }
        // System.out.println(ans);
        


        return ans;
    }
    public static void main(String args[]){
        int arr[]={2,3,2,4,5,3,2};
        // int arr1[]={2,3,4,5};
        System.out.println(Arrays.toString(arr));
        String res=printDup(arr);
        System.out.println(res);
        // int unique[]=Arrays.stream(arr).distinct().toArray();
        // System.out.println(Arrays.toString(unique));
    }
    
}
