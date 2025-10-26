/*  spyNumber
 * spyNumber is the sum and product is equal then we can say that spy number
 *  number=123  ----> sum=1+2+3=6 product=1*2*3=6
 * both are equal it means that spy number
 */



public class spyNumber {
    public static void main(String args[]){
        int number=132;
        int lastdigit=0;
        int sum=0;
        int product=1;
        while(number>0){
            sum+=number%10;
            product*=number%10;
            number/=10;
        }
        System.out.println("product: " + product);
        System.out.println("sum: " + sum);
    if(product==sum){
        System.out.println("Spy number");
    }else{
        System.out.println("not a spy number");

    }
}

    
}
