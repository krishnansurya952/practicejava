//! Single level inheritance
//  one parent class is having only one child class the it known as single level inheritance.  (or)
//  Inheritance of only one level the it is said to be single level inheritance.

class Ram{//parent class
    int a=10;

}
class Shella extends Ram{//child class
    int b=20;
}
public class singleLevel{
    public static void main(String args[]){
        Ram r1=new Ram();

        System.out.println(r1.a);
        // System.out.println(r1.b); //! C.T.S.

        Shella s1=new Shella();
        System.out.println(s1.a);
        System.out.println(s1.b);
    }
}