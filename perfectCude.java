import java.util.*;
public class perfectCude {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        String ans="perfect Cude or not";

        for(int i=1;i<=n;i++){
            if(i*i*i==n){
                System.out.println(i*i*i+" :perfect cude");
                ans="prefect cude";
                break;
            }else{
                System.out.println(i*i*i+" : not a perfect cude");
                ans="not a perfect cude";
            }
            
        }
        System.out.println(ans);
    }
    
}
