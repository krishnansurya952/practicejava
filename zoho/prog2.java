import java.util.*;
public class prog2 {
    public static void main(String args[]){
        String a="b31c6d15";
        solve(a);
    }
    public static void solve(String s){
        char[]a=s.toCharArray();
        String number="";
        for(int i=1;i<a.length;i++){
            if(a[i]>='0'&& a[i]<='9'){
                number+=a[i];
            }else{
                number+=" ";
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(number);
        int x=0;
        String sp[]=number.split(" ");
        System.out.println(Arrays.toString(sp));
        String ans="";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a'&&a[i]<='z'){
                for(int j=0;j<=Integer.parseInt(sp[x]);j++){
                    System.out.print(a[i]);
                }
                x++;
            }
        }
        // System.out.println(s);
        // System.out.println(ans);



        
    //     public static void main(String args[]){
    //         Map<Character,Integer> map=new HashMap();
    //         String s="bbbbbbbddbbbbbbbbbbbbbbbbbbbbbbbbbcccccccdddddddddddddddd"; 
    //         for(int i=0;i<s.length();i++){
    //             if(map.containsKey(s.charAt(i))){
    //                 map.put(s.charAt(i),map.get((s.charAt(i)))+1);
    //             }else{
    //                 map.put(s.charAt(i),1);
    //             }
    //         }
    //         System.out.println(map);
    //     }
        
    // }
    }
    
}
