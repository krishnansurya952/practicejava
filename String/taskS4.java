// input: a3b2k3d1
// output: aaabbkkkd


import java.util.*;
public class taskS4 {
    public static void main(String args[]){
        String s1="b3c6d5";
        char [] a=s1.toCharArray();
        String ans="";
        for(int i=0;i<a.length;i+=2){
            for(int j=1;j<=(a[i+1]-48);j++){//51-48=3 3times loop will run
                ans+=a[i];
            }
        }
        System.out.println(s1);
        System.out.println(ans);

    }
    
}
