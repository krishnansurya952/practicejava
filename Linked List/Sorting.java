import java.util.*;

class Node{
    int data;
    Node address;

}


public class Sorting {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        Node head=null;
        Node tail=null;

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
            System.out.println("\t\tDo you want to create a another node: \n1)Yes\n2)No");
            System.out.print("Enter the 1 or 2: ");
            int input=s.nextInt();

            if(input!=1){
                break;
            }

        }
        System.out.println("head: "+head.data+"\ntail: "+tail.data);
        System.out.print("All the node list: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        for(Node t1=head;t1!=null;t1=t1.address){
            for(Node t2=t1.address;t2!=null;t2=t2.address){
                if(t1.data>t2.data){
                    int t=t1.data;
                    t1.data=t2.data;
                    t2.data=t;
                }
            }
        }
        System.out.println("After sorting .....");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }

    }
}
