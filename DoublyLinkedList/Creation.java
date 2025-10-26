// package DoublyLinkedList;
import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
}



public class Creation{
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){

        Node head=null;
        Node tail=null;

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

            System.out.println("\t\tDo you wnat to create a another Node:- \n1)Yes \n2)No ");
            System.out.print("\nEnter the input  1 or 2: ");
            int input=s.nextInt();
            if(input!=1){
                break;
            }


        }
        System.out.println("head: "+head.data);
        System.out.println("tail: "+tail.data);
        Node temp=head;
        System.out.println("Its in forward Direction: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        temp=tail;
        System.out.println("\n Its in backward Direction: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }



    }
}