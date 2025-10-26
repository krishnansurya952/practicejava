//Doing operation :- list in add, contains and remove
import java.util.*;
import java.util.Iterator;
public class removes{
    public static void main(String args[]){
        List li=new ArrayList();
        li.add("Surya");
        li.add("surya");
        System.out.println(li);
        List l2=new ArrayList();
        l2.add(li);
        System.out.println(l2);
        List l3=new ArrayList();
        l3.add("surya");
        System.out.println(l3);
        System.out.println(l2.contains(li));
        System.out.println(l3.contains("surya"));
        li.remove(1);
        System.out.println(li);
       
        

    }
}