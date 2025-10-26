package Abstraction.Interface;

interface Book{
    void m1();
    void m2();
}
class Rams implements Book{
    public void m1(){
        System.out.println("manual");
    }
    public void m2(){
        System.out.println("webtech");
    }
}

public class BookDriver {
    public static void main(String arg[]){
        // Book b1=new Book();
        Book b1=new Rams();//upcasting
        b1.m1();
        b1.m2();



        //! If a class inherit an interface then it should give implementation to the abstract non static methods of an interface.

    }
    
}
