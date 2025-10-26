import java.util.*;

/* input:   I Love Biryani
 * output:  I Hate Biryani
 */

public class taskS1 {
    public static void main(String args[]){
        String s="I Love Biryani";
        String ans="";
        System.out.println(s);
        String sp[]=s.split(" ");
        System.out.println(Arrays.toString(sp));
        System.out.println(s);
        for(int i=0;i<sp.length;i++){
            if(sp[i].equals("Love")){
                ans=ans+"Hate"+" ";
            }else{
                ans+=sp[i]+" ";
            }
        }
        System.out.println(ans);

    }
    
}
