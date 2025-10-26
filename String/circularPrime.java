import java.util.*;

public class circularPrime {
    static Scanner sc=new Scanner(System.in);
    public static boolean isCircularPrime(int n,char []a){
        for(int i=0;i<=n;i++){
            char first=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=first;
            String s=new String(a);
            int num=Integer.parseInt(s);
            System.out.println("Integer parseInt:"+num);
            if(!isPrime(num)){
                // System.out.println("isprime:"+isPrime(num));
                return false;
            }
            // System.out.println("isprime:"+isPrime(num));

        }
        return true;



    }
    
    public static boolean isPrime(int n){
        boolean flag=true;
        if(n==0 || n==1){
            flag=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        // System.out.print("Enter the Number: ");
        String s="9311";
        System.out.println("String : "+s);

        char[]c=s.toCharArray();
        System.out.println("char []: "+Arrays.toString(c));

        int length=c.length;
        if(isCircularPrime(length,c)){
            System.out.println("Circular prime");
        }else{
            System.out.println("not a circular prime");
        }


    }
    
}
/* 
String : 3119
char []: [3, 1, 1, 9]
Integer parseInt:1193
Integer parseInt:1931
Integer parseInt:9311
Integer parseInt:3119
Integer parseInt:1193
Circular prime
String : 1193
char []: [1, 1, 9, 3]
Integer parseInt:1931
Integer parseInt:9311
Integer parseInt:3119
Integer parseInt:1193
Integer parseInt:1931
Circular prime
String : 1931
char []: [1, 9, 3, 1]
Integer parseInt:9311
Integer parseInt:3119
Integer parseInt:1193
Integer parseInt:1931
Integer parseInt:9311
Circular prime
String : 9311
char []: [9, 3, 1, 1]
Integer parseInt:3119
Integer parseInt:1193
Integer parseInt:1931
Integer parseInt:9311
Integer parseInt:3119
Circular prime
*/