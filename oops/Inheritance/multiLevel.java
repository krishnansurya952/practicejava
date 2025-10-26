//! Multi level Inheritance
//  One parent class is havaing more than one child class at the different level then it is known multi level inheritance.

class WhatsAppv1{
    public void msg(){
        System.out.println("you can send a message");
    }
}
class WhatsAppv2 extends WhatsAppv1{
    public void audiocall(){
        System.out.println("you can make a audiocall");
    }
}
class WhatsAppv3 extends WhatsAppv2{
    public void videocall(){
        System.out.println("you can make a videocall");
    }
}

public class multiLevel {
    public static void main(String args[]){
        WhatsAppv3 v3=new WhatsAppv3();
        v3.videocall();
        v3.audiocall();
        v3.msg();
        WhatsAppv2 v2=new WhatsAppv2();
        v2.audiocall();
        v2.msg();
        WhatsAppv1 v1=new WhatsAppv1();
        v1.msg();





    }
    
}
