import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
}

public class Insert_at_end {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){
        Node head,tail;

        head=tail=null;
        while(true){
            Node n=new Node();
            System.out.print("Enter the data: ");
            n.data=s.nextInt();

            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                n.prev=tail;
                tail=n;

            }
            System.out.println("\t\tTo creat another node: \n1)Yes\n2)No");
            System.out.print("\nEnter the input: ");
            int input=s.nextInt();

            if(input!=1){
                break;
            }

        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");


        //Insert at end

        while(true){
        Node n=new Node();
        
        System.out.print("\n Enter the last data: ");
        n.data=s.nextInt();

        tail.next=n;
        n.prev=tail;
        tail=n;
        System.out.print("\n\t\tdo you want to Insert at the end: \n1)Yes\n2)No ");
        int input=s.nextInt();
        if(input!=1){
            break;
        }
    }

        //print
        System.out.println("Ater insert at the end: ");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");

        System.out.println("\n\t\tBackward Direction: ");
        temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.print("null");


    }
    
}
