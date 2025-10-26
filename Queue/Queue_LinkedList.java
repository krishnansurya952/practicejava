import java.util.*;

class Node{
    int data;
    Node address;
}


public class Queue_LinkedList {
    static Scanner s=new Scanner(System.in);
    static Node front,rear=null;
    public static void create_enqueue(){
        Node n=new Node();
        System.out.print("\n\t\tNode Created successfully");
        System.out.print("\n\t\tEnter the data");
        n.data=s.nextInt();

        if(front==null){
            front=n;
            rear=n;
        }else{
            rear.address=n;
            rear=n;
        }
    }
    public static void dequeue(){
        if(front==null){
            System.out.print("\n\t\tQueue is Empty...");
        }else if(front==rear){
            System.out.print("\n\t\tDelete Node is: "+front.data);
            front=rear=null;
        }else{
            System.out.print("\n\t\tDelete Node is:"+front.data);
            front=front.address;
        }
    }
    public static void display(){
        if(front==null){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.print("\n\t\tData present in Queue: ");
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.address;
            }
            System.out.println();
        }

    }
    public static void peek(){
        if(front==null){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.print("\n\t\tTop most data is: "+front.data);
        }
    }
    public static void isEmpty(){
        if(front==null){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.print("\n\t\tQueue is Not Empty");
        }
    }
    public static void main(String args[]){
        boolean flag=true;
        do{
            System.out.print("\n\t\tWelcome to Queue Using Linked List");
            System.out.print("\n\1)create_enqueue\n2)dequeue\n3)display\n4)peek\n5)isEmpty\n6)Exit");
            System.out.print("\n\t\tEnter the choice: ");
            int ch=s.nextInt();
            switch(ch){
                case 1:{
                    create_enqueue();
                    break;
                }
                case 2:{
                    dequeue();
                    break;
                }
                case 3: {
                    display();
                    break;
                }
                case 4:{
                    peek();
                    break;
                }
                case 5:{
                    isEmpty();
                    break;
                }
                case 6:{
                    System.out.print("\n\t\tThank you...");
                    flag=false;
                    break;
                }
                default:{
                    System.out.print("\n\t\tInvalid input");
                }
            }
        }while(flag);

    }
    
}
