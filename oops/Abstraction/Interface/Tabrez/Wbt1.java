package Abstraction.Interface.Tabrez;


// ! Service Specifier
abstract class Vehicle{
    String name;
    Vehicle(){}
    Vehicle(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("Vehicle is running...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");

    }
    abstract public void changeGear();
}

// ! Service provider

class Bike extends Vehicle{
    Bike(String s){
        super(s);
    }
    public void changeGear(){
        System.out.println("Gear changed...");
    }
}

//! End User

public class Wbt1 {
    public static void main(String args[]){

        Vehicle v=new Bike("TVS-XL");
        v.run();
        v.stop();
        v.changeGear();
        System.out.println("Bike name: "+v.name);

    }
    
}
