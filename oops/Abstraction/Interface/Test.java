package Abstraction.Interface;


interface I1{
    void m1();
}
interface I2{
    void m1();
}
class A implements I1,I2{
    public void m1(){
        System.out.println("From child class");
    }
}

public class Test {
    public static void main(String args[]){

        // I1 i1=new I1(); C.T.E
        // I2 i2=new I2(); C.T.E

        A a=new A();
        a.m1();

        I1 i1=new A();
        i1.m1();

        I2 i2=new A();
        i2.m1();


        //! use the extends first and then implements

    }
}
