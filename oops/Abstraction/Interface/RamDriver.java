package Abstraction.Interface;

interface Sheela{
    void m1();

}
interface laila{
    void m2();

}
class Mala{
    public void m3(){
        System.out.println("hi from mala");
    }
}

class Ram extends Mala implements Sheela,laila{
    public void m1(){
        System.out.println("hi from ram1");
    }
    public void m2(){
        System.out.println("hi from ram2");
    }
    public void m3(){
        System.out.println("hi from ram3");
    }

}
public class RamDriver {
    public static void main(String args[]){
        Ram r1=new Ram();
        r1.m1();
        r1.m2();
        r1.m3();
        Mala m1=new Mala();
        m1.m3();
        Mala m2=new Ram();
        m2.m3();
        
    }
    
}
