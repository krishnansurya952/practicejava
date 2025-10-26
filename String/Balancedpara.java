import java.util.*;
public class Balancedpara{
    
        public static  boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
    
            for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);
                if (!stack.isEmpty()) {
                    char last = stack.peek();
                    if (isPair(last, cur)) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(cur);
            }
    
            return stack.isEmpty();        
        }
    
        private static boolean isPair(char last, char cur) {
            return (last == '(' && cur == ')') ||
                   (last == '{' && cur == '}') ||
                   (last == '[' && cur == ']');
        }    
    
    // public static String isStringBalanced(String s){
    //     String open="",closed="";
    //     char a[]=s.toCharArray();
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]=='{'|| a[i]=='('||a[i]=='['){
    //             open=open+a[i];
    //         }else if(a[i]=='}'||a[i]==')'||a[i]==']'){
    //             closed=closed+a[i];
    //         }
    //     }
    //         char []ch1=open.toCharArray();
    //         char []ch2=closed.toCharArray();
    //         // Arrays.sort(ch1);
    //         // Arrays.sort(ch2);
    //         // System.out.println(Arrays.toString(ch1));
    //         // System.out.println(Arrays.toString(ch2));

    //         if(ch1.length!=ch2.length){
    //             return "not Balanced";
    //         }
    //         for(int i=0,j=ch2.length-1;i<ch1.length;i++,j--){
    //             if(!(ch1[i]=='[' && ch2[j]==']'||ch1[i]=='{' && ch2[j]=='}'||ch1[i]=='(' && ch2[j]==')')){
    //                 return "not Balanced";
    //             }

    //         }
        


    //     return "balanced";
    // }

    public static void main(String args[]){
        String s="[{()}]";
        String s1="(){}[]";
        System.out.println(s);
        boolean res=isValid(s);
        System.out.println(res);
        // String res=isStringBalanced(s1);
        // System.out.println(res);
    }
}