import java.util.*;

public class r1{
    public static void main(String args[]){
        String s="Hello";


        List l1=new LinkedList();
        for(int i=0;i<s.length();i++){
            if(!l1.contains(s.charAt(i))){
                l1.add(s.charAt(i));
            }
        }
        System.out.println(s);
        System.out.println(l1);
        System.out.println();

    }
}