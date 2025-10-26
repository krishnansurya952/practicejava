//! how to create static methods

// Inherit can't herit from the class

//! Reason
// Class has concrete non static method, so class can't be a parent to the interface.

//! notes
// Inside the interface constructor and multi line initialize not allowed.



package Abstraction.Interface;

interface Demo{
    public static void display(){
        System.out.println("good morning");
    }
}

public class question {
    public static void main(String args[]){
        System.out.println("main start");
        Demo.display();
        System.out.println("main end");
    }
    

