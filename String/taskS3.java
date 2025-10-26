import java.util.*;
public class taskS3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="the article is attractive and awesome aresting";
        String sp[]=s.split(" ");
        System.out.print("Enter the word: ");
        String s1=sc.next();
        System.out.println(s);
        for(int i=0;i<sp.length;i++){
            if(sp[i].contains("a") && sp[i].contains("t")){
                System.out.println(sp[i]);
            }
        }
        System.out.println(Arrays.toString(sp));
        

    }
    
}
