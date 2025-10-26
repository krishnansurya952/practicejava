package method_function;

public class perfectSquare{
    public static int charToAscii(char a){
        return (int)a;
    }
    
    public static boolean isperfectSquare(int a){
        for(int i=1;i<a;i++){
            if(i*i==a){
                return true;
            }
            
        }
        return false;
    }


    public static void main(String args[]){
        int res1=charToAscii('a');
        boolean res=isperfectSquare(25);
        boolean res2=isperfectSquare(30);
        System.out.println("a: "+res1+" res: "+res+" res2: "+res2);
    }
    
}