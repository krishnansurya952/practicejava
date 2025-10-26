import java.util.*;
public class HCL{
    public static int user_logic(String s) {
        char c[]=new char[s.length()];
        int right=s.length()-1;
        int left=0;
        // User will write their logic here
        for(int i=s.length()-1;i>=0;i--){
            if(i%2==1){
                c[right]=s.charAt(i);
                right--;

            }else{
                c[left]=s.charAt(i);
                left++;
            }


        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            sb.append(c[i]);
        }
        System.out.println("sb:"+sb);
        System.out.println(s);
        System.out.println("c[]");
        System.out.println(Arrays.toString(c));
        return c.length;  // Placeholder return value
    }
    public static void main(String args[]){
        String s="abccccdd";
        int n=user_logic(s);
        System.out.println("return from :"+n);

    }
}