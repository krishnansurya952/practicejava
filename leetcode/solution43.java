
public class solution43{
    public static void main(String args[]){
        String s1="123";
        String s2="2";

        int a=Integer.parseInt(s2);
        int b=Integer.parseInt(s1);
        // System.out.println(a*b);
        int c=a*b;
        StringBuilder sb=new StringBuilder();

        sb.append(c);
        // System.out.println(sb);
        String s=String.valueOf(c);
        System.out.println(s);

        /* class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));        
    }
} */
        
        


    }
}