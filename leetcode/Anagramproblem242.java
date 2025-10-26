import java.util.*;
public class Anagramproblem242 {
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";
        char []a=s.toCharArray();
        char []b=t.toCharArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        String res1=new String(a);
        String res2=new String(b);
        if(res1.equals(res2)){
            System.out.println("yes it a anagram");
        }else {
            System.out.println("not a anagram");
        }
        

        
    }
    
}
