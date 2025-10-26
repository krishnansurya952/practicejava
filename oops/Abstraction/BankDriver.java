package Abstraction;
abstract class Bank{
    abstract public int getRateofInterest();
}
class ICICI extends Bank{
    public int getRateofInterest() {
        return 5;
    }
}
class SBI extends Bank{
    public int getRateofInterest(){
        return 7;
    }
}

public class BankDriver {
    public static void main(String args[]){
        // Bank b2=new Bank();   We can't able to create the object for abstract class.

    //  parent--->child
        Bank b2=new SBI();//upcasting
        System.out.println(b2.getRateofInterest());

        Bank b3=new ICICI();
        System.out.println(b3.getRateofInterest());

    }
    
}
