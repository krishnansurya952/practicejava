import java.util.*;
public class hello{
    public static void main(String args[]){
        String a="a2b10c11d6e4";
        solve(a);


    }
    public static void solve(String s){
        char []a=s.toCharArray();
        String number="";
        for(int i=1;i<a.length;i++){
            if(a[i]>='0'&&a[i]<='9'){
                number=number+a[i];
            }else{
                number=number+" ";
            }
        }
        System.out.println(number);
        System.out.println(Arrays.toString(a));
        String sp[]=number.split(" ");
        System.out.println(Arrays.toString(sp));
        int x=0;
        String ans="";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a'&& a[i]<='z'){
                for(int j=1;j<=Integer.parseInt(sp[x]);j++){
                    System.out.print(a[i]);
                }
                x++;
                System.out.println();
            }
        }



    }
}