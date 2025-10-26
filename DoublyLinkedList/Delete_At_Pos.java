import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
}



public class Delete_At_Pos {
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
            System.out.print("\n\t\tTo create a another node\n1)Yes\n2)No");
            System.out.print("\nEnter the choice: ");
            int ch=sc.nextInt();

            if(ch!=1){
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



        //Delete node at pos
        System.out.print("\nEnter the Position to delete: ");
        int pos=sc.nextInt();
        if(pos>=1 && pos<=c+1){
            if(pos==1){
                System.out.print("\nDelete at begin");
            }else if(pos==c+1){
                System.out.print("\nDelete at end");
            }else{
                Node t1=head;
                int i=1;

                //del pos +1
                while(i<=pos){
                    t1=t1.next;
                    i++;
                }
                // del pos -1
                Node t2=head;
                int j=1;
                while(j<pos-1){
                    t2=t2.next;
                    j++;
                }
                t1.prev=t2;
                t2.next=t1;

            }

        }else{
            System.out.println("\nInvalid position");
        }
        temp=head;
        // int c=0;
        while(temp!=null){
            // c++;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

    }
    
}
