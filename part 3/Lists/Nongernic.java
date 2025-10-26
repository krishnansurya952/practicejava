//Non gernic collection
import java.util.*;
class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return " \nId: "+id+" Name: "+name+"";
    }
}

public class Nongernic {
    public static void main(String args[]){
        List ls=new ArrayList();
        ls.add(0);
        ls.add(true);
        ls.add("surya");
        System.out.println(ls);//--->Non gernice collection.
        System.out.println("**********************************");
        List<Integer> bag1=new ArrayList();
        bag1.add(2);
        bag1.add(5);
        bag1.add(6);
        System.out.println(bag1);

        System.out.println("**********************************");
        List<Student> s=new ArrayList();
        s.add(new Student(1,"Dinga"));
        s.add(new Student(1,"surya"));
        s.add(new Student(3,"Anjana"));
        System.out.println(s);
    }
    
}
