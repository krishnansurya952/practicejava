public class leetcode {
    public static void main(String args[]){
        String a[]={"a","ui","ap"};
        int res=vowelStrings(a,0,2);
        System.out.println(res);
        
    }
    

    public static int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=0;i<=right;i++){
            String word=words[i];
            if(isVowels(word.charAt(0),word.charAt(word.length()-1))){
            // if(isVowels(word.charAt(0)),word.charAt(word.length()-1)))
            count++;
            }
        }
        return count;
        
    }
    public static boolean isVowels(char a, char b){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            return true;
        }
        return false;
    }
}

    

