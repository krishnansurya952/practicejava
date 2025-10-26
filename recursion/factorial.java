package recursion;
import java.util.*;

public class factorial {




    // static int fact=1;
    // public static int findfact(int number){
    //     if(number>=1){
    //         fact=fact*number;
    //         number--;
    //         findfact(number);
    //     }
    //     return fact;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the number: ");
    //     int number=sc.nextInt();

    //     int res=findfact(number);
    //     System.out.println(number+"!:  "+res);

    // }
    

    
    public static int solve(int num){
        int fact=1;
        if(num==5){
            fact*=num;
            return fact;
        }
        
        fact=solve(num+1);
        System.out.print(num+" : ");
        System.out.println(num+" * "+fact);
        fact*=num;
        

        return fact;

    }
    public static void main(String args[]){
        int res=solve(1);
        System.out.println(res);
    }



















    // public static int solve(int num){
    //     int fact=1;
    //     if(num==1){
    //         fact*=num;
    //         return fact;
    //     }
    //     fact=solve(num-1);
    //     fact*=num;
    //     System.out.println(num+" : "+fact);

    //     return fact;

    // }
    // public static void main(String args[]){
    //     int res=solve(5);
    //     System.out.println(res);
    // }
    
}
