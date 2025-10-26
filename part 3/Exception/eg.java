// import java.io;

import java.io.IOError;
import java.io.IOException;

public class eg {
    public static void main(String args[]){
        
        System.out.println("Planned start");

        try{
             throw new ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("Handle by arithmetic catch block");
        }catch(IOException e){
            System.out.println("Handle by IOException catch block");

        }
        System.out.println("Planned End");
    }
    
}
