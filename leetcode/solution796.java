public class solution796{
   public static void main(String args[]){
    String s = "abcde", goal = "cdeab";
    
    boolean res=rotateString(s,goal);
    System.out.println(res);
   } 
   public static boolean rotateString(String s,String goal){
    if(s.length()!=goal.length()){
        return false;
    }
    return(s+s).contains(goal); 

   }
}