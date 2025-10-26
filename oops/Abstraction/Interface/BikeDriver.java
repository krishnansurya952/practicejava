//! only static methods of an interface is not inherited


package Abstraction.Interface;

interface Bike{

    void display();

}
class Rx implements Bike{
    public void display(){
        System.out.println("From Rx");
    }
}

public class BikeDriver {
    public static void main(String args[]){

        // Bike b1=new Bike(); C.T.E ----->  solution [upcasting ,downcasting]

        Rx r1=new Rx();
        r1.display();
        // System.out.print(r1.display());

        Bike b1=new Rx();//upcasting
        b1.display();

    }
    
}
