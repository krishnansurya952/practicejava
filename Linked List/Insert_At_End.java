import java.util.*;

class Node{
    int data;
    Node address;
}

public class Insert_At_End {
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
                tail.address=n;
                tail=n;
            }

            System.out.println("\t\tDo you want to create node\n1)Yes\n2)No");
            System.out.print("Enter the input: ");
            int input=s.nextInt();
            if(input!=1){
                break;
            }



        }
        Node temp=head;
        System.out.println("head: "+head.data+"\ntail: "+tail.data);
        System.out.println("\t\tData present in the list: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }

        // insert at the end

        Node n=new Node();
        System.out.println("Insert at the end: \n");
        System.out.print("Enter the data: ");
        n.data=s.nextInt();
        tail.address=n;
        tail=n;
        System.out.println("After insert at the data the end");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        
        

    }
    
}
