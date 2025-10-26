public class eg1_notHAndle {
    public static void main(String args[]){
        System.out.println("Main Begins");
        try{
            int c=5/0;
        }catch(NullPointerException e){
            System.out.println("Divisible by zero is not possible");
        }
        System.out.println("main end");
    }
    
}//RTE
