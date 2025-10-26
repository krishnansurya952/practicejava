//! Variable Shadowing

//If superclass and subclass having same variable name with different value then it is known variable shadowing

package polymorphism;
class Raja{
    int a=10;
}class Rani extends Raja{
    int a=20;
}

public class variableShadowing {
    public static void main(String args[]){
        Raja r1=new Rani();//upcasting  (Raja r1) is a reference type  (new Rani) is a object type
        System.out.println(r1.a);
        Rani r2=(Rani)r1;//downcasting
        System.out.println(r2.a);
        System.out.println(r1.a);

        //! In variable shadowing we are getting the output based on the reference type.




        
    }
    
}
