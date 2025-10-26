import java.util.*;

//input s1=earth s2=heart; anagram
//input s1=Race  s2=care;

public class anagramp1 {
    public static boolean isAnagram(String s1,String s2){
        boolean flag=false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char []a=s1.toCharArray();
        char []b=s2.toCharArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        s1=new String(a);
        s2=new String(b);

        if(s1.equals(s2))
        flag=true;
        else
        flag=false;

        


        return flag;
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the String s1: ");
        String s1=sc.nextLine();
        System.out.print("Enter the String s2: ");
        String s2=sc.nextLine();

        if(isAnagram(s1,s2)){
            System.out.println("Yes, its a Anagram!");
        }else{
            System.out.println("No , not a Anagram! ");
        }

    }
    
}
