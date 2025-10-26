import java.util.*;
public class perfectSquare{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("\t\tEnter the number: ");
        int n=sc.nextInt();
        String ans="not a perfect square";
        for(int i=1;i<=n;i++){
            if(i*i==n){
                ans="perfect Square";
                break;
            }
        }
        System.out.println(ans);

    }
}
