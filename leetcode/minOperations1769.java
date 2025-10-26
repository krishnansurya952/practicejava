import java.util.*;
public class minOperations1769 {
    public static void main(String args[]){
        String s="001011";
        int a[]=minOperations(s);
        System.out.println(Arrays.toString(a));
    }
    
        public static int[] minOperations(String boxes) {
            int n=boxes.length();
            int ans[]=new int[n];
            for(int i=0;i<n;i++){
                int temp=0;
                for(int j=0;j<n;j++){
                    if(boxes.charAt(j)=='1'){
                        temp+=Math.abs(j-i);
                    }
                }
                ans[i]=temp;
            }
            return ans;
            
        }
    
    
}
