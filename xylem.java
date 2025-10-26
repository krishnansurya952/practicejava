/*xylem means takes one example 
 * number=1234
 * starting no=1 and ending no=4 are equal to middle no.=2+3
 * 1+4==2+3----> 5==5--->xylem
 * this process xylem
 */



import java.util.*;
public class xylem{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the n element: ");
        int number=sc.nextInt();
        if(number>99){
            int sum=number%10, mean_sum=0;
            number/=10;
            while(number>9){
                mean_sum+=number%10;
                number/=10;
            }
            if((sum+number)==mean_sum)
            System.out.println("xylem");
            else
            System.out.println("pholem");
        }else
        System.out.println("Invalid");

    }
}