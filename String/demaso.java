//finding the targeted element in the 


public class demaso{
    public static void main(String atgs[]){
        // System.out.println("hello world!");
        int arr[]={1,4,45,6,10,8};

        int target=13;
        // System.out.println("hello world");

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==13){
                        System.out.println("Finded");
                        System.out.print("elements: "+arr[i]+" "+arr[j]+" "+arr[k]+" ");
                        System.out.print("index: "+i+" "+j+" "+k+" ");
                    }
                

                }
            }
        }
    }
}