import java.util.*;

class Node{
    int data;
    Node address;
}
public class Delete_At_Beg {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){
        Node head=null,tail=null;

        while(true){
            Node n=new Node();

            System.out.println("Enter the data: ");
            n.data=s.nextInt();
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.address=n;
                tail=n;
            }
            System.out.println("\t\tDo you want to create another node:-\n1)Yes\n2)No");
            int input=s.nextInt();
            if(input!=1){
                break;
            }
        }

        System.out.println("head: "+head.data);
        System.out.println("tail: "+tail.data);
        System.out.println("\t\tPresent the list: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }

        // delete at the begin
        head=head.address;

        System.out.println("\t\tAfter Deleting at the begin: ");
        System.out.println("head: "+head.data);
        System.out.println("tail: "+tail.data);

        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }


        
        

    }
    
}
