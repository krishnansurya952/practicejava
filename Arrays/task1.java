/* Write a java program the duplicate elements and find nth largest and nth smallest value */
import java.util.*;

public class task1 {
    static Scanner sc=new Scanner(System.in);
    public static int[] removeDup(int arr[]){
        Arrays.sort(arr);
        
        // System.out.println(Arrays.toString(arr));
        int b[]=new int [arr.length];
        int x=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                b[x++]=arr[i];
            }
            
        }
        b[x++]=arr[arr.length-1];
        int res[]=new int[x];
        for(int i=0;i<res.length;i++){
            res[i]=b[i];
        }
        return res;
        
    }
    public static void main(String args[]){
        int arr[]={8,4,3,1,7,8,1};       

        System.out.println(Arrays.toString(arr));
        int res[]=removeDup(arr); 
        // System.out.println("removeDup");
        // System.out.println(Arrays.toString(res));

               
        boolean flag=true;
        do{
            System.out.println("\n\t\t\tSelect the input:-");
            System.out.println("1.ToSort the arrays first\n2.removeDup\n3.nth largest\n4.nth smallest\n5.Exit");
            int input=sc.nextInt();
            switch(input){
                case 1: {
                    Arrays.sort(arr);
                    System.out.print("\t\t\tSorted Arrays:");
                    
                    System.out.print(" "+Arrays.toString(arr));
                    break;
                }
                case 2: {
                    
                    System.out.print("\t\tRemoved duplicate: ");
                System.out.print(" "+Arrays.toString(res));
                    break;
                }

                case 3:{
                    System.out.print("\t\t\tEnter n: ");
                    int n=sc.nextInt();
                    if(n<res.length)
                        System.out.println("\t\t\tthe largest is:"+res[res.length-n]);
                    else
                        System.out.println("Invalid");
                    
                    break;
                }
                case 4:{
                    System.out.print("\t\t\tEnter n: ");
                    int n=sc.nextInt();
                    if(n<res.length)
                        System.out.println("\t\t\tthe smallest is:"+res[n-1]);
                    else
                        System.out.println("Invalid");
            
                    break;
                }
                case 5:{
                    flag=false;
                    System.out.println("\t\tSuccessfully Exit");
                    break;
                }
            }

        }while(flag);
        
        

    }
    
}
