import java.util.*;


class Node{
    int data;
    Node address;
}
public class Solution{
    public static void main(String args[]){
        System.out.println("Hello world");


        Scanner sc=new Scanner(System.in);

        Node head=null,tail=null;
       

        while(true){
            Node n=new Node();

            System.out.print("Enter the data: ");
             n.data=sc.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.address=n;
                tail=n;
            }
            System.out.println("\t\tDo you want to create a new node\n1)yes\n2)no");
            System.out.print("Enter the input 1 or 2: ");
            int input=sc.nextInt();


            if(input==1){
                continue;
            }else if(input==2){
                break;
            }else {
                System.out.println("Invalid input: ");
                System.out.println("\t\tThat's why exit");
                break;
            }
        }
        System.out.println("head.data: "+head.data);
        System.out.println("tail.data: "+tail.data);

        System.out.println("List are: ");
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.address;
        }




    }
}