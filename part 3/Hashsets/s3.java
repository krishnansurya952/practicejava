
import java.util.*;


public class s3{
    public static void main(String args[]){
        Set<String> s=new LinkedHashSet();
        s.add("red");
        s.add(null);
        s.add("yellow");
        s.add("white");
        s.add("red");
        s.add("orange");
        System.out.println(s);
    }
}