import java.util.*;




public class Circular_Queue_Using_Array {
    static Scanner s=new Scanner(System.in);
    static int front=-1,rear=-1,size=0;
    static int[] queue=null;

    public static void creation(){
        if(queue==null){
            System.out.print("\n\t\tEnter queue size:");
            size=s.nextInt();
            queue=new int[size];
            System.out.print("\n\t\tQueue created Successfully....");
        }else{
            System.out.print("\n\t\tQueue already exit in memory...");
        }
    }

    public static void enqueue(int data){
        if(front==-1 && rear==-1){
            front=0;rear=0;
            queue[rear]=data;
        }else if((front==0&&rear==size-1)|| (rear==front-1)){
            System.out.print("\n\t\tQueue is full...");
        }else if(rear==size-1){
            rear=0;
            queue[rear]=data;
        }else{
            rear++;
            queue[rear]=data;
        }
    }

    public static void dequeue(){
        if(front==-1&& rear==-1){
            System.out.print("\n\t\tQueue is empty...");
        }else if(front==rear){
            System.out.print("\n\t\tDelete data is: "+queue[front]);
            front=-1;rear=-1;
        }else if(front==size-1){
            System.out.print("\n\t\tDelete data is: "+queue[front]);
            front=0;
        }else{
            System.out.print("\n\t\tDelete data is: "+queue[front]);
            front++;
        }
    }

    public static void display(){
        if(front==-1&&rear==-1){
            System.out.print("\n\t\tQueue is Empty...");
        }else{
            System.out.print("\n\t\tData present in queue: ");
            int i=front;
            while(i!=rear){
                System.out.print(queue[i]+" ");
                if(i==size-1){
                    i=0;
                }else{
                    i++;
                }
            }
            System.out.print(queue[i]+"\n");
        }
    }

    public static void peek(){
        if(front==-1 && rear==-1){
            System.out.print("\n\t\tQueue is empty");
        }else{
            System.out.print("\n\t\tTop most data: "+queue[front]);
        }
    }

    public static void isEmpty(){
        if(front==-1 && rear==-1){
            System.out.print("\n\t\tQueue is empty");
        }else{
            System.out.print("\n\t\tQueue is not empty");
        }
    }

    public static void isFull(){
        if((front==0 && rear==size-1)||(rear==front-1)){
            System.out.print("\n\t\tQueue is Full");
        }else{
            System.out.print("\n\t\tQueue is not fully");
        }
    }



    public static void main(String args[]){
        boolean flag=true;
        do{
            System.out.print("\n\t\tQueue using Array");
            System.out.print("\n\1)Creation\n2)Enqueue\n3)Dequeue\n4)display\n5)peek\n6)isEmpty\n7)isFull\n8)Exit");
            System.out.print("\n\t\tEnter the choice: ");
            int ch=s.nextInt();
            switch(ch){
                case 1:{
                    creation();
                    break;
                }case 2:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate Queue first");
                    }else{
                        System.out.print("\n\t\tEnter the data: ");
                        int data=s.nextInt();
                        enqueue(data);
                    }
                    break;
                }
                case 3:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate queue first");
                    }else{
                        dequeue();
                    }
                    break;
                }case 4:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate queue first");
                    }else{
                        display();
                    }
                    break;
                }case 5:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate queue first");
                    }else{
                        peek();
                    }
                    break;
                }case 6:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate queue first");
                    }else{
                        isEmpty();

                    }
                    break;
                }
                case 7:{
                    if(queue==null){
                        System.out.print("\n\t\tCreate queue first");
                    }else{
                        isFull();
                    }
                    break;
                }
                case 8:{
                    System.out.print("\n\t\tThank You...");
                    flag=false;
                    break;
                }default:{
                    System.out.print("\n\t\tInvalid input");
                    break;
                }
            }

        }while(flag);

    }
    
}
