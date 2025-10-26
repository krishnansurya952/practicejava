import java.util.*;

class Node{
    int data;
    Node address;
}

public class Insert_At_beg {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){

        Node head=null,tail=null;
        while(true){
            Node n=new Node();
            System.out.print("Enter the data: ");
            n.data=s.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.address=n;
                tail=n;
            }
            System.out.println("\n\t Do you want to create a new node\n1.Yes\n2.No");
            System.out.print("\nEnter 1 or 2: ");
            int input=s.nextInt();
            if(input!=1){
                break;
            }
        }

        System.out.println("head: "+head.data);
        System.out.println("tail: "+tail.data);
        System.out.println("-------------------------------------");
        System.out.println("present int the linkedlist");

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        // Insert at begin
        Node n=new Node();
        System.out.println("Insert at beg: ");
        n.data=s.nextInt();
        n.address=head;
        head=n;
        System.out.println("After the ..");


        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }







        


    }
    
}
