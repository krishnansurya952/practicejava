import java.util.*;
public class isPrime {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("\t\t Enter n: ");
        int n=sc.nextInt();
        boolean flag=true;
        if(n==0||n==1){
            flag=false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                flag=false;
                break;
                }                
            }
        }
        if(flag){
            System.out.println(n+" : Prime number");
        }else{
            System.out.println(n+" : not a Prime number");
        }
    }
    
}
