import java.util.*;

public class solution58 {
    
        public static int lengthOfLastWord(String s) {
            int end=s.length()-1;
            int k=0;
            while(end>=0 && s.charAt(end)==' '){
                System.out.println("execution end: "+k++);
                end--;
            }
            int s1=0;
            int start=end;
            while(start>=0  && s.charAt(start)!=' '){
                System.out.println("execution start: "+s1++);
                start--;
            }

            
            return end-start;
        }
        public static void main(String args[]){
            String s="Hello World";
            int res=lengthOfLastWord(s);
            System.out.println(res);

        }
    
    
}
