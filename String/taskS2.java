import java.util.*;

/*input : "Ab23C4D"
 * output: 2+3+4=9
 */
public class taskS2 {
    public static void solve(String s){
        char []c=s.toCharArray();

        int sum=0;

        for(int i=0;i<c.length;i++){
            if(c[i]>='0' && c[i]<='9'){
                System.out.print(c[i]+"+"+"");
                sum=sum+(c[i]-48);
            }
            
        }
        System.out.println(": "+sum);


    }
    public static void main(String args[]){
        String s="Ab23C4D";
        solve(s);

    }
    
}
