import java.util.Arrays;

public class longestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans =new StringBuilder();
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        System.out.println("length:"+strs.length);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
            System.out.println("answer " + ans);
        }
        return ans.toString();
        
    }

        
    
    public static void main(String args[]){
        String[] strs = {"flower","flow","flight"};

        String s=longestCommonPrefix(strs);
        System.out.println(s);


    }
    
}
