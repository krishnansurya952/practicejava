//! Method shadowing 

// If super class and sub class having same methods with same signature but different implementation then it is knwon as method shadowing.

package polymorphism;

class Qsp{
    public static void msg(){
        System.out.println("all the best from Qsp");
    }

}
class  Jsp extends Qsp{
    public static void msg(){
        System.out.println("all the best from Jsp");
    }

}





public class methodShadowing {
    public static void main(String args[]){
        Qsp q1=new Jsp();//upcasting
        q1.msg();
        Jsp j1=(Jsp)q1;
        j1.msg();


    }
    
}
