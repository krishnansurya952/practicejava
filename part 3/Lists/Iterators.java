//Doging operation like-> ListIterator and for each loop
import java.util.*;
public class Iterators {
   public static void main(String args[]){
    List ls=new ArrayList();
    ls.add(10);
    ls.add(10.36);
    ls.add(2.3);
    ls.add("Surya");
    System.out.println("\t\tList Iterator");
    ListIterator i=ls.listIterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
    System.out.println("\n\t\tfor each loop");
    for(Object o:ls){
        System.out.println(o);
    }
    int a[]={1,2,3,4,5,6,7,8,9,6,2,4,5,2,22,33,45};

    System.out.println("a[]"+Arrays.toString(a));
    System.out.println("\t\tFor each loop");
    for(int j:a){
        System.out.print(j+ " ");
    }
   } 
}
