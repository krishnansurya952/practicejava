package Abstraction.Interface.Tabrez;


//! service specifier
interface Mobile{
    void text();
    void call();

}

//! service provider
class Apple implements Mobile{
    public void text(){
        System.out.println("Texting...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}



// ! end user
public class MobileDriver {
    public static void main(String args[]){
        Mobile m=new Apple();
        m.text();
        m.call();
    }
    
}
