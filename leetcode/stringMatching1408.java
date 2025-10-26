import java.util.ArrayList;
import java.util.List;

public class stringMatching1408 {
    public static void main(String args[]){
        String []s={"mass","as","hero","superhero"};
        List ans=stringMatching(s);
        System.out.println(ans);
    }

    
    public static List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
        
    }
}
    

