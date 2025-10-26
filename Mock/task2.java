package Mock;
import java.util.*;

class Node{
    int data;
    Node address;
}

public class task2 {
    
static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Node head=null;
        Node tail=null;

        while(true){
            Node n=new Node();
            System.out.print("\n\t\tEnter the Data: ");
            n.data=sc.nextInt();

            if(head==null){
                head=n;
                tail=n;

            }else{
                tail.address=n;
                tail=n;
            }
            System.out.print("\n\t\tto create a another node:\n1.Yes\n2.No ");
            int ch=sc.nextInt();
            if(ch!=1){
                break;
            }
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        System.out.print("\n\t\tDeleting last Node: ");
        int i=1;
        temp=head;
        while(i<count-1){
            temp=temp.address;
            
            i++;
        }
        tail=temp;
        tail.address=null;
        System.out.println();

        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }

    }
    
    
}
