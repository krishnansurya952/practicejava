import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
}



public class Insert_At_Beg {
    static Scanner s=new Scanner(System.in);

    public static void main(String args[]){
        Node tail,head;
        head=tail=null;
        while(true){
            Node n=new Node();
            System.out.print("\n Enter the data: ");
            n.data=s.nextInt();
             if(head==null){
                head=n;
                tail=n;
             }else{
                tail.next=n;
                n.prev=tail;
                tail=n;
             }
             System.out.println("\t\tTo create another Node:- \n1)Yes \n2)No");
             System.out.print("Enter the input: ");
             int input=s.nextInt();
             if(input!=1){
                break;
             }
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
       
      //Insert at begin 
        Node n=new Node();
        System.out.println("\n\t\tInsert at begin: ");
        System.out.print("Enter the data: ");
        n.data=s.nextInt();

        head.prev=n;
        n.next=head;
        head=n;




        //printing statement

        temp=head;
        System.out.println("forward Direction");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
        System.out.print("null");

        System.out.println("\nBackward Direction: ");
		temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
        System.out.print("null");

    }
    
}
