// package Arrays;
import java.util.*;

public class zigzag {
    public static int [] zigZag(int []x,int []y){
        int zig[]=new int[x.length+y.length];
        for(int i=0,a=0,b=0;i<=zig.length-1;i++){
            if(i%2==0){
                zig[i]=x[a++];
            }else{
                zig[i]=y[b++];
            }
        }
        return zig;
    }
    public static void main(String args[])throws Exception{
        int a[]={10,20,30,40,50};
        int b[]={60,70,80,90,100};
        int []res=zigZag(a,b);
        System.out.println(Arrays.toString(a)+"    doing zigZag   "+Arrays.toString(b) );
        System.out.println("Processing.....");
                // Thread.sleep(5000);
        for(int i=0;i<=res.length-1;i++){
            System.out.print(res[i]+ " ");
            Thread.sleep(500);
            
        }
        System.out.println();
        System.out.println("ZigZag: "+Arrays.toString(res));
    }
    
}
