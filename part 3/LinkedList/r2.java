import java.util.*;

public class r2{
    public static void main(String args[]){
        String s="Hello";
        char[]a=s.toCharArray();


        List l1=new LinkedList();
        for(int i=0;i<a.length;i++){
            if(!l1.contains(a[i])){
                l1.add(a[i]);
            }
        }
        System.out.println(s);
        System.out.println(l1);
        System.out.println();
    }

}