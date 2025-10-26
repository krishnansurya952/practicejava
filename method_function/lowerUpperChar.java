package method_function;

public class lowerUpperChar {
    
    public static int toLower(char c){
        return (c+32);
    }
    public static int toUpper(char c){
        return c-32;
    }
    public static void main(String args[]){
        int a=toUpper('a');
        int b=toLower('B');
        System.out.println((char)a);
        System.out.println((char)b);
    }


































    // public static char toLower(char c){
    //     return (char)(c+32);
    // }
    // public static char toUpper(char c){
    //     return (char)(c-32);
    // }
    // public static void main(String args[]){
    //     char a=toUpper('a');
    //     char b=toLower('B');
    //     System.out.println(a);
    //     System.out.println(b);
    // }
    
}
