public class DecimaltoBinary {
    public static void main(String args[]){
        int number=13,x=1,sum=0;
        for(int i=number;i>0;x*=10){
            sum+=(i%2)*x;
            i/=2;
        }
        System.out.println("Decimal: "+number);
        System.out.println("Binary: "+sum);
    }
    
}
