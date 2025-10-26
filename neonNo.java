import java.util.*;
public class neonNo {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){

        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int square=num*num;
        int lastdigit=0;
        int sum=0;
        if(square==0){
            System.out.println("neon number");
        }else{
            while(square>0){
                lastdigit=square%10;
                sum+=lastdigit;
                square/=10;
            }
            if(sum==num){
                System.out.println(sum+" == "+num+" \nneon number");
            }else{
                System.out.println(sum+" != "+num+" \nnot a neon number");
            }
        }

    }
    
}
