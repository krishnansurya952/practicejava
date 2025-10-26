package recursion;
import java.util.*;

public class fabinacci {
    static int n1=0,n2=1;
    static Scanner sc=new Scanner(System.in);

    public static void fibo(int count,int series){
        int n3=n1+n2;
        if(count==series){
            n3=n1+n2;
            System.out.println(n3);
            return;
        }
            n1=n2;
            n2=n3;
            System.out.print(n3+" : ");
            count++;
            
            fibo(count,series);
            
            
        
        return;
    }
    public static void main(String args[]){
        System.out.print("\t\tEnter the number: ");
        int series=sc.nextInt();
        fibo(0,series);
    }
















    // public static void solve(int n1,int n2,int count){
    //     int n3=n1+n2;
    //     if(count==7){
    //         return ;
    //     }
    //     count++;
    //     System.out.print(n3+" ");
    //     solve(n2,n3,count);
        
        
    // }
    // public static void main(String args[]){

    //     solve(0,1,0);



    // }
    
}
