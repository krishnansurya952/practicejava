package Abstraction.Interface.Tabrez;


//! Service specifier
abstract class Keyboard{
    int price;
    Keyboard(){}
    Keyboard(int price){
        this.price=price;
        System.out.println(price);
    }
    abstract public void enter();
    
    public void pressQ(){
        System.out.println("Q is printed...");
    }
    public void pressJ(){
        System.out.println("J is printed...");
    }

}
class Image extends Keyboard{
    Image(){
        super(500);
    }
    public void enter(){
        System.out.println("Image selected...");
    }
}
class Notepad extends Keyboard{
    Notepad(){
        super(800);
    }
    public void enter(){
        System.out.println("Going to NextLine...");
    }
}

//! End User
public class Nanda {
    public static void main(String args[]){
        Keyboard k1=new Image();
        Keyboard k2=new Notepad();
        k1.enter();
        k2.enter();

    }  
}
