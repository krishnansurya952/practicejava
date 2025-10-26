import java.util.*;


public class s1{
    public static void main(String args[]){
        Set s=new HashSet();
        s.add(10);
        s.add(null);
        s.add(2);
        s.add(22);
        s.add("Java");
        s.add(null);
        System.out.println(s);
    }
}