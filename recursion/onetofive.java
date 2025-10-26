package recursion;

public class onetofive {
    public static void solve(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        solve(n-1);
        return;

    }
    public static void main(String args[]){

        System.out.println("hello");
        solve(5);
    }
    
}
