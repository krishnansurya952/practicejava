// package String;
import java.util.*;

public class intro {
    public static void main(String args[]){
        String s1="Surya";
        String s2=new String("Ajeeth");
        StringBuffer s3=new StringBuffer("ArunSalem");
        StringBuilder s4=new StringBuilder("SaiBoopathi");
        String ss1="jspider";
        String ss2="      qspidervadapalanic                   ";
        System.out.println(s1+" "+s2+" "+s3+" "+s4);

        // ! length() function
        System.out.println("\t\t\tlength()");
        System.out.println("****************************************************************");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(s4.length());

        // ! charAt()
        System.out.println("\t\t\tcharAt()");
        System.out.println("****************************************************************");

        for(int i=0;i<s1.length();i++){
            System.out.print(s4.charAt(i)+"   ");
        }
        System.out.println();

        // ! toLowerCase()
        System.out.println("only used in String property");
        System.out.println("\t\t\ttoLowerCase()");
        System.out.println("****************************************************************");     

        System.out.println(s2+"  -->  "+s2.toLowerCase());

        // ! toUpperCase()
        System.out.println("\t\t\ttoUpperCase()");
        System.out.println("****************************************************************");     

        System.out.println(ss1.toUpperCase());

        // ! trim()  
        // trim  in java removes white space from both end of the string.
        System.out.println("\t\t\ttrim()");
        System.out.println("****************************************************************"); 
        System.out.println(ss2.trim());  
        
        


        // ! concat()
        System.out.println("\t\t\tconcat()");
        System.out.println("****************************************************************"); 
        String ss4="Sai";
        String ss5="boopathi";
        System.out.println(ss4.concat(ss5));


        // ! contains()
        // return boolean value  //? check sequence of character are present inside a string
        System.out.println("\t\t\tcontains()");
        System.out.println("****************************************************************"); 
        

        String str1="hello";
        System.out.println(str1.contains(" "));
        System.out.println(str1.contains("hello"));

        //! compare()
        // == we cant used in String that's use .equals()
        System.out.println("\t\t\tequals()");
        System.out.println("****************************************************************"); 
        
        String a1="surya";
        String a2="surya";
        String a3="Surya";
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        



    }
    
}
