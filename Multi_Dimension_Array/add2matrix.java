package Multi_Dimension_Array;

public class add2matrix {
    public static void main(String args[]){
        int arr[][]={{1,4,6},{2,0,5},{3,2,4}};
        int arr1[][]={{2,0,1},{1,6,2},{4,4,2}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr[i][j]+arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
