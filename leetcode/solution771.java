import java.util.*;
public class solution771 {
    public static void main(String args[]){
        String jewels = "aA", stones = "aAAbbbb";
        int res=numJewelsInStones(jewels,stones);
        System.out.println(res);

    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[]a=jewels.toCharArray();
        char []b=stones.toCharArray();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                count++;
            }
        }
        
        
        return count;
        
    }
    
}
