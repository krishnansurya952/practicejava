import java.util.*;

public class Stack_using_Array{
    static Scanner s=new Scanner(System.in);
    static int size=0,top=1;
    static int[] stack=null;

    //-----------------creation---------------------
    public static void creation(){
        if(stack==null){
            System.out.print("\nEnter the size: ");
            size=s.nextInt();
            stack=new int[size];
            System.out.println("\n Stack created successfully...");

        }else{
            System.out.println("Stack already created....");
        }
    }

    //------------------push method-----------------------
    public static void push(int data){
        if(top==size-1){
            System.out.println("Stack OverFlow");
        }else{
            top++;
            stack[top]=data;
            System.out.println("Data pushed successfully...");
        }
    }

    //-------------------pop--------------------------
    public static void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }else{
            System.out.println("Delete data is : "+stack[top]);
            top--;
            
        }
    }

    //-------------------display------------------------
    public static void display(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Data present in stack");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }

    }
    //--------------------peek-------------------------------
    public static void peek(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Top must data is "+stack[top]);
        }
    }
    
    //---------------------isEmpty----------------------
    public static void isEmpty(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is not Empty");
        }
    }
    //----------------------isFull---------------------------
    public static void isFull(){
        if(top==size-1){
            System.out.println("Stack is Full");
        }else{
            System.out.println("Stack is not full");
        }
    }
    public static void main(String args[]){
        System.out.println("");
    }


}