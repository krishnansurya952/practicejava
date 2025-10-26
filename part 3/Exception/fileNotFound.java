

import java.io.FileNotFoundException;
import java.io.IOException;

public class fileNotFound {
    


    /* Propagation of unchecked Exception */
    public static void main(String args[]){
        System.out.println("Hello");
        try{
            m1();

        }catch(Exception e){
            System.out.println("Handled in main");
        }System.out.println("End");
    }
    public static void m1(){
        System.out.println("Earth");
        m2();
        System.out.println("Vernus");
    }
    public static void m2(){
        System.out.println("MArs");
        System.out.println(4/0);
        System.out.println("Juipter");
        
    }










/*  program is about propagation of checked Exception

public static void main(String args[]){
        System.out.println("Hello");
        try{
            m1();

        }catch(Exception e){
            System.out.println("Handled in main");
        }System.out.println("End");
    }
    public static void m1()throws FileNotFoundException{
        System.out.println("Earth");
        m2();
        System.out.println("Vernus");
    }
    public static void m2()throws FileNotFoundException{
        System.out.println("MArs");
        throw new FileNotFoundException();
        
    }



*/












}
    
    

