import java.util.*;
public class BinarytoDecimal {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the Binary no: ");
        int binary=sc.nextInt();
        int x=1;
        int sum=0;
        for(int i=binary;i>0;x*=2){
            sum+=(i%10)*x;
            i/=10;
        }
        System.out.println("Binary: "+binary);
        System.out.println("decimal: "+sum);


    }
    
}
