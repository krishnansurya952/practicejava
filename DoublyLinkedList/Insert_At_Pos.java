import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;

}

public class Insert_At_Pos {
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
            }
            System.out.println("\n\t\tTo create a new Node: \n1)Yes\n2)No");

            System.out.print("\nEnter the choice: ");
            int choice=s.nextInt();
            if(choice!=1){
                break;
            }         

        }
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("null");


        //Insert new Node Position

        // System.out.print("\nEnter the Position to insert: ");
        // System.out.println("c: "+c);
        // int pos=s.nextInt();
        // if(pos>=1 && pos<=c+1){
        //     if(pos==1){
        //         System.out.println("\nInsert at begin");
        //     }else if(pos==c+1){
        //         System.out.println("Insert at end");
        //     }else{
        //         Node t1=head;
        //         int i=1;
        //         //
        //         while(i<pos){
        //             t1=t1.next;
        //             i++;
        //         }
        //         Node t2=head;
        //         int j=1;
        //         while(j<pos-1){
        //             t2=t2.next;
        //             j++;
        //         }
        //         Node n=new Node();
        //         System.out.print("Enter the data: ");
        //         n.data=s.nextInt();
        //         n.next=t1;
        //         n.prev=t2;
        //         t1.prev=n;
        //         t2.next=n;

        //     }
        // }else{
        //     System.out.println("Invalid pos");
        // }




        //practice 
        System.out.print("\nEnter the position: ");
        int pos=s.nextInt();
        if(pos>=1 && pos<=c+1){
            if(pos==1){
                System.out.println("Insert at begin ");
            }else if(pos==c+1){
                System.out.println("Insert at end");

            }else{
                Node t1=head;
                int i=1;
                while(i<pos){
                    t1=t1.next;
                    i++;
                }
                Node t2=head;
                int j=1;
                while(j<pos-1){
                    t2=t2.next;
                    j++;
                }
                Node n=new Node();

                System.out.print("\nEnter the data: ");
                n.data=s.nextInt();
                n.next=t1;
                n.prev=t2;
                
                t1.prev=n;
                t2.next=n;

                

            }
        }else{
            System.out.println("Invalid position");
        }











        System.out.println("After insert node at the pos: ");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");


    }
    
}
