// package Arrays;

public class KadaneALGORITHM {


    //! KadaneALGORITHM
    public static void main(String args[]){
        int a[]= {-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<a.length;i++){
            currentsum=currentsum+a[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>max){
                max=currentsum;
            }
        }
        System.out.println("MAX sub Array Sum: "+max);

    }
    
}
