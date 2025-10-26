import java.util.*;


class Node{
    int data;
    Node address;
}


public class Creation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Node head=null;
        Node tail=null;

        while(true){
            Node n=new Node();
            System.out.print("Enter the integer data: ");
            n.data=s.nextInt();
            System.out.println("N: "+n);
            // n is address like ox1,ox2...oxn

            if(head==null){
                head=n;
                tail=n;
            }
            //head is a constant
            
            else{
                tail.address=n;//ox1.address=ox2
                //update tail vaiable 
                tail=n;// tail=0x2
            }

            System.out.println("\t\tDo you want to create node\n1)yes\n2)no");

            System.out.println("Select the input:  ");
            int input=s.nextInt();
            if(input!=1){
                break;
            }

        }
        System.out.print("Head: "+head.data+"\nTail: "+tail.data);
        System.out.println("\n------------------------------------  ");
        System.out.println("Data Present in List are: ");

        Node temp=head;
        while(temp!=null){
            // System.out.print(temp.address+" ");
            System.out.print(temp.data+" ");
            temp=temp.address;
        }
        temp=tail;
        System.out.println("\t\tData presetnin list are in reversed order: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp.address=temp;
        }


    }
}