import java.util.*;
public class S4 {
    public static void main(String args[]){
        Set set=new TreeSet();
        set.add("babu");
        set.add("suresh");
        set.add("surya");
        set.add("Zain");
        set.add("Zain");
        System.out.println(set);
        Set bag1=new TreeSet();
        bag1.add(10);
        bag1.add(23);
        bag1.add(1);
        bag1.add(23);
        bag1.add(74);
        // bag1.add("surya");// classcastException
        System.out.println(bag1);
    }
    
}
