import java.util.*;

class Node{
    int data;
    Node address;
}

public class Insert_At_Pos {
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
        int c=0;
        while(temp!=null){
            c++;
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        // Insert at position
        System.out.println("\nEnter the position to insert: ");
        int pos=s.nextInt();

        if(pos>=1 && pos<=c+1){
            if(pos==1){
                System.out.println("Insert at beg");
            }else if(pos==c+1){
                System.out.println("Insert at end");
            }else{
                //insert at pos
                Node n=new Node();
                System.out.println("Enter data to insert: ");
                n.data=s.nextInt();

                temp=head;
                int i=1;
                while(i<pos-1){
                    temp=temp.address;
                    i++;
                }

                //insert in the position
                n.address=temp.address;
                temp.address=n;

                System.out.println("After inserting node at pos: ");
                temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.address;
                }


            }

        }else{
            System.out.println("Enter valid number:");
        }
        





        


    }
    
}
