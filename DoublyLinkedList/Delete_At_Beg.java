import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

}


public class Delete_At_Beg {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Node head,tail;
        head=tail=null;

        while(true){
            Node n=new Node();
            System.out.print("\n Enter the data: ");
            n.data=sc.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                n.prev=tail;
                tail=n;
            }
            System.out.println("\n\t\tDo you want creat a new Node\n1)Yes\n2)No");
            System.out.println("Enter the Choice: ");
            int choice=sc.nextInt();
            if(choice!=1){
                break;
            }


        }
        System.out.println("\n\t\tData presented in the list: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

        //Delete Node at Beg
        head=head.next;
        head.prev=null;
        System.out.println("\n\t\tAfter Deleting Node at begin");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");


    }
    
}
