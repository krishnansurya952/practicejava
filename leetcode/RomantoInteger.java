import java.util.*;
public class RomantoInteger {
    public static  int romanToInt(String s) {
        char c[]=s.toCharArray();

        int ans=0;
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        for(int i=0;i<c.length;i++){
            if(c[i]=='I'){
                ans+=I;
            }else{
                ans-=I;
            }
                
                
            if(c[i]=='V'){
                ans+=V;
            }
            else{
                ans-=V;
            }if(c[i]=='X'){
                ans+=X;
            }
            else{
                ans-=X;
            }
            if(c[i]=='L'){
                ans+=L;
            }
            else{
                ans-=L;
            }
            if(c[i]=='C'){
                ans+=C;

            }
            else{
                ans-=C;
            }
            if(c[i]=='D'){
                ans+=D;
            }
            else{
                ans-=D;
            }
            if(c[i]=='M'){
                ans+=M;
            }else{
                ans-=M;
            }

        }


       return ans; 
    }
    public static void main(String args[]){
        String s="MCMXCIV";
        int res=romanToInt(s);
        System.out.println(res);


    }
    
}
