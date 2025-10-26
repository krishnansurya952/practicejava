import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
}




public class Delete_At_End {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Node head,tail;
        head=tail=null;

        while(true){
            Node n=new Node();
            System.out.print("\nEnter the data: ");
            n.data=sc.nextInt();

            if(head==null){
                head=n;
                tail=n;

            }else{
                tail.next=n;
                n.prev=tail;
                tail=n;
            }
            System.out.print("\n\t\tDo you want to create a new node:\n1)Yes\n2)No");
            System.out.print("\nEnter the Choice: ");
            int ch=sc.nextInt();

            if(ch!=1){
                break;
            }
        }
        Node temp=head;
        System.out.println("\n\t\tData present in the list: ");

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

        // //Delete the begin

        // head=head.next;
        // head.prev=null;

        // System.out.println("\n\t\tDelete at begin");



        //Delete at end

        tail=tail.prev;
        tail.next=null;

        System.out.println("\n\t\tDelete at End");





        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("null");





    }



    
}
