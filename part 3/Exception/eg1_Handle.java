public class eg1_Handle {
    public static void main(String args[]){

        System.out.println("Main Begins");
        try{
            int c=5/0;
        }catch(ArithmeticException e){
            System.out.println("Disivible by zero is not possible");
        }
        System.out.println("Main End");
        
    }
    
}
