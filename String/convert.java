import java.util.*;
public class convert {
    public static void main(String args[]){
        char []c={'j','a','v','a'};
        String a=new String(c);
        System.out.println(Arrays.toString(c));
        System.out.println(a);

        System.out.println("\t\tconvert String into char[]  Array()");
        System.out.println("****************************************************************");
        
        String str="Surya";
        char []c1=str.toCharArray();
        System.out.println("String: "+str);
        System.out.println("char Array: "+Arrays.toString(c1));

        System.out.println("\t\t\tconvert String to integer ");
        System.out.println("****************************************************************"); 

        String str1="10";
        String str2="20";

        int res1=Integer.parseInt(str1);
        int res2=Integer.parseInt(str2);
        System.out.println(res1+" "+res2);
        
        


    }
    
}
