import java.util.*;
//write a java program to convert String into char array

public class charArray {
    public static void main(String args[]){
        String s="java";
        char[] a=new char[s.length()];
        for(int i=0;i<a.length;i++){
            a[i]=s.charAt(i);
        }
        System.out.println("String : "+s);
        System.out.println("char: "+Arrays.toString(a));
    }

    
}
