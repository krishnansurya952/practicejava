// package Arrays;
import java.util.*;

public class cUppertolower {
    public static void main(String args[]){
        char []a={'a','b','f','r','Q','E','X','L'};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                a[i]=(char)(a[i]-32);
            }else if(a[i]>='A' && a[i]<='Z'){
                a[i]=(char)(a[i]+32);
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}
