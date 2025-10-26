import java.lang.Thread;
import java.util.*;


public class uncheckedTest{
    public static void main(String args[]) throws Exception{
        System.out.println("Program starts");
        // System.out.println(10/0);
        Thread.sleep(1000);
        System.out.println("Planned stop");
    }
}