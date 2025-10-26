import java.util.*;

public class solution67 {
    public static String addBinary(String a,String b){
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        StringBuilder sb=new StringBuilder();

        int i=arr1.length-1,j=arr2.length-1;
        int carry=0;
        while(i>=0 || j>=0 ||carry >0){
            int anum=i>=0?arr1[i]-'0':0;
            int bnum=j>=0?arr2[j]-'0':0;

            int sum=anum+bnum+carry;
            int digit=sum%2;
            carry=sum/2;
            i--;
            j--;
            sb.append((char)(digit+'0'));
        }
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        System.out.println(addBinary("11", "1"));
    }
    
}
