import java.util.*;

class Node{
    int data;
    Node address;
}


public class Stack_LinkedList {
    static Scanner s=new Scanner(System.in);

    static Node top=null;
    public static void creation(){
        Node n=new Node();
        System.out.print("\n\t\tSuccessfully created Node..");
        System.out.print("\nEnter the data: ");
        n.data=s.nextInt();
        if(top==null){
            top=n;
        }else{
            n.address=top;
            top=n;

        }
    }
    public static void delete(){
        if(top==null){
            System.out.print("\n\t\tStack is Empty");
        }else{
            System.out.print("\n\t\tDeleted data is: "+top.data);
            top=top.address;
        }
    }

    public static void display(){
        System.out.println("\n\t\tData Present in the stack: ");
        Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.address;
		}
    }

    public static void peek(){
        if(top==null){
            System.out.print("\n\t\tStack is empty");
        }else{
            System.out.print("\n\t\tTop most data: "+top.data);
        }
    }
    public static void isEmpty(){
        if(top==null){
            System.out.print("\n\t\tStack is Empty");
        }else{
            System.out.print("\n\t\tStack is not Empty");
        }
    }


    public static void main(String args[]){

        boolean flag=true;
        do{
            System.out.print("\n\n\t\tWelcome to Stack Using Linked List");
            System.out.print("\n1)Create and Insert\n2)Delete\n3)Display\n4)peek\n5)isEmpty\n6)Exit");

            System.out.print("\nEnter the choice: ");
            int ch=s.nextInt();
            switch(ch){
                case 1:{
                    creation();
                    break;
                }
                case 2:{
                    delete();
                    break;
                }case 3:{
                    display();
                    
                }break;
                case 4:{
                    peek();
                    break;

                }case 5:{
                    isEmpty();
                    break;
                }case 6:{
                    System.out.print("\n\n\t\tThank You...");
                    flag=false;
                    break;
                }default:{
                    System.out.println("\n\t\tInvalid Choice..");
                }
            }

        }while(flag);
        

    }
    
}
