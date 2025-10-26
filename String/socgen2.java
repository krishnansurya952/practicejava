public class socgen2 {
    public static void main(String args[]){
         int mat[][]={{1,2,3},{4,5,6},{7,8,9}}; 
        int sum=0;
        int len=mat.length;
        System.out.println("length: "+len);
        for(int i=0;i<len;i++){
            
                sum+=mat[i][i];
                sum+=mat[len-1-i][i];
            

            
        }
        if(len%2!=0){
            sum-=mat[len/2][len/2];
        }
        System.out.println(sum);
    }
    
}
