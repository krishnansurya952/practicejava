import java.util.*;
//input = a13b2c12d4
//output=   aaaaaaaaaaaaa
        //  bb
        //  cccccccccccc
        //  dddd


public class taskS5 {
    public static void main(String args[]){
        String s="a12b10c2d4";
        solve(s);

    }
    public static void solve(String s){
        char []a=s.toCharArray();
        String number="";
        for(int i=1;i<a.length;i++){
            if(a[i]>='0' && a[i]<='9'){
                number+=a[i];
            }else{
                number+=" ";
            }
        }
        int x=0;
        System.out.println(number);
        String sp[]=number.split(" ");
        System.out.println(Arrays.toString(sp));
        String ans="";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                for(int j=1;j<=Integer.parseInt(sp[x]);j++){
                    ans+=a[i];
                }
                ans+="\n";
                x++;
                
            }
        }
        System.out.println(s);
        System.out.println(ans);
    }
    
}
