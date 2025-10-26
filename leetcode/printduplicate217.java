public class printduplicate217 {
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        boolean res=containsDuplicate(nums);
        System.out.println(res);
    }

        
            public static boolean containsDuplicate(int[] nums) {
                int count=0;
                boolean flag=false;
                for(int i=0;i<nums.length-1;i++){
                     count=1;
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[i]==nums[j] && nums[j]!=Integer.MAX_VALUE){
                            count++;
                            nums[j]=Integer.MAX_VALUE;
                        }
                    }
                    if(count>1){
                        flag=true;
        
                    }
                
                    }
                    return flag;
                    
                }
        
        
                
            
        























    //     boolean flag=true;
    //     int arr[]={1,2,4,1,5,8,9,3,4,1,9,8,6,4,3,1};
    //     String ans="";
    //     int count=0;
        

    //     for(int i=0;i<arr.length-1;i++){
    //         count=1;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j] && arr[j]!=Integer.MAX_VALUE){
    //                 count++;
    //                 arr[j]=Integer.MAX_VALUE;

    //             }  
    //             }
    //             if(count>1){
    //                 flag=true;
    //                 ans+=arr[i];
    //             }
                
    //             }
    //             if(flag==false){
    //                 ans="no duplicate";
            

    //     }
    //     System.out.println(ans);

    }
    

