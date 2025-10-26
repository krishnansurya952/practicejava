import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
}


public class DLL_Search {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[]){
        Node head,tail;
        head=tail=null;
        while(true){
            Node n=new Node();
            System.out.print("\nEnter the Data: ");
            n.data=s.nextInt();

            if(head==null){
                head=n;
                tail=n;

            }else{
                tail.next=n;
                n.prev=tail;
                tail=n;

            }
            System.out.print("\n\t\tDo you want to creat a node:\n1)Yes\n2)No");
            System.out.print("\nEnter the choice: ");
            int ch=s.nextInt();
            if(ch!=1){
                break;
            }

        }
        Node temp=head;
        System.out.println("\n\t\tData present in LinkedList: ");

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");



        System.out.print("\nEnter the element to search: ");
        int n=s.nextInt();
        boolean flag=false;

        for(Node i=head;i!=null;i=i.next){
            if(i.data==n){
                flag=true;
            }
        }
        if(!flag){
            System.out.println("\nElement not present");
        }else{
            System.out.print("\nElement present");          
        }

    }
    
}
