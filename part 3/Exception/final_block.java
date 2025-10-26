public class final_block {
    public static void main(String args[]){
        System.out.println("Planned start");

        int []a={1,2,3};
        try{
            System.out.println(a[0]);

        }
        catch(Exception e){
                System.out.println("Tabrez sir"+e);
        }
        // finally{
        //     System.out.println("I need to be executed");
        // }
    }
    
}
