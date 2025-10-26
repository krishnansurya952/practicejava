import java.util.*;

public class Queue_Arr{
    static Scanner s=new Scanner(System.in);
    static int front,rear=-1;
    static int size=0;
    static int []queue=null;

    public static void creation(){
        if(queue==null){
            System.out.print("\n\t\tEnter the size: ");
            size=s.nextInt();
            queue=new int[size];
            System.out.print("\n\t\tQueue created successfully...");
        }else{
            System.out.print("\n\t\tQueue already created");
        }
    }
    public static void enqueue(int data){
        if(front==-1&&rear==-1){
            rear++;
            queue[rear]=data;
            System.out.print("\n\t\tFirst Data added: "+queue[rear]);
        }else if(rear==size-1){
            System.out.print("\n\t\tQueue is full...");
        }else{
            rear++;
            queue[rear]=data;
            System.out.print("\n\t\tData added:"+queue[rear]);
        }
    }
    public static void dequeue(){
        if(front==-1&&rear==-1){
            System.out.print("\n\t\tQueue is Empty...");
            
        }else if(front==size-1){
            System.out.println("\n\t\tDeleted data: "+queue[front]);
            front=-1;rear=-1;

        }else{
            System.out.print("\n\t\tDeleted data: "+queue[front]);
            front++;
        }
    }
    public static void display(){
        if(front==-1&&rear==-1){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.println("\n\t\tData present in the Queue: ");
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
    public static void peek(){
        if(front==-1 && rear==-1){
            System.out.print("\n\t\tQueue is Empty");
        }else{
            System.out.print("\n\t\t top most data is : "+queue[front]);

        }
    }
    public static void isEmpty(){
        if(front==-1&& rear==-1){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.print("\n\t\tQueue is not Empty");
        }
    }
    public static void isFull(){
        if(rear==size-1){
            System.out.print("\n\t\tQueue is Full...");
        }else{
            System.out.print("Queue is Not full");
        }
    }



    public static void main(String args[]){
        boolean flag=true;
        do{
            System.out.print("\n\n\t\tQueue Using Stack");
            System.out.print("\n1)Creation\n2)Enqueue\n3)Dequeue\n4)Display\n5)Peek\n6)isEmpty\n7)isFull\n8)Exit");
            System.out.print("\nEnter the choice: ");
            int ch=s.nextInt();
            switch(ch){
                case 1:{
                    creation();
                    break;
                }
                case 2:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                        System.out.print("\n\t\tEnter the data: ");
                        int data=s.nextInt();
                        enqueue(data);
                    }
                    break;
                }
                case 3:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                    dequeue();
                    }
                    break;
                }
                case 4:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                    display();
                    }
                    break;
                }
                case 5:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                    peek();
                    }
                    break;
                }
                case 6:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                    isEmpty();
                    }
                    break;
                }
                case 7:{
                    if(queue==null) {
                        System.out.println("Create queue first");
                    }
                    else {
                    isFull();
                    }
                    break;
                }
                case 8:{
                    System.out.print("\n\t\tThank You..");
                    flag=false;
                    break;
                }
            }
        }while(flag);

    }
}
