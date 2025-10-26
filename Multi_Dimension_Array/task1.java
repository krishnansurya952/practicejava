package Multi_Dimension_Array;

/*
 * 8,4,1,4,3        add even number 16
 * 2,5,4,7,11,5     count prime 6
 * 1,8,0,11,14      find smalles
 * 0,4,8,3,4,8,8    print duplicate
 */

public class task1 {
    public static int addEvenNo(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                // System.out.println(arr[i]);
                sum+=arr[i];
            }
        }


        return sum;
    }
    public static int countPrime(int arr[]){
        int res=1;
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            int nums=arr[i];
            if(nums==1|| nums==0){
                flag=false;
            }
            for(int j=2;j<nums;j++){
                if(nums%j==0){
                    flag=false;
                }
            }
            if(flag){
                res++;
            }
            
        }

        return res;
    }
    public static int smallElement(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
    public static String duplicate(int arr[]){
        String ans="";
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[j]!=Integer.MAX_VALUE){
                    count++;
                    arr[j]=Integer.MAX_VALUE;
                }
            }
            if(count>1){
                ans+=arr[i]+" ";
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int arr[][]={{8,4,1,4,3 },{2,5,4,7,11,5},{1,8,-8,11,14},{0,4,8,3,4,8,8}};
        for(int i=0;i<arr.length;i++){
            if(i==0){
                int sum=addEvenNo(arr[i]);
                System.out.println("add Even no : "+sum);
            }if(i==1){
                int res=countPrime(arr[i]);
                System.out.println("count Prime: "+res);
            }if(i==2){
                int small=smallElement(arr[i]);
                System.out.println("smallest Element: "+small);
            }
            if(i==3){
                String dupli=duplicate(arr[i]);
                System.out.println("Duplicate: "+dupli);
            }
        }
    }
    
}
