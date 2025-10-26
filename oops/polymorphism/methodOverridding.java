//! method Overridding

// If super class and sub class having same non static method
// with same signature but different implementation then it is known as method Overridding.




package polymorphism;
class A2B{
    public void getBreakFast(){
        System.out.println("Masla Dosa");
    }
}
class Shambu extends A2B{

}
class Tabrez extends A2B{
    public void getBreakFast(){
        System.out.println("Chicken Biryani");
    }
}
















class Ram{
    public void property(){
        System.out.println("gold+car+amount");
    }
    public void marriage(){
        System.out.println("hey sheela ,please marry Tabrez sir");
    }

}
class Sheela extends Ram{
    public void marriage(){//method overridding
        System.out.println("no papa, i will marry shambu");

    }
}























class Ajay{
    public void print(){
        System.out.println("hello from ajay");
    }

}
class Vijay extends Ajay{
    public void print(){
        System.out.println("hello from vijay");
    }
}


public class methodOverridding {
    public static void main(String args[]){
        // Shambu s1=new Shambu();
        // s1.getBreakFast();
        // Tabrez t1=new Tabrez();
        // t1.getBreakFast();





        // Ram r1=new Sheela();//upcasting
        // r1.marriage();
        // r1.property();
        // Sheela s1=(Sheela)r1;//downcasting
        // s1.marriage();
        // s1.property();
        // Ram r2=new Ram();
        // r2.marriage();
        // r2.property();






        Ajay a=new Vijay();
        a.print();

        Vijay v=(Vijay)a;
        v.print();




    }
    
}
