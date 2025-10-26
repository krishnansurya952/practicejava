import java.util.*;

class Node{
    int data;
    Node address;
}



public class CircularLinkedList{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Node head=null;
        Node tail=null;

        while(true){
            Node n=new Node();
            System.out.print("\nEnter the data: ");
            n.data=sc.nextInt();

            if(head==null){
                head=n;
                tail=n;

            }else{
                tail.address=n;
                tail=n;

            }
            System.out.print("\n\t\tDo you want to create a new Node:\n1)Yes\n2)No");
            System.out.print("\nEnter the choice: ");
            int ch=sc.nextInt();

            if(ch!=1){
                break;
            }
            
        }
        tail.address=head;
        System.out.println("\n\t\tData Present in the circular linked list: ");
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.address;
        }while(temp!=head);

        System.out.println("\nhead.data: "+head.data+"-->   tail.address.data: "+tail.address.data);
        if(head==tail.address){
            System.out.print("\nCircular List");
        }else{
            System.out.println("\nIts not a Circular Linked list");
        }

    }
}