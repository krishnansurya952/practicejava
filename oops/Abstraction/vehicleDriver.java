//! Abstraction

// The process of hiding the implementation but providing only important features then it is known as abstraction.

// We can achieve abstraction with help of anstract class and interface.

package Abstraction;

abstract class vehicle{
    abstract public void display();

    
}
class Rx extends vehicle{
    public void display(){
        System.out.println("Rx");
    }
}

public class vehicleDriver {
    public static void main(String args[]){
        Rx r1=new Rx();
        r1.display();

        vehicle v2=new Rx();//upcasting
        v2.display();

        //we can't able to create the object for abstract class.

    }
    
}
