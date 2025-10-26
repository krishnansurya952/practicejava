import java.util.*;



public class Stack_Arr{
    static Scanner s=new Scanner(System.in);
    static int size=0,top=-1;
    static int[] stack=null;

//--------------------creation----------

    public static void creation(){

        if(stack==null){
        System.out.print("\nEnter stack size: ");
        size=s.nextInt();
        stack=new int[size];
        System.out.print("\n\t\tStack created Successfully...");
        }
        else{
            System.out.print("\n\t\tStack already created...");
        }
    }

    //----------------------push----------------------
    public static void push(int data){
        if(top==size-1){
            System.out.print("\n\t\tStack overflow");
        }else{
            top++;
            stack[top]=data;
            System.out.print("\n\t\tData pushed succesfully");
        }
    }

    //------------------pop------------------------
    public static void pop(){
        if(top==-1){
            System.out.print("\n\t\tStack is underFlow");
        }else{
            System.out.print("\nDeleted data is : "+stack[top]);
            top--;
        }

    }




    //---------------------display---------------
    public static void display(){
        if(top==-1){
            System.out.print("\n\t\tStack is underflow");
        }else{

            System.out.println("\n\t\tData present in the stack");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }

    public static void peek(){
        if(top==-1){
            System.out.print("\n\t\tStack underflow");
        }else{
            System.out.print("\n\t\tTop most data is: "+stack[top]);
        }
    }
    //---------------------isEmpty-------------------------
    public static void isEmpty(){
        if(top==-1){
            System.out.print("\n\t\tStack is empty");
        }else{
            System.out.print("\n\t\tStack is not empty");
        }
    }

    //--------------------------isfull-------------------------

    public static void isFull(){
        if(top==size-1){
            System.out.print("\n\t\tStack is full");
        }else{
            System.out.print("\n\t\tStack is not full");
        }
    }




    public static void main(String args[]){
        boolean flag=true;
        do{
            System.out.print("\n\n\t\tSTACK USING ARRAY\n\n");

            

            System.out.print("1)Creation\n2)Push\n3)Pop\n4)Display\n5)Peek\n6)isEmpty\n7)isFull\n8)exit");

            System.out.print("\n\t\tEnter your Choice: ");
            int ch=s.nextInt();
            switch(ch){
                case 1:{
                    creation();
                    break;
                }case 2:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        System.out.print("\n\t\tEnter the data: ");
                        int data=s.nextInt();
                        push(data);
                    
                    }
                    break;
                    
                }case 3:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        pop();
                    }
                    break;

                }case 4:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        display();
                    }
                    break;

                }case 5:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        peek();
                    }
                    break;
                }case 6:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        isEmpty();
                    }
                    break;
                }case 7:{
                    if(stack==null){
                        System.out.print("\n\t\tCreate a stack First");
                    }else{
                        isFull();
                    }
                    break;
                }case 8:{
                    System.out.print("\n\t\tThank You...........");
                    flag=false;
                    break;
                }default :{
                    System.out.println("\t\tInvalid Choice");
                }
            }

        

        }while(flag);
        


    }

}