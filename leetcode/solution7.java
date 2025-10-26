public class solution7{
    public static int reverse(int a){
        int temp=0;
        while(a<0){
            temp=(temp*10)+a%10;
            a/=10;
            
        }
        while(a>0){
            
            
            temp=(temp*10)+a%10;
            a/=10;
            
            System.out.println(temp);

        }





        return temp;
    }
    public static void main(String args[]){
        int x=-123;
        int res=reverse(x);
        System.out.println(res);




    }
}