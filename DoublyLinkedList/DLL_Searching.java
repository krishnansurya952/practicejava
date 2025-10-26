import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
}

public class DLL_Searching {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){
        Node head,tail;
        head=tail=null;
        while(true){
            Node n=new Node();
            System.out.print("\nEnter the data: ");
            n.data=s.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                n.prev=tail;
                tail=n;

            }System.out.print("\n\t\tDo you want to createa another node: \n1)Yes\n2)No ");

            System.out.print("\nEnter the choice: ");
            int ch=s.nextInt();
            if(ch!=1){
                break;
            }
        }

        System.out.println("\n\t\tData Present in the LinkedList: ");

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

        System.out.println("\n\t\tAfter sorting ....");

        for(Node t1=head;t1!=null;t1=t1.next){
            for(Node t2=t1.next;t2!=null;t2=t2.next){
                if(t1.data>t2.data){
                    int t=t1.data;
                    t1.data=t2.data;
                    t2.data=t;
                }
            }
        }
        // System.out.println("\n\t\t")
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        // System.out.print("null");
    }
    
}
